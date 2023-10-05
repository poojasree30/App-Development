package com.example.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.model;

@Repository
public interface repo extends JpaRepository<model, Integer>{
	public Optional<model> findByName(String name);
}
