package com.microservicemall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.microservicemall.common.utils.PageUtils;
import com.microservicemall.mallware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 16:29:50
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

