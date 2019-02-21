package com.lxisoft.hotel.hotel;
import com.lxisoft.hotel.food.Food;
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