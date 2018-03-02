package com.honry.controller;

import com.honry.bean.User;
import org.springframework.web.bind.annotation.*;

import java.util.*;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/12 14:46
 * @Modifier: zhangkui
 * @version: V1.0
 */
//@CrossOrigin(maxAge = 3600)
@RestController
@RequestMapping("/cors")
public class CorsController {

    //Error:(20, 5) java: 对于属性<clinit>, 注释org.springframework.web.bind.annotation.CrossOrigin缺少值
    //报错原因是：jdk需要1.8的
    //@CrossOrigin(origins = "http://192.168.0.26:9000",maxAge = 3600)
    @RequestMapping("/getUsers")
    public Map<String,Object> getUsers(String name, @RequestParam(defaultValue = "0") int age){

        List<User> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            list.add(new User(name+1,age+1,new Date()));
        }

        Map<String, Object> map = new HashMap<>();
        map.put("total",list.size());
        map.put("rows",list);

        return map;
    }
}
