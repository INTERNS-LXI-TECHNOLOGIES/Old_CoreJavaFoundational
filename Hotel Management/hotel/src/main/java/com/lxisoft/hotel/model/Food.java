package com.lxisoft.hotel.model;
import java.io.*;
/**
*<h1>Model Class For Food</h1>
<p>
*This class is a Model class for Food.
*@author Mohammed Anish
*@version 1.1
*/
public class Food implements Comparable<Food>{
	private String name;
	private int price;
	private int nos;
	/**
	*this method is a setter method for name
	*@param name name of the food 
	*/
	public void setName(String name){
		this.name = name;
	}
	/**
	*this method is a getter method for name
	*@return food Name
	*/
	public String getName(){
		return name;
	}
	/**
	*this method is a setter method for price
	*@param price price of the food 
	*/
	public void setPrice(int price){
		this.price = price;
	}
	/**
	*this method is a getter method for price
	*@return price of the food
	*/
	public int getPrice(){
		return price;
	}
	/**
	*this method is a setter method for nos
	*@param nos no of food 
	*/
	public void setNos(int nos){
		this.nos = nos;
	}
	/**
	*this method is a getter method for nos
	*@return no of foods
	*/
	public int getNos(){
		return nos;
	}
	/**
	*this is overridden method from Object
	*@return name price and nos sepeareted by comma
	*/
	public String toString(){
		return name+","+price+","+nos;
	}
	/**
	*this is overridden method from comparable interface
	*@return negative,positive or 0 
	*/
	public int compareTo(Food a){
		return this.name.compareTo(a.name);
	}
}