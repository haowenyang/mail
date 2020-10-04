package com.microservicemall.mallware.dao;

import com.microservicemall.mallware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 16:29:50
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
