package com.lxisoft.admin;
import java.util.Scanner;
public class Admin
{

	String userName="admin";
	String password="admin123";
	
	Scanner scan= new Scanner(System.in);
	
	public void adminLogin()
	{
	
	System.out.print("Username:");
	String u=scan.next();
	System.out.print("Password:");
	String p=scan.next();
	if(u.equals(userName) && p.equals(password))
	{
		System.out.println(" ");
		System.out.println("Access granted");
	
	}
	else if(u!=userName && p.equals(password))
	{
		System.out.println("Invalid username...!!!");
	}
	else if(p!=password && u.equals(userName))
	{
		System.out.println("Incorrect password");
	}
	else
	{
		System.out.println("Invalid username & password...Please try again...!!!");
	}
	}
	}
	
	