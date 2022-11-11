package com.example.onlineClass.response;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 钟
 */
@ControllerAdvice
public class CommonExceptionHandler {

    @ExceptionHandler(MyException.class)
    @ResponseBody
    public ResponseResult<Void> exceptionHandle(MyException e){
        ResultCode rc = e.getExceptionEnum();
        return new ResponseResult<>(rc);
    }
}
