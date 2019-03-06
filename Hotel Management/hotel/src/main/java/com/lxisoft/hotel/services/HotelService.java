package com.lxisoft.hotel.services;
import com.lxisoft.hotel.model.Food;
import com.lxisoft.hotel.repo.*;
import java.sql.*;
public class HotelService{
	HotelRepoImpl hotelRepo = new HotelRepoImpl();
	HotelRepoImplFile hotelRepoFile = new HotelRepoImplFile();
	Repo r = new Repo();
	public void getFoodDetails() throws Exception{
		hotelRepo.viewAll();
		hotelRepoFile.viewAll();
	}
	public void getfoods(Food food) throws Exception{
		hotelRepo.add(food);
		hotelRepoFile.add(food);
	}
	public void getfoods(String foodName,int foodPrice,int nos,String name) throws Exception{
		PreparedStatement p = r.c.prepareStatement("update foodDetails set name = ?,price = ?,nos = ? WHERE name = ?");
		p.setString(1,foodName);
		p.setInt(2,foodPrice);
		p.setInt(3,nos);
		p.setString(4,name);
		p.execute();
		hotelRepoFile.viewAll();
	}
	public void deleteFood(Food food) throws Exception{
		hotelRepo.delete(food);
		hotelRepoFile.delete(food);

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