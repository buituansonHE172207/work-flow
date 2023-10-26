package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}
