package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.SigninModel;

@Service
public interface SigninServiceInt {
	public List<SigninModel>getdatas();
	public void saveDatass(SigninModel Ie);
	public void updateDatass(SigninModel Ie);
	public void deleteDatass(int id);

}
