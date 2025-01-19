package com.example.project.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.project.Model.User;


@Repository
public interface UserRepo extends JpaRepository <User ,Integer >{
  User findByUsername(String username);
}
