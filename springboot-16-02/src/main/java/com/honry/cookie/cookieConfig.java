package com.honry.cookie;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.web.http.CookieHttpSessionStrategy;
import org.springframework.session.web.http.DefaultCookieSerializer;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/31 15:34
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Configuration
public class cookieConfig {

    @Value("spring.session.cookieName")
    private String cookieName;


    @Bean
    public CookieHttpSessionStrategy cookieHttpSessionStrategy(){
        CookieHttpSessionStrategy strategy=new CookieHttpSessionStrategy();
        DefaultCookieSerializer cookieSerializer=new DefaultCookieSerializer();
        cookieSerializer.setCookieName(cookieName);//cookies名称
        strategy.setCookieSerializer(cookieSerializer);
        return strategy;
    }

}
