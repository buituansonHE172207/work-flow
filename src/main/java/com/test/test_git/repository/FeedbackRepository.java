package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long>{
    
}
