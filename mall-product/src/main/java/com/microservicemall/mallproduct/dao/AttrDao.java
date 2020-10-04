package com.microservicemall.mallproduct.dao;

import com.microservicemall.mallproduct.entity.AttrEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品属性
 * 
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-22 14:45:49
 */
@Mapper
public interface AttrDao extends BaseMapper<AttrEntity> {
	
}
