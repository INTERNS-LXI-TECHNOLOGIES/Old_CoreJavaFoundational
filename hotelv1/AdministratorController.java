package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;
public class AdministratorController
{
	private Administrator administrator;
	private AdministratorService as;
	public void setAdministrator(Administrator administrator)
	{
		this.administrator=administrator;
	}
	public Administrator getAdministrator()
	{
		return administrator;
	}
	public void setAs(AdministratorService as)
	{
		this.as=as;
	}
	public AdministratorService getAs()
	{
		return as;
	}
	public AdministratorController()
	{
		as=new AdministratorService();
	}
	
public void adminDetails()throws Exception
	{
		administrator=new Administrator();
		administrator.setUsername("administ");
		administrator.setPassword("admin");
	}
	/*public void details()
	{
		as=new AdministratorService();
		as.addFood();
		as.deleteFood();
		
	}*/
		
}