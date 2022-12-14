package com.itheima;

import com.itheima.testcase.domain.BookCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

//@SpringBootTest(properties = {"test.prop=testValue1"})
@SpringBootTest(properties= {"test.prop=testValue1"}, args={"--test.prop=testValue2"})
public class TestApplicationTests {

    @Value("${test.prop}")
    private String msg;

    private BookCase bookCase;

    @Test
    void testProperties() {
        System.out.println(msg);
        System.out.println(bookCase);
    }

}
