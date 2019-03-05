package com.lxisoft.hotel.controller;
import com.lxisoft.hotel.model.*;
import com.lxisoft.hotel.services.*;
import java.util.*;
public class BillController{
	BillService bill = new BillService();
	Bill billModel = new Bill();
	public int totalBill(Map<Integer,Food> selectedfoods){
		return bill.totalBill(selectedfoods);
	}
	public int foodPrice(int foodRate,int foodNos){
		return bill.foodPrice(foodRate,foodNos);
	}
	public ArrayList<Integer> getFoodNos(){
		return billModel.getFoodNos();
	}
	public void setBuyerName(String buyerName){
		billModel.setBuyerName(buyerName);
	}
	public String getBuyerName(){
		return billModel.getBuyerName();
	}
	public void prevBill(String name,String foodName,String foodPrice,String foodNos,int id) throws Exception{
		bill.prevBill(name,foodName,foodPrice,foodNos,id);
	}
	public void setprevBill(int id) throws Exception{
		bill.setprevBill(id);
	}
}