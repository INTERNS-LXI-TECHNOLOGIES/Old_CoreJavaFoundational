package com.lxisoft.culturalevaluation.user;
import java.util.Scanner;

public class UserView
{
	public void printError(String errorMsg)
	{
		System.out.println("Error : "+errorMsg);
	}
	public String askUsername()
	{
		System.out.print("[USERNAME] : ");
		return ((new Scanner(System.in)).nextLine());
	}
	public String askPassword()
	{
		System.out.print("[PASSWORD] : ");
		return ((new Scanner(System.in)).nextLine());
	}
	public void loginSuccess(String username)
	{
		System.out.println("Successfully logged in as "+username);
	}
}