package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class HotelController
{
		Service service;
	Scanner scan=new Scanner(System.in);
	private Hotel hotel;
	public void setHotel(Hotel hotel)
	{
		this.hotel=hotel;
	}
	public Hotel getHotel()
	{
		return hotel;
	}
	private Administrator administrator;
	public void setAdministrator(Administrator administrator)
	{
		this.administrator=administrator;
	}
	public Administrator getAdministrator()
	{
		return administrator;
	}
	private Customer customer;
public void setCustomer(Customer customer)
{
 this.customer=customer;
}
public Customer getCustomer()
{
return customer;
}	

public void adminDetails()throws Exception
	{
		administrator=new Administrator();
		//av=new AdministratorView();
		administrator.setUsername("administ");
		administrator.setPassword("admin");
	}
	public void userDetails()
	{
		customer=new Customer();
		customer.setUsername("user");
		customer.setPassword("user");
	}
	public String selectFood()
	{
	
	String food=scan.next();
	return food;
	}
	public void storeFood(HotelController controller,ArrayList <Food> foods,Service service)throws Exception
	{
		Tdd tdd=new Tdd();
		tdd.authentication(controller,foods,service);
	}
	public void display(HotelController controller,ArrayList <Food> foods,Service service)throws Exception
	{
		service.storeFood(controller,foods,service);
	}
	
}
