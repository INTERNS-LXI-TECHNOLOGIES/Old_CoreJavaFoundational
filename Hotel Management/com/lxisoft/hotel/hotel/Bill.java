package com.lxisoft.hotel.hotel;
import java.util.ArrayList;
public class Bill{
	private String buyerName;
	private ArrayList<String> foodNames = new ArrayList<String>();
	private ArrayList<Integer> foodNos = new ArrayList<Integer>();
	private ArrayList<Integer> foodPrices = new ArrayList<Integer>();
	public void setBuyerName(String buyerName){
		this.buyerName = buyerName;
	}
	public String getBuyerName(){
		return buyerName;
	}
	public void setFoodName(ArrayList<String> foodNames){
		this.foodNames = foodNames;
	}
	public ArrayList<String> getFoodName(){
		return foodNames;
	}
	public void setFoodPrice(ArrayList<Integer> foodPrices){
		this.foodPrices = foodPrices;
	}
	public ArrayList<Integer> getFoodPrice(){
		return foodPrices;
	}
	public void setFoodNos(ArrayList<Integer> foodNos){
		this.foodNos = foodNos;
	}
	public ArrayList<Integer> getFoodNos(){
		return foodNos;
	}
	public void printBill(){
		int totalPrice = 0;
		System.out.println("--------------------------------------");
		System.out.println("\n\n	Hotel White Sand\n 	   Pathripala\n");
		System.out.println("Coustemer Name : "+buyerName+"\n");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","Sl.No","Name","Rate","Prize");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","-----","----","----","-----");
		for(int i=0;i<foodNames.size();i++){
			System.out.printf("%-5s	%-12s	%-5s	%-5s\n",i+1,foodNames.get(i),foodPrices.get(i),foodPrices.get(i)*foodNos.get(i));
			totalPrice = totalPrice+foodNos.get(i)*foodPrices.get(i);
		}
		System.out.printf("\n%-15s	%-5s\n","Total Amount : 		",totalPrice);
		System.out.println("--------------------------------------");
	}
}