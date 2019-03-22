package com.lxisoft.repo;

import java.util.ArrayList;

import com.lxisoft.model.*;
public class CookServices {
	DBConnect dbconnect = new DBConnect();
	
	public ArrayList<Customer> getAllCategorys(){
		return dbconnect.getAllCategory();
	}
	
	public ArrayList<Hotel> getAllOrders(){
		return dbconnect.getAllOrders();
	}
	public ArrayList<Food> getAllItems(int orderId)
	{
		return dbconnect.getAllItems(orderId);
	}

	public boolean isAlreadyExists(String name) {
		return dbconnect.isAlreadyExists(name);
	}

	public boolean addCategory(String name) {
		return dbconnect.addCategory(name);
	}

	public boolean isItemAlreadyExists(String itemName) {		
		return dbconnect.isItemAlreadyExists(itemName);
	}

	public boolean addItem(Item item) {		
		return dbconnect.addItem(item);
	}

	public boolean updateOrderStatus(int orderId) {		
		return dbconnect.updateOrderStatus(orderId);
	}

	public boolean updateItemStatus(int orderId, int itemId) {		
		return dbconnect.updateItemStatus(orderId, itemId);
	}

	public boolean addOrder(Hotel orderMaster) {		
		return dbconnect.addOrder(orderMaster);
	}

	public int getLastOrderId() {
		return dbconnect.getLastOrderId();
	}

	public boolean addOrderedItems(ArrayList<Food> orderDetails) {		
		return dbconnect.addOrderedItems(orderDetails);
	}

}
