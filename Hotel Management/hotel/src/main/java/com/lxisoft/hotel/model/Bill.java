package com.lxisoft.hotel.model;
import com.lxisoft.hotel.model.Food;
import java.util.*;
/**
*<h1>Model Class For Bill</h1>
<p>
*This class is a Model class for Bill.
*@author Mohammed Anish
*@version 1.1
*/
public class Bill{
	private String buyerName;
	private static ArrayList<Integer> foodNos = new ArrayList<Integer>();
	/**
	*this method is a setter method for buyerName
	*@param buyerName name of the buyer 
	*/
	public void setBuyerName(String buyerName){
		this.buyerName = buyerName;
	}
	/**
	*this method is a getter method for buyerName
	*@return buyer Name
	*/
	public String getBuyerName(){
		return buyerName;
	}
	/**
	*this method is a setter method for foodNos
	*@param foodNos no of foods 
	*/
	public void setFoodNos(ArrayList<Integer> foodNos){
		this.foodNos = foodNos;
	}
	/**
	*this method is a getter method for foodNos
	*@return ArrayList of foodNos
	*/
	public ArrayList<Integer> getFoodNos(){
		return foodNos;
	}
}