package com.lxisoft.quizgamev2.security;
import com.lxisoft.quizgamev2.login.*;
import java.io.*;
import java.util.*;
public class LogIn_controller
{
	public LogIn_model data=new LogIn_model();
	public String logCheck(String user,String pass)throws Exception{
		data.setUser(user);data.setPass(pass);
		FileReader reader=new FileReader("./com/lxisoft/quizgamev2/security/Database/"+data.getUser()+".properties");
		Properties p=new Properties();
		p.load(reader);
		if(p.getProperty("USERNAME").equals(data.getUser())&&p.getProperty("PASSWORD").equals(data.getPass()))
		{
			return (data.getUser());
			
		}
		else
		{
				System.out.println("\t\t\t\t\t\tXXXXXXX--WRONG USER DATA ENTERED--XXXXXXX\n");
				System.exit(0);
				return (data.getUser());
				
				
		}
		
		
	}
	
}