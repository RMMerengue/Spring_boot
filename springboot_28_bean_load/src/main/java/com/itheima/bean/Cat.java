package com.itheima.bean;

import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication;
import org.springframework.stereotype.Component;

@Component("Tom")
@ConditionalOnBean(name = "jerry")
@ConditionalOnWebApplication
public class Cat {
}
