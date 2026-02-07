package com.demo.library.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.library.entity.Books;
import com.demo.library.repository.BookRepository;
import com.demo.library.service.BookService;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Books addBook(Books book) {
        bookRepository.save(book);
        return book;
    }

    @Override
    public Books updateBook(Books book) {
        bookRepository.save(book);
        return book;
    }

    @Override
    public void deleteBook(long id) {
        bookRepository.deleteById(id);
    }

}
