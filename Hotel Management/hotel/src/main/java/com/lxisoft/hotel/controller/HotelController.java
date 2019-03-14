package com.lxisoft.hotel.controller;
import com.lxisoft.hotel.model.Food;
import com.lxisoft.hotel.services.*;
import com.lxisoft.hotel.model.Hotel;
import java.util.*;
/**
*<h1>Controller Class For Hotel</h1>
<p>
*This class is used for getting data from View class and senting data to UserService Class.
*@author Mohammed Anish
*@version 1.1
*/
public class HotelController{
	HotelService hotelService = new HotelService();
	Hotel hotel = new Hotel();
	/**
	*this method is for calling getFoodDetails in HotelService class
	*@throws Exception
	*/
	public void callHotelRepo() throws Exception{
		hotelService.getFoodDetails();
	}
	/**
	*this method is for senting food for adding foods to db in HotelService class
	*@param food added food
	*@throws Exception
	*/
	public void addFood(Food food) throws Exception{
		hotelService.getfoods(food);
	}
	/**
	*this method is for senting foods to HotelService class for editing food details
	*@param foodName new name of the food 
	*@param foodPrice new price for the food 
	*@param nos new count for no of food
	*@param name older name of the food 
	*@throws Exception
	*/
	public void editFood(String foodName,int foodPrice,int nos,String name) throws Exception{
		hotelService.getfoods(foodName,foodPrice,nos,name);
	}
	/**
	*this method is used for senting food that need to be deleted to HotelService
	*@param selectedFood food that need to be deleted
	*@throws Exception
	*/
	public void deleteFood(Food selectedFood) throws Exception{
		hotelService.deleteFood(selectedFood);
	}
	/**
	*this method is used for senting name of the food to Hotel Service for search a food by its name
	*@param name name of the food 
	*@throws Exception
	*/
	public void searchByName(String name) throws Exception{
		hotelService.searchByName(name);
	}
	/**
	*this method is used for senting staring price and ending price of the food to Hotel Service for search a food by its price
	*@param from starting price for food
	*@param to ending price for food 
	*@throws Exception
	*/
	public void searchByPrice(int from,int to) throws Exception{
		hotelService.searchByPrice(from,to);
	}
	/**
	*this method is used for senting name of the food to Hotel Service for search a food by its name tnat contails given name 
	*@param name name of the food 
	*@throws Exception
	*/
	public void searchByContains(String name) throws Exception{
		hotelService.searchByContains(name);
	}
	/**
	*this method is for getting all foods from foods ArrayList
	*@return ArrayList of foods
	*/
	public ArrayList<Food> getFoods(){
		return hotel.getFoods();
	}
}