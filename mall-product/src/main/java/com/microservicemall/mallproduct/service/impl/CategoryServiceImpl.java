package com.microservicemall.mallproduct.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.microservicemall.common.utils.PageUtils;
import com.microservicemall.common.utils.Query;

import com.microservicemall.mallproduct.dao.CategoryDao;
import com.microservicemall.mallproduct.entity.CategoryEntity;
import com.microservicemall.mallproduct.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;
    @Override
    public List<CategoryEntity> listTree() {
        //1.查询当前所有的分类信息
        List<CategoryEntity> categoryEntityList = categoryDao.selectList(null);
        //2.组装成树形结构
        List<CategoryEntity> level = categoryEntityList.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map((categoryEntity)->{
            categoryEntity.setChildren(getChildren(categoryEntity,categoryEntityList));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            return menu1.getSort() - menu2.getSort();
        }).collect(Collectors.toList());
        return level;
    }
    //递归获取子树
    private List<CategoryEntity> getChildren(CategoryEntity root, List<CategoryEntity> categoryEntityList) {
        List<CategoryEntity> collect = categoryEntityList.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid().equals(root.getCatId());
        }).map((categoryEntity)->{
            categoryEntity.setChildren(getChildren(categoryEntity,categoryEntityList));
            return categoryEntity;
        }).sorted((menu1,menu2)->{
            return (menu1.getSort()==null?0:menu1.getSort()) - (menu2.getSort()==null?0:menu2.getSort());
        }).collect(Collectors.toList());
        return collect;
    }

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

}