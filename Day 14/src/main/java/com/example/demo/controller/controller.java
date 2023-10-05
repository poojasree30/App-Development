package com.example.demo.controller;
import org.springframework.http.HttpHeaders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.jwt.Jwtutil;
import com.example.demo.model.Userjwt;
import com.example.demo.model.model;
import com.example.demo.repo.repo;
import com.example.demo.service.service;


@RestController

public class controller {
	@Autowired
	repo r1;
	
	@Autowired
	service s1;
	
	@Autowired
	
	@GetMapping("/get")
	public List<model> getDetails()
	{
		return s1.getDetails();
	}
	
	@PostMapping("/addNewUser")
	public void addNewUser(@RequestBody model ue)
	{
		s1.addNewUser(ue);
	}
	
	public ResponseEntity<Boolean> l(@RequestBody Userjwt u)
	{
		if(s1.authLogin(u))
		{	
			Jwtutil tokenize = new Jwtutil();
			HttpHeaders responseHeaders = new HttpHeaders();
			
			responseHeaders.set("set-cookie" , ("session-id:"+tokenize.generateToken(u)+";HttpOnly"));
			return ResponseEntity.ok().headers(responseHeaders).body(true);
		}
		
		return ResponseEntity.ok().body(false);
	}
	
	@PostMapping("/postgym")
	public String postDetails(@RequestBody model m1)
	{
		return s1.postDetails(m1);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteDetails(@PathVariable("id") int id)
	{
		return s1.deleteDetails(id);
	}

	@PutMapping("/put/{id}")
	public model updateDetails(@RequestBody model m)
	{
		return s1.updateDetails(m);
	}
}
