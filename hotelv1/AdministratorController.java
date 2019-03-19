package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class AdministratorController
{
	Scanner scan=new Scanner(System.in);
	private Administrator administrator;
	public void setAdministrator(Administrator administrator)
	{
		this.administrator=administrator;
	}
	public Administrator getAdministrator()
	{
		return administrator;
	}
public void adminDetails()throws Exception
	{
		administrator=new Administrator();
		//av=new AdministratorView();
		administrator.setUsername("administ");
		administrator.setPassword("admin");
	}
}