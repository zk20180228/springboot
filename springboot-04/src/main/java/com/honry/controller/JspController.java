package com.honry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/10 9:33
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Controller
@RequestMapping("/jspSupport")
public class JspController {


    @RequestMapping("/toJspUI")
    public String toJspUI(ModelMap map){

        map.put("title","hello jsp !");
        return "index";
    }



}
