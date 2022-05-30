package com.lucky.boot.bean;

import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @date 2022/5/29 15:27
 * @author: wj
 */
public class Dog {

    private String name;
    private Integer age;

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
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
