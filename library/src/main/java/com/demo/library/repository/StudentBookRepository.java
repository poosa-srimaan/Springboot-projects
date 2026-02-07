package com.demo.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.library.entity.StudentBooks;

public interface StudentBookRepository extends JpaRepository<StudentBooks, Long> {

}
