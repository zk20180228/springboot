package com.honry.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/9 19:28
 * @Modifier: zhangkui
 * @version: V1.0
 */
//@RestController---->因为要跳转页面，所以不能用RestController
@Controller
@RequestMapping("/freemark")
public class WebController {

    @RequestMapping("/toFreemarkUI01")
    public String toFreemarkUI01(HttpServletRequest request){
        //freemark也是用于request
        request.setAttribute("title","hello freemark01 !");
        return "index";//会直接去templates下找对应的ftl文件，注意，不要加/，linux下会出错
    }


    @RequestMapping("/toFreemarkUI02")
    public String toFreemarkUI02(ModelMap map){

        //ModelMap只能用于设置k-v键值
        map.addAttribute("title","hello freemark02 !");
        return "page/index";//注意不能加/
    }

}
