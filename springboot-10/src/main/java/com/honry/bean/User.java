package com.honry.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/12 19:37
 * @Modifier: zhangkui
 * @version: V1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 1198769393688802665L;
    private int id;
    private String userName;
    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
