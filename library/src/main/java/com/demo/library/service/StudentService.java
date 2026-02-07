package com.demo.library.service;

import com.demo.library.entity.Students;

public interface StudentService {
    public Students addStudent(Students student);
    public Students updateStudent(Students student);
    public void deleteStudent(String rollno);
}
