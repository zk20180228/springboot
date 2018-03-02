package com.honry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/9 20:26
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Controller
@RequestMapping("/thymeleaf")
public class WebController {


    @RequestMapping("/toThymeleafUI01")
    public String toThymeleafUI01(HttpServletRequest request){

        request.setAttribute("title","hello thymeleaf01 !");
        return "index";
    }


    @RequestMapping("/toThymeleafUI02")
    public String toThymeleafUI02(ModelMap map){

        map.addAttribute("title","hello thymeleaf02 !");
        return "page/index";
    }


}
