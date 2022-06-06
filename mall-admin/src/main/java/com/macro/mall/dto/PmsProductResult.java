package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 查询单个商品修改后返回的结果
 *
 * @author Starbamboo
 * @date 6/5/2022 3:47 PM
 */
@Getter
@Setter
public class PmsProductResult extends PmsProductParam {
    @ApiModelProperty("商品所选分类的父id")
    private Long cateParentId;
}
