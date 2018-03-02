package com.honry.rest.service;

import com.honry.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: rest服务提供者
 * @Author: zhangkui
 * @CreateDate: 2018/1/30 19:35
 * @Modifier: zhangkui
 * @version: V1.0
 */
@RestController
@RequestMapping("helloRest")
public class HelloRestController {



    @RequestMapping(value="findAllUsers",method = {RequestMethod.GET})
    public List<User> findAllUsers(){

        List<User> users = new ArrayList<>();
        for(int i=0;i<=10;i++){
           User user=new User ();
           user.setAddress("贫民窟"+i+"区");
           user.setAge(i);
           user.setName("老"+i);
           user.setSex(i%2==0?1:0);
           users.add(user);
       }
         return users;
    }

    @RequestMapping(value="findUserByAge/{age}",method = {RequestMethod.POST})
    public User findUserByAge(@PathVariable("age") int age){

        Map<Integer,User> map = new HashMap<Integer, User>();
        for(int i=0;i<=10;i++){
            User user=new User ();
            user.setAddress("贫民窟"+i+"区");
            user.setAge(i);
            user.setName("老"+i);
            user.setSex(i%2==0?1:0);
            map.put(user.getAge(),user);
        }

        return map.get(age);
    }




}
