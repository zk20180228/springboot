package com.honry.utils;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @Description: cors支持，自定义一个类继承WebMvcConfigurerAdapter,添加可以被跨域调用的url和指定的ip
 * @Author: zhangkui
 * @CreateDate: 2018/1/12 15:26
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Configuration
public class CorsUtils extends WebMvcConfigurerAdapter{


    @Override
    public void addCorsMappings(CorsRegistry registry) {
        //如果是本机，不识别当前自己机器的ip，如http://192.168.0.26:9000，但是识别localhost
        //*代表所有机器
        registry.addMapping("/cors/*").allowedOrigins("*");
    }
}
