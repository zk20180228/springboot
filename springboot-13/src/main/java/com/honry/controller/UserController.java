package com.honry.controller;

import com.honry.bean.User;
import com.honry.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/17 15:20
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("/addUser")
    public void addUser(User user){

        userService.addUser(user);
    }

    @RequestMapping("/delUserById")
    public void delUserById(int id){


        userService.delUserById(id);
    }

    @RequestMapping("/updateUserByid")
    public void updateUserByid(User user){

        userService.updateUserByid(user);
    }

    @RequestMapping("/findAllUsers")
    @ResponseBody
    public List<User> findAllUsers(){

        return userService.findAllUsers();
    }

    @RequestMapping("/getLastId")
    @ResponseBody
    public Long getLastId(){

        return userService.getLastId();
    }








}
