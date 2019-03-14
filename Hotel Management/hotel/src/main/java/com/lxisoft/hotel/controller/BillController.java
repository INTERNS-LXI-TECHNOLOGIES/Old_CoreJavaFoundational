package com.lxisoft.hotel.controller;
import com.lxisoft.hotel.model.*;
import com.lxisoft.hotel.services.*;
import java.util.*;
/**
*<h1>Controller Class For Bill</h1>
<p>
*This class is used for getting data from View class and senting data to BillService Class.
*@author Mohammed Anish
*@version 1.1
*/
public class BillController{
	BillService bill = new BillService();
	Bill billModel = new Bill();
	/**
	*this method is used for senting selected foods to BillService class and return its total
	*@param selectedfoods this is an hashmap of selected foods
	*@return total amount for bill
	*/
	public int totalBill(Map<Integer,Food> selectedfoods){
		return bill.totalBill(selectedfoods);
	}
	/**
	*this method is used for senting food rate and food nos to BillService class and return its total
	*@param foodRate rate of food
	*@param foodNos no of foods
	*@return total amount for each food
	*/
	public int foodPrice(int foodRate,int foodNos){
		return bill.foodPrice(foodRate,foodNos);
	}
	/**
	*this method is used for senting selected foodNos to BillModel class
	*@return ArrayList of foodNos
	*/
	public ArrayList<Integer> getFoodNos(){
		return billModel.getFoodNos();
	}
	/**
	*this method is used for setting buyer name for current bill 
	*@param buyerName name of Buyer
	*/
	public void setBuyerName(String buyerName){
		billModel.setBuyerName(buyerName);
	}
	/**
	*this method is used for getting buyer name for current bill 
	*@return buyer name
	*/
	public String getBuyerName(){
		return billModel.getBuyerName();
	}
	/**
	*this method is used for senting bill details to BillService class for Storing it in database 
	*@param name name of the buyer
	*@param foodName name of the food 
	*@param foodPrice price fir the food 
	*@param foodNos no of foods
	*@param id bill no
	*@param date bill date
	*@param time bill time
	*@throws Exception
	*/
	public void prevBill(String name,String foodName,String foodPrice,String foodNos,int id,String date,String time) throws Exception{
		bill.prevBill(name,foodName,foodPrice,foodNos,id,date,time);
	}
	/**
	*this method is used for gettting bill using bill no 
	*@param id bill no
	*@throws Exception
	*/
	public void setprevBill(int id) throws Exception{
		bill.setprevBill(id);
	}
}