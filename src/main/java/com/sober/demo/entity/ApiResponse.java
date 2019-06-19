package com.sober.demo.entity;

import java.io.Serializable;

/**
 * 接口响应实体
 *
 */
public class ApiResponse implements Serializable {

    /**
     * 结果
     */
    private boolean result;
    /**
     * 消息
     */
    private String msg;
    /**
     * 数据
     */
    private Object data;

    public ApiResponse(boolean result, String msg, Object data) {
        this.result = result;
        this.msg = msg;
        this.data = data;
    }

    public static ApiResponse newInstance() {
        return new ApiResponse(false, null, null);
    }

    public static ApiResponse newSuccessInstance() {
        return ApiResponse.newSuccessInstance(null);
    }
    public static ApiResponse newSuccessInstance(Object data) {
        return new ApiResponse(true, null, data);
    }

    public static ApiResponse newFailInstance(String msg) {
        return new ApiResponse(false, msg, null);
    }

    public static ApiResponse newFailInstance(String msg, String code) {
        return new ApiResponse(false, msg, code);
    }

    public boolean isResult() {
        return result;
    }

    public void setResult(boolean result) {
        this.result = result;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
