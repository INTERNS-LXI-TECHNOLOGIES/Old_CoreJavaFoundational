package com.lxisoft.quizgamev2.security;
import com.lxisoft.quizgamev2.signup.*;
import java.util.*;
import java.io.*;
public class Signup_controller
{
	public Signup_model signdata=new Signup_model();
	public Properties p=new Properties();
	public void registrationSetter(String id,String user,String pass)throws Exception{
		signdata.setUserid(id);
		signdata.setUsername(user);
		signdata.setUserpass(pass);
		
		p.setProperty("ID",signdata.getUserid());
		p.setProperty("USERNAME",signdata.getUsername());
		p.setProperty("PASSWORD",signdata.getUserpass());
		p.store(new FileWriter("./com/lxisoft/quizgamev2/security/Database/"+signdata.getUsername()+".properties"),"NEW USER REGISTRATION");
		
		
	}
}