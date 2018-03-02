package com.honry.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Description: @WebServlet自定义一个servlet
 * @Author: zhangkui
 * @CreateDate: 2018/1/11 11:27
 * @Modifier: zhangkui
 * @version: V1.0
 */
@WebServlet(name = "helloServlet",urlPatterns = {"/helloServlet/*"})
public class HelloServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Enumeration<String> parameterNames = req.getParameterNames();
        while(parameterNames.hasMoreElements()){
            String element = parameterNames.nextElement();
            String value = req.getParameter(element);
            System.out.println(value);
        }

        //注意，springboot种的servlet不能转发，或者重定向
        String method = req.getMethod();
        if("POST".equalsIgnoreCase(method)){
            //
            System.out.println("do post !");
            //重定向
            resp.sendRedirect(this.getServletContext().getContextPath()+"/pages/index.jsp");
        }else{
            System.out.println("do get !");
            System.out.println(this.getServletContext().getContextPath()+"/pages/index.jsp");
            //转发
            //req.getRequestDispatcher(this.getServletContext().getContextPath()+"/pages/index.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            this.doPost(req,resp);
    }
}
