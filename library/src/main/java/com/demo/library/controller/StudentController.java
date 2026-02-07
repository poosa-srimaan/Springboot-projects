package com.demo.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.library.entity.Students;
import com.demo.library.serviceimpl.StudentServiceImpl;
    
    

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentServiceImpl studentServiceImpl;

    @PostMapping("/addstudent")
    public Students addStudent(@RequestBody Students student) {
        return studentServiceImpl.addStudent(student);
    }

    @PostMapping("/updatestudent")
    public Students updateStudent(@RequestBody Students student) {
        return studentServiceImpl.updateStudent(student);
    }

    @PostMapping("/deletestudent/{rollno}")
    public void deleteStudent(@RequestBody String rollno) {
        studentServiceImpl.deleteStudent(rollno);
    }

}
