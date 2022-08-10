package com.itheima.controller;


import com.itheima.domain.Book;
import com.itheima.service.BookService;
import com.itheima.service.MsgService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/msg")
public class MsgController {
    @Autowired
    private MsgService msgService;

    @GetMapping("{id}")
    public String get(@PathVariable String tel){
        return msgService.get(tel);
    }

    @PostMapping
    public boolean save(String tel, String code){
        return msgService.check(tel,code);
    }

}
