package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.SigninModel;
@Repository
public interface SigninRepoInt extends JpaRepository<SigninModel, Integer> {

}

