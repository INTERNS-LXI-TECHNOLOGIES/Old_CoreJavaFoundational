package com.lxisoft.hotel.controller;
import com.lxisoft.hotel.model.Food;
import com.lxisoft.hotel.repo.*;
import com.lxisoft.hotel.model.Hotel;
import java.util.*;
public class HotelController{
	HotelRepoImpl hotelRepo = new HotelRepoImpl();
	Hotel hotel = new Hotel();
	public void callHotelRepo() throws Exception{
		hotelRepo.hotelRepo();
	}
	public void addFood(Food food) throws Exception{
		hotelRepo.add(food);
	}
	public void editFood() throws Exception{
		hotelRepo.edit();
	}
	public void deleteFood(int selectedFood) throws Exception{
		hotelRepo.delete(selectedFood);
	}
	public ArrayList<Food> getFoods(){
		return hotel.getFoods();
	}
}