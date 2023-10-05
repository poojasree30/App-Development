package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.model.Userjwt;
import com.example.demo.model.model;
import com.example.demo.repo.repo;

@Service
public class service {
	
	@Autowired
	repo r1;
	
	public List<model> getDetails()
	{
		return r1.findAll();
	}
	
	public String postDetails(model m1)
	{
		r1.save(m1);
		return "Details are saved";
	}
	public String deleteDetails(@PathVariable("id") int id)
	{
		 r1.deleteById(id);
		 return "Id : "+id+" is deleted";
	}

	public model updateDetails(@RequestBody model t)
	{
		System.out.println("Changes updated");
		return r1.save(t);
	}
	
	public void addNewUser(model ue) 
	{
		r1.save(ue);
	}

	public boolean authLogin(Userjwt user) {
		Optional<model> userOpt = r1.findByName(user.getUserName());
		
		if (!userOpt.isPresent()) return false;
		if (!user.getPassword().equals(userOpt.get().getPassword())) return false;

		return true;
	}
}
