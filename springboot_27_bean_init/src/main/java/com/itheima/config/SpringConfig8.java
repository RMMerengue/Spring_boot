package com.itheima.config;

import com.itheima.bean.service.impl.BookServiceImpl1;
import org.springframework.context.annotation.Import;

@Import({BookServiceImpl1.class})
public class SpringConfig8 {
}
