package com.lxisoft.hotel.hotel;
import com.lxisoft.hotel.food.Food;
import java.io.*;
import java.util.*;
public class HotelController{
	Hotel hotelModel = new Hotel();
	public void hotelController() throws Exception{
		BufferedReader foodDetails = new BufferedReader(new FileReader(new File("FoodDetails.txt")));		
		String a;
			while((a=foodDetails.readLine()) != null){
				Food food = new Food();
				String b[] = a.split(",");
				food.setName(b[0]);
				food.setPrice(Integer.parseInt(b[1]));
				food.setNos(Integer.parseInt(b[2]));
				hotelModel.getFoods().add(food);
			}
	}
	public void addFood(Food food) throws Exception{
		hotelModel.getFoods().add(food);
		BufferedWriter addFoodDetails = new BufferedWriter(new FileWriter(new File("FoodDetails.txt")));
		for(Food foods : hotelModel.getFoods()){
			String a = foods.getName()+","+foods.getPrice()+","+foods.getNos()+"\n";
			addFoodDetails.write(a);
		}
		addFoodDetails.close();
	}
	public void editFood() throws Exception{
		File f = new File("FoodDetails.txt");
		BufferedWriter addFoodDetails = new BufferedWriter(new FileWriter(f));
		if(f.exists() == true){
			f.delete();
		}
		for(Food food : hotelModel.getFoods()){
			String a = food.getName()+","+food.getPrice()+","+food.getNos()+"\n";
			addFoodDetails.write(a);
		}
		addFoodDetails.close();
	}
	public void deleteFood(int selectedFood) throws Exception{
		File f = new File("FoodDetails.txt");
		BufferedWriter addFoodDetails = new BufferedWriter(new FileWriter(f));
		if(f.exists() == true){
			f.delete();
		}
		hotelModel.getFoods().remove(selectedFood);
		for(Food food : hotelModel.getFoods()){
			String a = food.getName()+","+food.getPrice()+","+food.getNos()+"\n";
			addFoodDetails.write(a);
		}
		addFoodDetails.close();
	}
}