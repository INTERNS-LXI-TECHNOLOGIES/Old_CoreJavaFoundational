package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class HotelController
{
	private AdministratorController ac;
	private CustomerController cc;
	private FoodController fc;
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
	/*public void setHs(HotelService hs)
	{
		this.hs=hs;
	}
	public HotelService getHs()
	{
		return hs;
	}*/
	public void storeDetails(ArrayList <Food> foods)throws Exception
	{
		HotelService hs=new HotelService();
		hs.storeDetails(foods);
	}
	public void displayDetails(ArrayList <Food> foods)throws Exception
	{
		HotelService hs=new HotelService();
		hs.displayDetails(foods);
	}
	
}	