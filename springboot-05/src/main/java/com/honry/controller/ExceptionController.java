package com.honry.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/10 20:46
 * @Modifier: zhangkui
 * @version: V1.0
 */
@RestController
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/runtime")
    public Object testException(){
        int i=0;

        try {
            i=1/0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("error");//抛出的异常会被统一拦截返回
        }

        return i;
    }


    @RequestMapping("/error")
    public Object testError(){

        int i=1/0;//没有抛出，但发生了异常也会被统一处理

        return i;
    }
}
