package com.example.onlineClass.response;

import org.springframework.http.HttpStatus;

/**
 * @author 钟
 */

public enum ResultCode {
    /** 登录 */
    LOGIN_SUCCESS(true, HttpStatus.OK, "登录成功"),
    LOGIN_ACCOUNT_ERROR(false, 10001, "账号不存在"),
    LOGIN_PASSWORD_FAIL(false, 10002, "密码错误"),
    TOKEN_CREATE_ERROR(false, 10003, "token生成失败");
    
    /** 操作是否成功 */
    boolean success;

    /** 操作代码 */
    int code;

    /** 提示信息 */
    String message;

    /** 返回信息 */
    ResultCode(boolean success, int code, String message){
        this.success = success;
        this.code = code;
        this.message = message;
    }
    ResultCode(boolean success, HttpStatus code, String message){
        this.success = success;
        this.code = code.value();
        this.message = message;
    }
    /** 返回 操作是否成功 */
    public boolean isSuccess() {
        return success;
    }
    /** 返回 操作代码 */
    public int getCode() {
        return code;
    }
    /** 返回 提示信息 */
    public String getMessage() {
        return message;
    }
}