package com.macro.mall.service;

import com.macro.mall.model.CmsPreferenceArea;

import java.util.List;

/**
 * 商品优选管理Service
 *
 * @author Starbamboo
 * @date 6/6/2022 1:24 PM
 */
public interface CmsPreferenceAreaService {
    /**
     * 获取所有优选专区
     */
    List<CmsPreferenceArea> listAll();
}
