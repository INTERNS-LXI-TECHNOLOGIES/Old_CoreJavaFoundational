package com.lxisoft.hotel.model;
public class User{
	private String emailid;
	private String mobno;
	private String password;
	public void setEmailid(String emailid){
		this.emailid = emailid;
	}
	public String getEmailid(){
		return emailid;
	}
	public void setMobno(String mobno){
		this.mobno = mobno;
	}
	public String getMobno(){
		return mobno;
	}
	public void setPassword(String password){
		this.password = password;
	}
	public String getPassword(){
		return password;
	}
}