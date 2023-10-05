package com.example.demo.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LogVerifyEntity;
import com.example.demo.service.LogVerifyService;

@RestController
@CrossOrigin("*")
public class LogVerifyController 
{
	@Autowired
	private LogVerifyService ls;
	
	@PostMapping("/logverify")
	public boolean check(LogVerifyEntity le)
	{
		return ls.verifyLogin(le);
	}
}
