package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.PostCategory;

public interface PostCategoryRepository extends JpaRepository<PostCategory, Long> {
    
}
