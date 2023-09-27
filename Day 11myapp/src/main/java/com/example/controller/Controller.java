package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Model;
import com.example.service.Service;



@RestController
public class Controller {
	@Autowired
	private Service se;
	
	@GetMapping("/get")
	public String getDatas(){
		return "Welcome";
	}

}
