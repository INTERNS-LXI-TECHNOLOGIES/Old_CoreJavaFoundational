package com.lxisoft.hotel.bill;
import com.lxisoft.hotel.food.Food;
import java.util.*;
public class Bill{
	private String buyerName;
	private ArrayList<Integer> foodNos = new ArrayList<Integer>();
	public void setBuyerName(String buyerName){
		this.buyerName = buyerName;
	}
	public String getBuyerName(){
		return buyerName;
	}
	public void setFoodNos(ArrayList<Integer> foodNos){
		this.foodNos = foodNos;
	}
	public ArrayList<Integer> getFoodNos(){
		return foodNos;
	}
}