package com.lxisoft.hotelv1;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;
import java.util.Comparator;
import java.io.*;
public class Hotel 
{
	Scanner scan=new Scanner(System.in);
	private AdministratorController ac;
	private CashierController cashier;
	private ArrayList <Food> foods;
	private CustomerController cc;
	//ArrayList <String> foodItems=new ArrayList <String>();
	public void setAc(AdministratorController ac)
	{
		this.ac=ac;
	}
	public AdministratorController getAc()
	{
		return ac;
	}
	public void setCashier(CashierController cashier)
	{
		this.cashier=cashier;
	}
	public CashierController getCashier()
	{
		return cashier;
	}
	public void setFoods(ArrayList <Food> foods)
	{
		this.foods=foods;
	}
	public ArrayList <Food> getFoods()
	{
		return foods;
	}
	public void setCc(CustomerController cc)
	{
		this.cc=cc;
	}
	public CustomerController getCc()
	{
		return cc;
	}

}				
