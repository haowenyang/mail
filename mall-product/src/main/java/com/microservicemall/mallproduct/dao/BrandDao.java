package com.microservicemall.mallproduct.dao;

import com.microservicemall.mallproduct.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-22 14:45:49
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
