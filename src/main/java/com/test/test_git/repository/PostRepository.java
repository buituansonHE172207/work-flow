package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
    
}
