package com.lxisoft.model;

import java.util.ArrayList;

import com.lxisoft.model.*;
public class UserService
{
	
	
DBConnect dbconnect = new DBConnect();
	
	public ArrayList<Category> getAllCategorys(){
		return dbconnect.getAllCategory();
	}
	public boolean checkLogin(Admin login)
	{
		return  dbconnect.checkLogin(login);		
	}
	
	public ArrayList<Item> getAllItems(int catId)
	{
		return dbconnect.getAllItemsByCategory(catId);
	}
	
	public ArrayList<Menu> getAllOrders(int tableNo){
		return dbconnect.getAllOrders(tableNo);
	}
	
	public ArrayList<Hotel> getBill(int tableNo)
	{
		return dbconnect.getBill(tableNo);
	}
}