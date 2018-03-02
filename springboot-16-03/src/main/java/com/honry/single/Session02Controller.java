package com.honry.single;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/31 14:30
 * @Modifier: zhangkui
 * @version: V1.0
 */
@RestController
@RequestMapping("session")
public class Session02Controller {

    @RequestMapping("testSession")
    public void testSession(HttpSession session,String debugInfo){
        System.out.println(debugInfo);
        System.out.println(session.getId());
    }

}
