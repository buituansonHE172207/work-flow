package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
}
