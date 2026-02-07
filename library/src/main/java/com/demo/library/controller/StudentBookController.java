package com.demo.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.library.entity.StudentBooks;
import com.demo.library.serviceimpl.StudentBookServiceImpl;

@RestController
@RequestMapping("/studentbooks")
public class StudentBookController {

    @Autowired
    private StudentBookServiceImpl studentBookServiceImpl;

    @PostMapping("/booktostudent")
    public void bookToStudent(@RequestBody StudentBooks studentBook) {
        studentBookServiceImpl.issueBook(studentBook); 
        studentBookServiceImpl.reduceBookStock(studentBook.getBookId());       
    }

    @GetMapping("/seeall")
    public List<StudentBooks> seeAll() {
        return studentBookServiceImpl.seeAll();
    }

}
