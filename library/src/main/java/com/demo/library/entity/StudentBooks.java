package com.demo.library.entity;

import java.time.LocalDate;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentBooks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String studentId;

    private long bookId;

    private String bookName;

    private LocalDate issueDate;

}
