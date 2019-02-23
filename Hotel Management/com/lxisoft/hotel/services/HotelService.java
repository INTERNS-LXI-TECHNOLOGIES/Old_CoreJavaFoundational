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
	public void getfoods() throws Exception{
		hotelRepo.edit();
	}
	public void getfoods(int selectedFood) throws Exception{
		hotelRepo.delete(selectedFood);
	}
}