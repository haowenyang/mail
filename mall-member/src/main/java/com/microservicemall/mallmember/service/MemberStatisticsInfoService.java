package com.microservicemall.mallmember.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.microservicemall.common.utils.PageUtils;
import com.microservicemall.mallmember.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 16:02:54
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

