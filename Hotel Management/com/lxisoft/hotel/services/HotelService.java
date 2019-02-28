package com.lxisoft.hotel.services;
import com.lxisoft.hotel.model.Food;
import com.lxisoft.hotel.repo.*;
import java.sql.*;
public class HotelService{
	HotelRepoImpl hotelRepo = new HotelRepoImpl();
	public void getFoodDetails() throws Exception{
		hotelRepo.viewAll();
	}
	public void getfoods(Food food) throws Exception{
		hotelRepo.add(food);
	}
	public void getfoods(String foodName,int foodPrice,int nos,String name) throws Exception{
		PreparedStatement p = hotelRepo.c.prepareStatement("update foodDetails set name = ?,price = ?,nos = ? WHERE name = ?");
		p.setString(1,foodName);
		p.setInt(2,foodPrice);
		p.setInt(3,nos);
		p.setString(4,name);
		p.execute();
	}
	public void deleteFood(Food food) throws Exception{
		hotelRepo.delete(food);
	}
	public void searchByName(String name) throws Exception{
		hotelRepo.searchByName(name);
	}
	public void searchByPrice(int from,int to) throws Exception{
		hotelRepo.searchByPrice(from,to);
	}
	public void searchByContains(String name) throws Exception{
		hotelRepo.searchByContains(name);
	}
}