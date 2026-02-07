package com.demo.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.library.entity.Books;
import com.demo.library.serviceimpl.BookServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookServiceImpl bookServiceImpl;

    // @Autowired
    // private Books book;

    @PostMapping("/addbook")
    public Books addBook(@RequestBody Books book) {
        return bookServiceImpl.addBook(book);
    }

    @PostMapping("/updatebook")
    public Books updateBook(@RequestBody Books book) {
        return bookServiceImpl.updateBook(book);
    }

    @PostMapping("/deletebook/{id}")
    public void deleteBook(@RequestBody long id) {
        bookServiceImpl.deleteBook(id);
    }

}
