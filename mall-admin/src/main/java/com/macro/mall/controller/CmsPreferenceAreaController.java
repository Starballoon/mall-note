package com.macro.mall.controller;

import com.macro.mall.common.api.CommonResult;
import com.macro.mall.model.CmsPreferenceArea;
import com.macro.mall.service.CmsPreferenceAreaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 商品优选管理Controller
 *
 * @author Starbamboo
 * @date 6/6/2022 1:21 PM
 */
@Controller
@Api(tags = "CmsPreferenceAreaController", description = "商品优选管理")
@RequestMapping("/prefrenceArea")
// TODO 接口拼写？
public class CmsPreferenceAreaController {
    @Autowired
    private CmsPreferenceAreaService preferenceAreaService;

    @ApiOperation("获取所有商品优选")
    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<CmsPreferenceArea>> listAll() {
        List<CmsPreferenceArea> preferenceAreaList = preferenceAreaService.listAll();
        return CommonResult.success(preferenceAreaList);
    }
}
