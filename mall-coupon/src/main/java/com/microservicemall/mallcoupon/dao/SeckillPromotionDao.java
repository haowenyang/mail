package com.microservicemall.mallcoupon.dao;

import com.microservicemall.mallcoupon.entity.SeckillPromotionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动
 * 
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 15:48:38
 */
@Mapper
public interface SeckillPromotionDao extends BaseMapper<SeckillPromotionEntity> {
	
}
