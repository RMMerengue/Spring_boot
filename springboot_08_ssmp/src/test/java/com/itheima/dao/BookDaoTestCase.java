package com.itheima.dao;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookDaoTestCase {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetById(){
        System.out.println(bookDao.selectById(1));
    }

    @Test
    void testSave(){
       Book book = new Book();
       book.setType("test date 123");
       book.setName("test data 123");
       book.setDescription("test data 123");
       bookDao.insert(book);
    }

    @Test
    void testUpdate(){
        Book book = new Book();
        book.setId(13);
        book.setType("test date 321");
        book.setName("test data 321");
        book.setDescription("test data 321");
        bookDao.updateById(book);
    }

    @Test
    void testDelete(){
        bookDao.deleteById(13);
    }

    @Test
    void testGetAll(){
//        bookDao.selectList(null);
    }

    @Test
    void testPage(){
        IPage page = new Page(1, 5);
        bookDao.selectPage(page, null);
    }

    @Test
    void testGetBy(){
//        QueryWrapper<Book> qw = new QueryWrapper<>();
//        qw.like("name", "Spring");
        String name = "Spring";
        LambdaQueryWrapper<Book> lqw = new LambdaQueryWrapper<Book>();
        lqw.like(name!=null ,Book::getName, name);
        bookDao.selectList(lqw);
    }


}
