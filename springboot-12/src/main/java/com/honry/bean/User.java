package com.honry.bean;

import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/17 10:42
 * @Modifier: zhangkui
 * @version: V1.0
 */
@Document(collection = "c_user")
public class User implements Serializable {
    private static final long serialVersionUID = 3275193889785915045L;

    private String id;
    private String name;
    private int age;
    private String address;
    private String sex;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
