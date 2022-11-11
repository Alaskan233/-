package com.example.onlineClass.response;

/**
 * @author 钟
 * 返回类
 */
public class ResponseResult<T> {
    /** 是否操作成功 */
    private boolean success;

    /** 操作状态码 */
    private int code;

    /** 操作结果详细信息 */
    private String message;

    /** 实体类数据 */
    private T data;

    public ResponseResult(ResultCode rc) {
        this.success = rc.isSuccess();
        this.code = rc.getCode();
        this.message = rc.getMessage();
    }

    public ResponseResult(ResultCode rc, T data) {
        this.success = rc.isSuccess();
        this.code = rc.getCode();
        this.message = rc.getMessage();
        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
