package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
import java.io.*;
import java.util.*;
import java.sql.*;
public class HotelRepoImpl implements HotelRepo{
	Hotel hotelModel = new Hotel();
	Repo r = new Repo();
	public void viewAll() throws Exception{
		Statement s = r.c.createStatement();
		ResultSet r = s.executeQuery("select * from foodDetails");
		while(r.next()){
			Food food = new Food();
			food.setName(r.getString(2));
			food.setPrice(r.getInt(3));
			food.setNos(r.getInt(4));	
			hotelModel.getFoods().add(food);
		}
	}
	public void add(Food food) throws Exception{
		PreparedStatement p = r.c.prepareStatement("insert into foodDetails(name,price,nos) values(?,?,?)");
		p.setString(1,food.getName());
		p.setInt(2,food.getPrice());
		p.setInt(3,food.getNos());
		p.execute();
	}
	public void delete(Food selectedFood) throws Exception{
		PreparedStatement p =r. c.prepareStatement("delete from foodDetails Where name = ?");
		p.setString(1,selectedFood.getName());
		hotelModel.getFoods().remove(selectedFood);
		p.execute();
	}
	public void searchByName(String name) throws Exception{
		Statement s = r.c.createStatement();
		ResultSet r = s.executeQuery("select * from foodDetails where name = '"+name+"'");
		while(r.next()){
			Food food = new Food();
			food.setName(r.getString(2));
			food.setPrice(r.getInt(3));
			food.setNos(r.getInt(4));
			hotelModel.getFoods().add(food);
		}
	}
	public void searchByPrice(int from,int to) throws Exception{
		Statement s = r.c.createStatement();
		ResultSet r = s.executeQuery("select * from foodDetails where price between "+from+" and "+to);
		while(r.next()){
			Food food = new Food();
			food.setName(r.getString(2));
			food.setPrice(r.getInt(3));
			food.setNos(r.getInt(4));
			hotelModel.getFoods().add(food); 
		}
	}
	public void searchByContains(String name) throws Exception{
		Statement s = r.c.createStatement();
		ResultSet r = s.executeQuery("select * from foodDetails where name like '%"+name+"%'");
		while(r.next()){
			Food food = new Food();
			food.setName(r.getString(2));
			food.setPrice(r.getInt(3));
			food.setNos(r.getInt(4));
			hotelModel.getFoods().add(food);
		}
	}
}