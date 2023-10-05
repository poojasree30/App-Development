package com.example.demo.entity;

public class LogVerifyEntity 
{
	String name;
	String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public LogVerifyEntity() {

	}
	
	public LogVerifyEntity(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}
	@Override
	public String toString() {
		return "LogVerifyEntity [name=" + name + ", password=" + password + "]";
	}
	
	
}
