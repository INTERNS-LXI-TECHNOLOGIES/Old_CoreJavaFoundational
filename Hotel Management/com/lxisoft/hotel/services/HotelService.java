package com.lxisoft.hotel.services;
import com.lxisoft.hotel.model.Food;
import com.lxisoft.hotel.repo.*;
public class HotelService{
	HotelRepoImpl hotelRepo = new HotelRepoImpl();
	public void getFoodDetails() throws Exception{
		hotelRepo.hotelRepo();
	}
	public void getfoods(Food food) throws Exception{
		hotelRepo.add(food);
	}
	public void getfoods(String foodName,int foodPrice,int nos,String name) throws Exception{
		hotelRepo.edit(foodName,foodPrice,nos,name);
	}
	public void deleteFood(Food food) throws Exception{
		hotelRepo.delete(food);
	}
}