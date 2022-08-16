package com.itheima.app;

import com.itheima.bean.Cat;
import com.itheima.bean.Mouse;
import com.itheima.config.SpringConfig4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App5 {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig4.class);
        ctx.registerBean("Tom", Cat.class, 0);
        ctx.registerBean("Tom", Cat.class, 1);
        ctx.registerBean("Tom", Cat.class, 2);
        ctx.register(Mouse.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }
}
