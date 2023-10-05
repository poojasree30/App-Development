
package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.LoginModel;

@Service
public interface LoginServiceInt {

	public List<LoginModel>getdatas();
	public void saveData(LoginModel kp);
	public void updateData(LoginModel kp);
	public void deleteData(int id);

}


