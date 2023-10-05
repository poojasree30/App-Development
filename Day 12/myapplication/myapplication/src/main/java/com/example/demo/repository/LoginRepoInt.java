package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.LoginModel;
import com.example.demo1.entity.UserEntity;

public interface LoginRepoInt extends JpaRepository<LoginModel,Integer> {
	public Optional<LoginModel> findByName(String name);
}
