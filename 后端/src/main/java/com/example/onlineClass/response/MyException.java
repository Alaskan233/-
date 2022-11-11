package com.example.onlineClass.response;

/**
 * @author 钟
 */
public class MyException extends RuntimeException{
    private ResultCode resultCode;

    public MyException() {}

    public MyException(ResultCode resultCode) {
        this.resultCode = resultCode;
    }

    public ResultCode getExceptionEnum() {
        return resultCode;
    }

    public void setExceptionEnum(ResultCode resultCode) {
        this.resultCode = resultCode;
    }
}