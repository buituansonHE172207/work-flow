package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Language;

public interface LanguageRepository extends JpaRepository<Language, Long> {
    
}
