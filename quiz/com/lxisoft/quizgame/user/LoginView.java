package com.lxisoft.quizgame.user;
import java.util.*;
public class LoginView
{
	String username,password;
	public String enterUsername()
	{
		Scanner name=new Scanner(System.in);
		System.out.println("Enter Username");
		username=name.next();
		return username;
	} 

	public String enterPassword()
	{
		Scanner psw=new Scanner(System.in);
		System.out.println("Enter Password");
		password=psw.next();
		return password;
	}  
}