package com.honry.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/11 11:54
 * @Modifier: zhangkui
 * @version: V1.0
 */
@WebListener
public class HelloListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {

        System.out.println("web上下文被创建!");

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("web上下文被销毁！");
    }
}
