package com.macro.mall.service.impl;

import com.macro.mall.mapper.CmsPreferenceAreaMapper;
import com.macro.mall.model.CmsPreferenceArea;
import com.macro.mall.model.CmsPreferenceAreaExample;
import com.macro.mall.service.CmsPreferenceAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 商品优选管理Service实现类
 *
 * @author Starbamboo
 * @date 6/6/2022 1:24 PM
 */
@Service
public class CmsPreferenceAreaServiceImpl implements CmsPreferenceAreaService {
    @Autowired
    private CmsPreferenceAreaMapper preferenceAreaMapper;

    @Override
    public List<CmsPreferenceArea> listAll() {
        return preferenceAreaMapper.selectByExample(new CmsPreferenceAreaExample());
    }
}
