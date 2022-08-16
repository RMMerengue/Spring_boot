package com.itheima.bean;

import org.springframework.stereotype.Component;

@Component("Tom")
public class Cat {
    public Cat(){

    }
    int age;
    public Cat(int age){
        this.age = age;
    }
}
