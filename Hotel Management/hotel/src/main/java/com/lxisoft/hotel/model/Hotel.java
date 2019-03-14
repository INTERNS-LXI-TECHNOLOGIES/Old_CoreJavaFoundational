package com.lxisoft.hotel.model;
import com.lxisoft.hotel.model.Food;
import java.util.*;
import java.io.*;
/**
*<h1>Model Class For Hotel</h1>
<p>
*This class is a Model class for Hotel.
*@author Mohammed Anish
*@version 1.1
*/
public class Hotel{	
	private static ArrayList<Food> foods = new ArrayList<Food>();
	private static TreeSet<Room> rooms = new TreeSet<Room>();
	/**
	*this method is a setter method for foods ArrayList
	*@param foods ArrayList of the food 
	*/
	public void setFoods(ArrayList<Food> foods){
		this.foods = foods;
	}
	/**
	*this method is a getter method for foods ArrayList
	*@return ArrayList of foods
	*/
	public ArrayList<Food> getFoods(){
		return foods;
	}
	/**
	*this method is a setter method for rooms TreeSet
	*@param rooms rooms
	*/
	public void setRooms(TreeSet<Room> rooms){
		this.rooms = rooms;
	}
	/**
	*this method is a getter method for TreeSet of rooms
	*@return TreeSet of rooms
	*/
	public TreeSet<Room> getRooms(){
		return rooms;
	}
}