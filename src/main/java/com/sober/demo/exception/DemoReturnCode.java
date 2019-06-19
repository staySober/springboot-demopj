package com.sober.demo.exception;


/**
 * @Auther: Sober
 * @Date: 2018/10/31 14:49
 */
public class DemoReturnCode extends AbstractReturnCode {

    public DemoReturnCode(String errorCode, String errorMsg) {
        super(errorCode, errorMsg);
    }

    private static final String _SERVER_ERROR_CODE = "0000001";

    /**
     *  业务异常
     */
    public static final DemoReturnCode _SERVER_ERROR = new DemoReturnCode(_SERVER_ERROR_CODE, "系统异常");

}
