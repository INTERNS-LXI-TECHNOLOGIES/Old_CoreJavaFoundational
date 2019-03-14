package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
import java.io.*;
import java.util.*;
import java.sql.*;
/**
*<h1>Repo class For Hotel</h1>
<p>
*This class is for crud operation that implements from HotelRepo interface
*@author Mohammed Anish
*@version 1.1
*/
public class HotelRepoImpl implements HotelRepo{
	Hotel hotelModel = new Hotel();
	Repo r = new Repo();
	/**
	*this overridden method is for getting all foods from database 
	*and sent it to HotelModel class for stoting it to a ArrayList
	*@throws Exception
	*/
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
	/**
	*this overridden method is for adding foods to db.
	*@param food added food
	*@throws Exception
	*/
	public void add(Food food) throws Exception{
		PreparedStatement p = r.c.prepareStatement("insert into foodDetails(name,price,nos) values(?,?,?)");
		p.setString(1,food.getName());
		p.setInt(2,food.getPrice());
		p.setInt(3,food.getNos());
		p.execute();
	}
	/**
	*this overridden method is used for senting food that need to be deleted
	*and sent the update to HotelModel class for stoting it to a ArrayList
	*@param selectedFood food that need to be deleted
	*@throws Exception
	*/
	public void delete(Food selectedFood) throws Exception{
		PreparedStatement p =r. c.prepareStatement("delete from foodDetails Where name = ?");
		p.setString(1,selectedFood.getName());
		hotelModel.getFoods().remove(selectedFood);
		p.execute();
	}
	/**
	*this overridden method is used for search a food by its name
	*and sent it to HotelModel class for stoting it to a ArrayList
	*@param name name of the food 
	*@throws Exception
	*/
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
	/**
	*this abstract method is used for search a food by its price
	*and sent it to HotelModel class for stoting it to a ArrayList
	*@param from starting price for food
	*@param to ending price for food 
	*@throws Exception
	*/
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
	/**
	*this method is used for search a food by its name tnat contails given name 
	*and sent it to HotelModel class for stoting it to a ArrayLists
	*@param name name of the food 
	*@throws Exception
	*/
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