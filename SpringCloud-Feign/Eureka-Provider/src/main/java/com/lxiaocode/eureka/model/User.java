package com.lxiaocode.eureka.model;

import java.io.Serializable;

/**
 * @author lixiaofeng
 * @date 2020/11/9 上午9:09
 * @blog http://www.lxiaocode.com/
 */
public class User implements Serializable {
    private static final long serialVersionUID = 8687896380134944244L;

    private String name;

    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
