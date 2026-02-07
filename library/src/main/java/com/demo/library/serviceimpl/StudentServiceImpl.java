package com.demo.library.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.library.entity.Students;
import com.demo.library.repository.StudentsRepository;
import com.demo.library.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentsRepository studentsRepository;

    @Override
    public Students addStudent(Students student) {        
        return studentsRepository.save(student);
    }

    @Override
    public Students updateStudent(Students student) {
        return studentsRepository.save(student);
    }

    @Override
    public void deleteStudent(String rollno) {
        studentsRepository.deleteByRollno(rollno);
    }

}
