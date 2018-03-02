package com.honry.single;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/31 14:00
 * @Modifier: zhangkui
 * @version: V1.0
 */
@RestController
@RequestMapping("session")
public class SessionController {

    @RequestMapping("testSession")
    public void testSession(HttpSession session){
        Object user = session.getAttribute("USER");
        System.out.println(user);
        System.out.println(session.getId()+"...............................");
    }



}
