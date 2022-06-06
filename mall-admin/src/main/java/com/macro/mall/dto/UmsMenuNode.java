package com.macro.mall.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * 后台菜单节点封装
 *
 * @author Starbamboo
 * @date 6/5/2022 3:52 PM
 */
@Getter
@Setter
public class UmsMenuNode {
    @ApiModelProperty(value = "子级菜单")
    private List<UmsMenuNode> children;
}
