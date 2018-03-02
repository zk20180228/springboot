package com.honry.bean;

import java.io.Serializable;
import java.util.Date;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/9 17:20
 * @Modifier: zhangkui
 * @version: V1.0
 */
public class User implements Serializable {
    private static final long serialVersionUID = -4645138164185962194L;

    private String name;
    private Integer age;
    private Date date;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
