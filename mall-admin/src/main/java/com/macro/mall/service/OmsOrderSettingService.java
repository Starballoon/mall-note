package com.macro.mall.service;

import com.macro.mall.model.OmsOrderSetting;

/**
 * 订单设置管理Service
 *
 * @author Starbamboo
 * @date 6/6/2022 1:37 PM
 */
public interface OmsOrderSettingService {
    /**
     * 获取指定订单设置
     */
    OmsOrderSetting getItem(Long id);

    /**
     * 修改指定订单设置
     */
    int update(Long id, OmsOrderSetting orderSetting);
}
