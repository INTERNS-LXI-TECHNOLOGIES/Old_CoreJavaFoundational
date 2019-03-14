package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
/**
*<h1>Repo Interface For Hotel</h1>
<p>
*This interface is for crud operation 
*@author Mohammed Anish
*@version 1.1
*/

public interface HotelRepo{
	/**
	*this abstract method is for senting food for adding foods to db.
	*@param food added food
	*@throws Exception
	*/
	public void add(Food food)  throws Exception;
	/**
	*this abstract method is used for senting food that need to be deleted
	*@param selectedFood food that need to be deleted
	*@throws Exception
	*/
	public void delete(Food selectedFood) throws Exception;
	/**
	*this abstract method is viewing all foods from database.
	*@throws Exception
	*/
	public void viewAll() throws Exception;
	/**
	*this abstract method is used for senting name of the food for search a food by its name
	*@param name name of the food 
	*@throws Exception
	*/
	public void searchByName(String name) throws Exception;
	/**
	*this abstract method is used for senting staring price and ending price of the food for search a food by its price
	*@param from starting price for food
	*@param to ending price for food 
	*@throws Exception
	*/
	public void searchByPrice(int from,int to) throws Exception;
}