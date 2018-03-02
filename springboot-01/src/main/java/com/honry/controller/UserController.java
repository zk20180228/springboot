package com.honry.controller;

import com.honry.bean.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/9 17:18
 * @Modifier: zhangkui
 * @version: V1.0
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Value("${com.honry}")
    private String userName;

    @RequestMapping("/testStart")
    public String testStart(@RequestParam("name")  String name){

        return "hello "+name+" !";
    }


    @RequestMapping("/testRestful/{name}/{age}")
    public User testRestful(@PathVariable("name") String name,@PathVariable("age") Integer age){

        User user = new User();
        user.setName(name);
        user.setDate(new Date());
        user.setAge(age);

        user.setName(userName);
        return user;
    }


}
