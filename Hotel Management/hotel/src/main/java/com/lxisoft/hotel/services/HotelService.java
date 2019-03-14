package com.lxisoft.hotel.services;
import com.lxisoft.hotel.model.Food;
import com.lxisoft.hotel.repo.*;
import java.sql.*;
/**
*<h1>Service Class For Hotel</h1>
<p>
*This class is a Service class for Hotel.
*All business logics are done throw this class
*@author Mohammed Anish
*@version 1.1
*/
public class HotelService{
	HotelRepoImpl hotelRepo = new HotelRepoImpl();
	HotelRepoImplFile hotelRepoFile = new HotelRepoImplFile();
	Repo r = new Repo();
	/**
	*this method is for invoking database and file operation
	*@throws Exception
	*/
	public void getFoodDetails() throws Exception{
		hotelRepo.viewAll();
		hotelRepoFile.viewAll();
	}
	/**
	*this method is for senting food for adding foods to db in HotelRepoImpl and HotelRepoImplFile class
	*@param food added food
	*@throws Exception
	*/
	public void getfoods(Food food) throws Exception{
		hotelRepo.add(food);
		hotelRepoFile.add(food);
	}
	/**
	*this method is for editing food details from datadase
	*@param foodName new name of the food 
	*@param foodPrice new price for the food 
	*@param nos new count for no of food
	*@param name older name of the food 
	*@throws Exception
	*/
	public void getfoods(String foodName,int foodPrice,int nos,String name) throws Exception{
		PreparedStatement p = r.c.prepareStatement("update foodDetails set name = ?,price = ?,nos = ? WHERE name = ?");
		p.setString(1,foodName);
		p.setInt(2,foodPrice);
		p.setInt(3,nos);
		p.setString(4,name);
		p.execute();
		hotelRepoFile.viewAll();
	}
	/**
	*this method is used for senting food that need to be deleted to HotelRepoImpl
	*@param selectedFood food that need to be deleted
	*@throws Exception
	*/
	public void deleteFood(Food food) throws Exception{
		hotelRepo.delete(food);
		hotelRepoFile.delete(food);

	}
	/**
	*this method is used for senting name of the food to HotelRepoImpl for search a food by its name
	*@param name name of the food 
	*@throws Exception
	*/
	public void searchByName(String name) throws Exception{
		hotelRepo.searchByName(name);
	}
	/**
	*this method is used for senting staring price and ending price of the food to HotelRepoImpl for search a food by its price
	*@param from starting price for food
	*@param to ending price for food 
	*@throws Exception
	*/
	public void searchByPrice(int from,int to) throws Exception{
		hotelRepo.searchByPrice(from,to);
	}
	/**
	*this method is used for senting name of the food to HotelRepoImpl for search a food by its name tnat contails given name 
	*@param name name of the food 
	*@throws Exception
	*/
	public void searchByContains(String name) throws Exception{
		hotelRepo.searchByContains(name);
	}
}