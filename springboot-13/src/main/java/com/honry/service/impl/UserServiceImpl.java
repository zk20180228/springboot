package com.honry.service.impl;

import com.honry.bean.User;
import com.honry.dao.UserDao;
import com.honry.service.UserService;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description: 我们一般在service层使用缓存
 * @Author: zhangkui
 * @CreateDate: 2018/1/17 15:03
 * @Modifier: zhangkui
 * @version: V1.0
 */
@CacheConfig(cacheNames = "users")//应用的缓存策略，和配置文件的缓存策略的name一直
@Service("/userService")
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @CachePut(key="'user_'+#user.getId()")
    @Override
    public int addUser(User user) {

        return userDao.addUser(user);
    }

    @CacheEvict(key = "'user_'+#id") //key是缓存的标识。user的单引号必须加，否则会认为是对象，会报错。#引入参数。参数值相当于user_xxx
    @Override
    public int delUserById(int id) {

        return userDao.delUserById(id);
    }

    @CachePut(key ="'user_'+#user.getId()")
    @Override
    public int updateUserByid(User user) {

        return userDao.updateUserByid(user);
    }

    @Cacheable(key = "'user_findAllUsers'")//必须加引号
    @Override
    public List<User> findAllUsers() {

        return userDao.findAllUsers();
    }

    @Cacheable(key="'user_getLastId'")
    @Override
    public Long getLastId() {

        return userDao.getLastId();
    }
}
