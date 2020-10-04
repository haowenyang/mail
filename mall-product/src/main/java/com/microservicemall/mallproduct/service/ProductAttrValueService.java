package com.microservicemall.mallproduct.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.microservicemall.common.utils.PageUtils;
import com.microservicemall.mallproduct.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author yangwenhao
 * @email yangwenhao2019@163.com
 * @date 2020-04-22 14:45:49
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

