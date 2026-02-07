package com.demo.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.demo.library.entity.Students;

public interface StudentsRepository extends JpaRepository<Students, Long> {
    @Query("DELETE FROM Students s WHERE s.rollno = :rollno ")
    public void deleteByRollno(String rollno);
}
