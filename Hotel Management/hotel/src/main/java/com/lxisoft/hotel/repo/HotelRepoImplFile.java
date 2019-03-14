package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
import java.io.*;
/**
*<h1>File Repo class For Hotel</h1>
<p>
*This class is for crud operation in file that implements from HotelRepo interface
*@author Mohammed Anish
*@version 1.1
*/
public class HotelRepoImplFile implements HotelRepo{
	Hotel hotelModel = new Hotel();
	/**
	*this overridden method is for adding foods to file.
	*@param food added food
	*@throws Exception
	*/
	public void add(Food food)  throws Exception{
		viewAll();
	}
	/**
	*this overridden method is used for senting food that need to be deleted from file
	*@param selectedFood food that need to be deleted
	*@throws Exception
	*/
	public void delete(Food selectedFood) throws Exception{
		viewAll();
	}
	/**
	*this overridden method is for getting all foods from file 
	*@throws Exception
	*/
	public void viewAll() throws Exception{
		File f = new File("FoodDetails.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		for(Food food : hotelModel.getFoods()){
			if(f.exists()){
				f.delete();
				bw.write(food+"\n");
			}
		}
		bw.close();
	}
	public void searchByName(String name) throws Exception{

	}
	public void searchByPrice(int from,int to) throws Exception{

	}
}