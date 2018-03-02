package com.honry.rest.client;

import com.honry.bean.User;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/30 20:04
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Component
public class RestCilentController {

    @Resource
    private RestTemplateBuilder restTemplateBuilder;

    public void findAllUsers(){

        List<User> list= (List<User>) restTemplateBuilder.build().getForObject("http://localhost:8890/helloRest/findAllUsers", List.class,"");

        System.out.println(list);
    }


    public void findUserByAge(){

        User user = restTemplateBuilder.build().postForObject("http://localhost:8890/helloRest/findUserByAge/3",null, User.class);
        System.out.println(user);

    }

}
