package com.itheima.service.impl;

import com.alicp.jetcache.anno.*;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    private HashMap<Integer, Book> cache = new HashMap<Integer, Book>();

    @Override
    public Boolean save(Book book) {
        return bookDao.insert(book) > 0;
    }

    @Override
    @CacheUpdate(name="book", key="#book.id", value="#book")
    public Boolean update(Book book) {
        return bookDao.updateById(book) > 0;
    }

    @Override
    @CacheInvalidate(name="book",key="#id")
    public Boolean delete(Integer id) {
        return bookDao.deleteById(id) > 0;
    }

    @Override
    public List<Book> getAll() {
        return bookDao.selectList(null);
    }

    @Override
    @Cached(name="book",key="#id",expire = 3600, cacheType = CacheType.LOCAL)
    @CacheRefresh(refresh = 5)
    public Book getById(Integer id) {
        return bookDao.selectById(id);
    }
}
