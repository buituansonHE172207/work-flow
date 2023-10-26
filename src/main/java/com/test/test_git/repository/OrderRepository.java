package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
    
}
