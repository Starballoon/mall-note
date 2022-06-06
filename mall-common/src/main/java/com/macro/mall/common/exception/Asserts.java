package com.macro.mall.common.exception;

import com.macro.mall.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API异常
 *
 * @author Starbamboo
 * @date 6/4/2022 11:28 PM
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
