package com.microservicemall.mallmember.dao;

import com.microservicemall.mallmember.entity.MemberCollectSubjectEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员收藏的专题活动
 * 
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 16:02:54
 */
@Mapper
public interface MemberCollectSubjectDao extends BaseMapper<MemberCollectSubjectEntity> {
	
}
