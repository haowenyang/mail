package com.microservicemall.mallware.dao;

import com.microservicemall.mallware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 16:29:50
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
