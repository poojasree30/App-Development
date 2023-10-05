package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "model")
public class SigninModel {
	@Id
	private int id;
	private String username;
	private String password;

	public SigninModel(int id, String username, String passsword) {
		super();
		this.id = id;
		this.username = username;
		this.password = passsword;
	}
	
	public SigninModel() {
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPasssword(String passsword) {
		this.password = passsword;
	}
}
