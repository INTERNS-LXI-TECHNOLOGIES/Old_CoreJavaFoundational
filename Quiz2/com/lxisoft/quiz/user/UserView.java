package com.lxisoft.quiz.user;
public class UserView
{
	public void askUsername()
	{
	System.out.println("Enter the Username:");	
	}
	public void askPassword()
	{
		System.out.println("Enter the Password:");
	}
	public void loginSucceed()
	{
		System.out.println("LOGIN SUCCESSFUL.....\nBEST OF LUCK. TAKE YOUR TEST BETTER.");
	}
	public void loginFailed()
	{
		System.out.println("LOGIN FAILED...\n.....PLEASE RETRY.....");
	}
}