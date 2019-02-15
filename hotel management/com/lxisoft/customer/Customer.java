package com.lxisoft.customer;
import java.util.Scanner;
public class Customer
{
String userName;
String password;

Scanner scan=new Scanner(System.in);

public void customerLogin()
	{
	        String confirmPassword;
		   
			System.out.print("Username:");
			userName=scan.next();
			System.out.print("Password:");
			password=scan.next();
			
			System.out.print("Confirm password:");
			confirmPassword=scan.next();
			if(password.equals(confirmPassword))
			{
			System.out.println("  ");
			System.out.println("Access granted");
			}
			else
			{
			    System.out.println("Incorrect password....Please try again...!!!");
			}
    }