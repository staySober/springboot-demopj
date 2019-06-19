package com.sober.demo.exception;

/**
 * 业务异常
 */
public class ServiceRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 4474665452231795065L;

    private String code;

    private String msg;

    public ServiceRuntimeException(AbstractReturnCode returnCode, String msg) {
        super(msg);
        this.code = returnCode.errorCode;
        this.msg = msg;
    }

    public ServiceRuntimeException(String code, String msg) {
        super(msg);
        this.code = code;
        this.msg = msg;
    }

    public ServiceRuntimeException(AbstractReturnCode returnCode) {
        super(returnCode.errorMsg);
        this.code = returnCode.errorCode;
        this.msg = returnCode.errorMsg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}