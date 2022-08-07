package com.itheima;

import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional
public class DaoTest {

    @Autowired
    private BookService bookService;

    @Test
    void testSave(){
        Book book = new Book();
        book.setId(1);
        book.setName("springboot");
        book.setType("springboot");
        book.setDescription("springboot");

        bookService.save(book);
    }
}
