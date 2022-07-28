package com.itheima.controller.bak;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//Rest模式
//@RestController
//@RequestMapping("/books")
public class BookController2 extends BaseClass{
//创建记录日志的对象

    @GetMapping
    public String getById(){
        System.out.println("springboot is running...");

        log.debug("debug...");
        log.info("info...");
        log.warn("warn...");
        log.error("error...");



        return "springboot is running...";
    }
}
