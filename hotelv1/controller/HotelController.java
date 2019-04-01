package com.lxisoft.hotelv1.controller;
import com.lxisoft.hotelv1.service.HotelService;
import com.lxisoft.hotelv1.model.Food;
import java.util.*;
import java.io.*;
public class HotelController
{
	private AdministratorController ac;
	private CustomerController cc;
	private FoodController fc;
	private HotelService hs;
	//private HotelService hs;
	public void setAc(AdministratorController ac)
	{
		this.ac=ac;
	}
	public AdministratorController getAc()
	{
		return ac;
	}
	public void setCc(CustomerController cc)
	{
		this.cc=cc;
	}
	public CustomerController getCc()
	{
		return cc;
	}
	public void setFc(FoodController fc)
	{
		this.fc=fc;
	}
	public FoodController getFc()
	{
		return fc;
	}
	public void setHs(HotelService hs)
	{
		this.hs=hs;
	}
	public HotelService getHs()
	{
		return hs;
	}
	
	public HotelController()
	{
		 ac=new AdministratorController();
		 cc=new CustomerController();
		 hs=new HotelService();
	}
	public void a()throws Exception{
		hs.a();}
	
	public void storeDetails(ArrayList <Food> foods)throws Exception
	{
		hs.storeDetails(foods);
	
	}
	public void displayDetails(ArrayList <Food> foods)throws Exception
	{
		hs.displayDetails(foods);
	}
	public void store(ArrayList <Food> foods)throws Exception
	{
		hs.store(foods);
	
	}
	public void remove(ArrayList <Food> foods)throws Exception
	{
		hs.remove(foods);
	
	}
	
}	