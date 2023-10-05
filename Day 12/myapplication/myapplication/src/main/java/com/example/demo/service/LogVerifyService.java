package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LogVerifyEntity;
import com.example.demo.entity.LoginModel;
import com.example.demo.repository.LoginRepoInt;

@Service
public class LogVerifyService implements LogVerifyServiceInt
{
	@Autowired
	private LoginRepoInt lri;
	public boolean verifyLogin(LogVerifyEntity user) {
		Optional<LoginModel> userdata = lri.findByName(user.getName());
		
		if (!userdata.isPresent()) return false;
		if (!user.getPassword().equals(userdata.get().getPassword())) return false;

		return true;
	}
}
