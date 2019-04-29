package com.group7.edu.exception;

import com.group7.edu.utils.ResultData;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //响应json
public class MyExceptionHandler {

//    @ExceptionHandler(AuthorizationException.class)
//    public ResultData handlerException(AuthorizationException e){
//        e.printStackTrace();
//        return ResultData.isFailure("没有访问权限");
//    }
//    全局异常处理
    @ExceptionHandler(Exception.class)
    public ResultData handlerException(Exception e){
        System.out.println("-------------------------------->aaa");
        e.printStackTrace();
        return ResultData.isFailure(e.getMessage());
    }





















}
