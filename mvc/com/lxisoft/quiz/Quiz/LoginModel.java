package com.lxisoft.quiz.Quiz;
public class LoginModel{
	private String line,password1,username1,FILENAME;
	public LoginModel(String password1,String username1,String FILENAME){
		this.FILENAME = FILENAME;
		this.password1 = password1;
		this.username1 = username1;
	}
	public String getLine(){
		return line;
	}
	public String getPassword(){
		return password1;
	}
	public String getUsername(){
		return username1;
	}
	public String getFilename(){
		return FILENAME;
	}
}