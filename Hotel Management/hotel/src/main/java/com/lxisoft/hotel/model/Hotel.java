package com.lxisoft.hotel.model;
import com.lxisoft.hotel.model.Food;
import java.util.*;
import java.io.*;
public class Hotel{	
	private static ArrayList<Food> foods = new ArrayList<Food>();
	public void setFoods(ArrayList<Food> foods){
		this.foods = foods;
	}
	public ArrayList<Food> getFoods(){
		return foods;
	}
}