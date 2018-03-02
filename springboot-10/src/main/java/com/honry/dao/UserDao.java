package com.honry.dao;

import com.honry.bean.User;

import java.util.List;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/12 19:41
 * @Modifier: zhangkui
 * @version: V1.0
 */
public interface UserDao {

   public int addUser(User user);

   public int delUserById(int id);

   public int updateUserByid(User user);

   public List<User> findAllUsers();

   public Long getLastId();

   void createTable();

}
