package com.honry.dao.impl;

import com.honry.bean.User;
import com.honry.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/12 19:44
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {


    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addUser(User user) {

        String sql="insert into tb_user(username,password,phone,email,created,updated) values(?,?,?,?,?,?)";


        return jdbcTemplate.update(sql,user.getUserName(),user.getPassword(),user.getPhone(),user.getEmail(),user.getCreated(),user.getUpdated());
    }

    @Override
    public int delUserById(int id) {

        String sql ="delete from tb_user where id=?";

        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updateUserByid(User user) {

        String sql ="update tb_user set username=?,updated=? where id=?";

        return jdbcTemplate.update(sql,user.getUserName(),user.getUpdated(),user.getId());
    }

    @Override
    public List<User> findAllUsers() {

        String sql ="select * from tb_user";

        return jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class));
    }

    @Override
    public Long getLastId() {

        String sql ="SELECT max(id) as id FROM tb_user";

        return jdbcTemplate.queryForObject(sql,Long.class);
    }
}
