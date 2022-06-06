package com.macro.mall.dto;

import com.macro.mall.model.PmsProductCategory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 包含子级分类的商品分类
 *
 * @author Starbamboo
 * @date 6/5/2022 3:46 PM
 */
@Getter
@Setter
public class PmsProductCategoryWithChildrenItem extends PmsProductCategory{
    @ApiModelProperty("子级分类")
    private List<PmsProductCategory> children;
}
