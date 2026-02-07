package com.demo.library.serviceimpl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.library.entity.StudentBooks;
import com.demo.library.repository.BookRepository;
import com.demo.library.repository.StudentBookRepository;
import com.demo.library.service.StudentBookService;

@Service
public class StudentBookServiceImpl implements StudentBookService {

    public LocalDate getdate() {
        LocalDate date = LocalDate.now();
        return date;
    }

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void reduceBookStock(long bookId) {
        bookRepository.reduceStock(bookId);
    }

    @Autowired
    private StudentBookRepository studentBookRepository;

    @Override
    public void issueBook(StudentBooks studentBook) {
        studentBook.setIssueDate(getdate());
        studentBookRepository.save(studentBook);
    }

    @Override
    public List<StudentBooks> seeAll() {
        return studentBookRepository.findAll();
    }

}
