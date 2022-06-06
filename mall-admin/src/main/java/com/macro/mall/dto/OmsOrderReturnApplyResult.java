package com.macro.mall.dto;

import com.macro.mall.model.OmsCompanyAddress;
import com.macro.mall.model.OmsOrderReturnApply;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

/**
 * 申请信息封装
 * @author Starbamboo
 * @date 6/5/2022 3:32 PM
 */
@Getter
@Setter
public class OmsOrderReturnApplyResult extends OmsOrderReturnApply {
    @ApiModelProperty(value = "公司收货地址")
    private OmsCompanyAddress companyAddress;
}
