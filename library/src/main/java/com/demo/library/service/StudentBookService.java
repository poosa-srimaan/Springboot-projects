package com.demo.library.service;

import java.util.List;

import com.demo.library.entity.StudentBooks;

public interface StudentBookService {
    public void issueBook(StudentBooks studentBook);
    public void reduceBookStock(long bookId);
    public List<StudentBooks> seeAll();
}
