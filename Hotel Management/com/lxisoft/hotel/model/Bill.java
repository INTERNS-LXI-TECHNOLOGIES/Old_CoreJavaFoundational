package com.lxisoft.hotel.model;
import com.lxisoft.hotel.model.Food;
import java.util.*;
public class Bill{
	private String buyerName;
	private static ArrayList<Integer> foodNos = new ArrayList<Integer>();
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