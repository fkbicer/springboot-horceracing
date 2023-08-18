package com.fquery.horceracing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fquery.horceracing.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
