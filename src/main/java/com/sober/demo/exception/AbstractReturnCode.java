package com.sober.demo.exception;

/**
 * @Auther: Sober
 * @Date: 2018/10/31 14:50
 */
public class AbstractReturnCode {
    /**
     * 错误码
     */
    String errorCode = null;

    /**
     * 错误信息
     */
    String errorMsg = null;

    public AbstractReturnCode(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

}
