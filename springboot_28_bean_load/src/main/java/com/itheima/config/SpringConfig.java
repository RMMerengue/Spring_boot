package com.itheima.config;

import com.itheima.bean.Cat;
import com.itheima.bean.Mouse;
import com.itheima.bean.MyImportSelector;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Import;

//@Import(MyImportSelector.class)
//@Import(Mouse.class)
@ComponentScan("com.itheima.bean")
public class SpringConfig {
//    @Bean
////    @ConditionalOnClass(Mouse.class)
//    @ConditionalOnBean(name="com.itheima.bean.Mouse")
//    @ConditionalOnMissingClass("com.itheima.bean.Dog")
//    public Cat Tom(){
//        return new Cat();
//    }
}
