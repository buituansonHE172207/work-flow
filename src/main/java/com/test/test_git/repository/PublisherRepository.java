package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Publisher;

public interface PublisherRepository extends JpaRepository<Publisher, Long> {
    
}
