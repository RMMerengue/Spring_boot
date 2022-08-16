package com.itheima.app;

import com.itheima.config.SpringConfig3;
import com.itheima.config.SpringConfig32;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App32 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig32.class);
        String[] names = ctx.getBeanDefinitionNames();
        for(String name : names){
            System.out.println(name);
        }
    }
}
