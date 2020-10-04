package com.microservicemall.mallware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.microservicemall.common.utils.PageUtils;
import com.microservicemall.mallware.entity.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-28 16:29:50
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

