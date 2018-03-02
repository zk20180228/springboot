package com.honry.service;

import com.honry.bean.User;

import java.util.List;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/17 15:02
 * @Modifier: zhangkui
 * @version: V1.0
 */
public interface UserService {

    public int addUser(User user);

    public int delUserById(int id);

    public int updateUserByid(User user);

    public List<User> findAllUsers();

    public Long getLastId();
}
