package com.lxisoft.hotel.controller;
import com.lxisoft.hotel.model.Food;
import com.lxisoft.hotel.services.*;
import com.lxisoft.hotel.model.Hotel;
import java.util.*;
public class HotelController{
	HotelService hotelService = new HotelService();
	Hotel hotel = new Hotel();
	public void callHotelRepo() throws Exception{
		hotelService.getFoodDetails();
	}
	public void addFood(Food food) throws Exception{
		hotelService.getfoods(food);
	}
	public void editFood(String foodName,int foodPrice,int nos,String name) throws Exception{
		hotelService.getfoods(foodName,foodPrice,nos,name);
	}
	public void deleteFood(Food selectedFood) throws Exception{
		hotelService.deleteFood(selectedFood);
	}
	public void searchByName(String name) throws Exception{
		hotelService.searchByName(name);
	}
	public void searchByPrice(int from,int to) throws Exception{
		hotelService.searchByPrice(from,to);
	}
	public void searchByContains(String name) throws Exception{
		hotelService.searchByContains(name);
	}
	public ArrayList<Food> getFoods(){
		return hotel.getFoods();
	}
}