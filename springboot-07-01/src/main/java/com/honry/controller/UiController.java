package com.honry.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/12 14:58
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Controller
@RequestMapping("/ui")
public class UiController {


    @RequestMapping("/toIndexUI")
    public String toIndexUI(){


        return "index";
    }




}
