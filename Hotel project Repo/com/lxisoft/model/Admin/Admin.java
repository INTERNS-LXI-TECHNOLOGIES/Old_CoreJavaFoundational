package com.lxisoft.model;

public class Admin {
	
	private int id;
	private String userName;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	public String toString()
	{
		return "Admin { id="+this.id+", userName="+this.userName+", password="+this.password+" }";
	}

}