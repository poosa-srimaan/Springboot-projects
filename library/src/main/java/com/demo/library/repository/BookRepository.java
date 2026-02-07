package com.demo.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.demo.library.entity.Books;

import jakarta.transaction.Transactional;

public interface BookRepository extends JpaRepository<Books, Long> {

    @Modifying
    @Transactional
    @Query("UPDATE Books b SET b.stock = b.stock - 1 WHERE b.id = ?1 AND b.stock > 0")
    public void reduceStock(long id);
}
