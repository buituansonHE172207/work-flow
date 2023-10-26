package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Slider;

public interface SliderRepository extends JpaRepository<Slider, Long>{
    
}
