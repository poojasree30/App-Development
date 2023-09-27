package com.example.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.model.Model;

@Repository
public interface ServiceInt {
 
public List<Model> getDatas();
}
