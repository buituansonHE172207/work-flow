package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
    
}
