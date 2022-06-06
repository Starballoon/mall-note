package com.macro.mall.dto;

import com.macro.mall.model.SmsFlashPromotionSession;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 包含商品数量的场次信息
 *
 * @author Starbamboo
 * @date 6/5/2022 3:50 PM
 */
@Setter
@Getter
public class SmsFlashPromotionSessionDetail {
    @ApiModelProperty("商品数量")
    private Long productCount;
}