package com.macro.mall.common.api;

/**
 * 常用API返回对象接口
 * @author Starbamboo
 * @date 6/4/2022 10:55 PM
 */
public interface IErrorCode {
    /**
     * 返回码
     */
    long getCode();

    /**
     * 返回信息
     */
    String getMessage();
}
