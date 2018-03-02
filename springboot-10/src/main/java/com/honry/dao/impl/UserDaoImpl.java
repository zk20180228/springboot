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
    public void createTable(){
        StringBuffer sb = new StringBuffer();
        sb.append(" CREATE TABLE t_user ( ");
        sb.append("         id bigint(20) NOT NULL AUTO_INCREMENT, ");
        sb.append("         username varchar(50), ");
        sb.append("         password varchar(32) ");
        sb.append(" ) ");
        jdbcTemplate.execute(sb.toString());
    }


    @Override
    public int addUser(User user) {

        String sql="insert into t_user(username,password) values(?,?)";


        return jdbcTemplate.update(sql,user.getUserName(),user.getPassword());
    }

    @Override
    public int delUserById(int id) {

        String sql ="delete from t_user where id=?";

        return jdbcTemplate.update(sql,id);
    }

    @Override
    public int updateUserByid(User user) {

        String sql ="update t_user set username=? where id=?";

        return jdbcTemplate.update(sql,user.getUserName(),user.getId());
    }

    @Override
    public List<User> findAllUsers() {

        String sql ="select * from t_user";

        return jdbcTemplate.query(sql,new BeanPropertyRowMapper(User.class));
    }

    @Override
    public Long getLastId() {

        String sql ="SELECT max(id) as id FROM t_user";

        return jdbcTemplate.queryForObject(sql,Long.class);
    }
}
