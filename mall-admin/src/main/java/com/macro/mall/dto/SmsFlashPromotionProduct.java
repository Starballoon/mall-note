package com.macro.mall.dto;

import com.macro.mall.model.PmsProduct;
import com.macro.mall.model.SmsFlashPromotionProductRelation;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 限时购商品信息封装
 *
 * @author Starbamboo
 * @date 6/5/2022 3:50 PM
 */
@Getter
@Setter
public class SmsFlashPromotionProduct extends SmsFlashPromotionProductRelation {
    @ApiModelProperty("关联商品")
    private PmsProduct product;
}
