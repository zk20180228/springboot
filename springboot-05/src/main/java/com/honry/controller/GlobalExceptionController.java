package com.honry.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;


/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/10 11:54
 * @Modifier: zhangkui
 * @version: V1.0
 */
@ControllerAdvice
public class GlobalExceptionController {


    Logger logger = LoggerFactory.getLogger(GlobalExceptionController.class);

    /**
     * RuntimeException的方法：该方法捕捉程序在运行中的异常，包括try。。。catch块里面声明抛出的异常对象，
     * 方便发生异常时，统一返回异常标识。返回json格式的数据，类似于500
     * @return
     */
    @ExceptionHandler({RuntimeException.class})
    @ResponseBody
    public Object runtimeExceptionMessage(RuntimeException runtimeException){
        Map<String, Object> map = new HashMap<>();
        logger.info("发生了runtimeException....................");
        map.put("message",runtimeException.getMessage());
        logger.error(runtimeException.getMessage());
        return map;
    }

    /**
     * RuntimeException的方法，该方法只用于访问地址不存在时，跳转页面类似于404
     * @return
     */
    @ExceptionHandler({Exception.class})
    @ResponseStatus(HttpStatus.OK)
    public String toExceptionUI(HttpServletRequest request, Exception exception){

        //这句话不起作用，改方法只用于访问地址不存在时，跳转页面
        request.setAttribute("error","请求地址不存在!");
        return "error";
    }




}
