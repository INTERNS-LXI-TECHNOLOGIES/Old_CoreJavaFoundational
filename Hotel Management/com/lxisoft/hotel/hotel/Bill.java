package com.lxisoft.hotel.hotel;
import java.util.*;
public class Bill{
	private String buyerName;
	private List foodDetails = new ArrayList<Food>();
	private ArrayList<Integer> foodNos = new ArrayList<Integer>();
	public void setBuyerName(String buyerName){
		this.buyerName = buyerName;
	}
	public String getBuyerName(){
		return buyerName;
	}
	public void setFoodNos(ArrayList<Integer> foodNos){
		this.foodNos = foodNos;
	}
	public ArrayList<Integer> getFoodNos(){
		return foodNos;
	}
	public void printBill(Map<Integer,Food> selectedfoods){
		int totalPrice = 0;
		System.out.println("--------------------------------------");
		System.out.println("\n\n	Hotel White Sand\n 	   Pathripala\n");
		System.out.println("Coustemer Name : "+buyerName+"\n");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","Sl.No","Name","Rate","Prize");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","-----","----","----","-----");
		for(int i=0;i<selectedfoods.size();i++){
			System.out.printf("%-5s	%-12s	%-5s	%-5s\n",i+1,selectedfoods.get(i).getName(),selectedfoods.get(i).getPrice(),selectedfoods.get(i).getPrice()*foodNos.get(i));
			totalPrice = totalPrice+foodNos.get(i)*selectedfoods.get(i).getPrice();
		}
		System.out.printf("\n%-15s	%-5s\n","Total Amount : 		",totalPrice);
		System.out.println("--------------------------------------");
	}
}