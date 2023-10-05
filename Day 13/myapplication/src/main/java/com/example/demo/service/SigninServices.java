package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.SigninModel;
import com.example.demo.repository.SigninRepoInt;

@Service

public class SigninServices implements SigninServiceInt{
	@Autowired
	private SigninRepoInt ss;

	@Override
	public List<SigninModel> getdatas() {
		return ss.findAll();
	}
	@Override
	public void saveDatass(SigninModel Ie) {
		// TODO Auto-generated method stub
		ss.save(Ie);
	}

	@Override
	public void updateDatass(SigninModel Ie) {
		// TODO Auto-generated method stub
		ss.save(Ie);
	}

	@Override
	public void deleteDatass(int id) {
		// TODO Auto-generated method stub
		ss.deleteById(id);
	}
	
}