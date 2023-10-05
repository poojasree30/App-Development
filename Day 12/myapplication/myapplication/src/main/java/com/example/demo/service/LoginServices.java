package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.LoginModel;
import com.example.demo.repository.LoginRepoInt;


@Service

public class LoginServices implements LoginServiceInt{
	@Autowired
	private LoginRepoInt ll;

	@Override
	public List<LoginModel> getdatas() {
		return ll.findAll();
	}
	@Override
	public void saveData(LoginModel kp) {
		// TODO Auto-generated method stub
		ll.save(kp);
	}

	@Override
	public void updateData(LoginModel kp) {
		// TODO Auto-generated method stub
		ll.save(kp);
	}

	@Override
	public void deleteData(int id) {
		// TODO Auto-generated method stub
		ll.deleteById(id);
	}
	
}




