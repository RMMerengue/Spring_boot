package com.itheima.config;

import com.itheima.bean.DogFactoryBean;
import com.itheima.bean.MyImportSelector;
import org.springframework.context.annotation.Import;

@Import(MyImportSelector.class)
public class SpringConfig6 {
}
