package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Author;


public interface AuthorRepository extends JpaRepository<Author, Long> {
    
}
