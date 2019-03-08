package com.lxisoft.hotel.repo;
import com.lxisoft.hotel.model.*;
import java.io.*;
public class HotelRepoImplFile implements HotelRepo{
	Hotel hotelModel = new Hotel();
	public void add(Food food)  throws Exception{
		viewAll();
	}
	public void delete(Food selectedFood) throws Exception{
		viewAll();
	}
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