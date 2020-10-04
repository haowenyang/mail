package com.microservicemall.mallcoupon.dao;

import com.microservicemall.mallcoupon.entity.CouponSpuCategoryRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券分类关联
 * 
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 15:48:38
 */
@Mapper
public interface CouponSpuCategoryRelationDao extends BaseMapper<CouponSpuCategoryRelationEntity> {
	
}
