package com.honry.bean;

import java.io.Serializable;

/**
 * @Description:
 * @Author: zhangkui
 * @CreateDate: 2018/1/30 19:38
 * @Modifier: zhangkui
 * @version: V1.0
 */
public class User implements Serializable {

    private static final long serialVersionUID = 6960581522747035155L;
    private String name;
    private int age;
    private String address;
    private int sex;

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

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", sex=" + sex +
                '}';
    }
}
