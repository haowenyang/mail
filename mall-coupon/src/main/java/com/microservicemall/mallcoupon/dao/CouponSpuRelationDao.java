package com.microservicemall.mallcoupon.dao;

import com.microservicemall.mallcoupon.entity.CouponSpuRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券与产品关联
 * 
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 15:48:38
 */
@Mapper
public interface CouponSpuRelationDao extends BaseMapper<CouponSpuRelationEntity> {
	
}
