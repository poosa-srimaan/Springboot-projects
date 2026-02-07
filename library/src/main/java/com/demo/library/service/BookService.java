package com.demo.library.service;

import com.demo.library.entity.Books;

public interface BookService {

    public Books addBook(Books book);
    public Books updateBook(Books book);
    public void deleteBook(long id);

}
