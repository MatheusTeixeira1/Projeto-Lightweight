package com.lightWeight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lightWeight.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
