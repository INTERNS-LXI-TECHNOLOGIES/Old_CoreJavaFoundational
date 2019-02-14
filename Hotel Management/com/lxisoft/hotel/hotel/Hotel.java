package com.lxisoft.hotel.hotel;
import com.lxisoft.hotel.hotel.Food;
import com.lxisoft.hotel.hotel.Bill;
import java.util.ArrayList;
import java.util.Scanner;
public class Hotel{
	Scanner scan = new Scanner(System.in);
	private ArrayList<Food> foods = new ArrayList<Food>();
	private Bill bill;
	private int noOfFoodTypes;
	public void addFood(){
		int temp;
		do{
		foods.add(new Food());
		System.out.print("Food Name : ");
		foods.get(noOfFoodTypes).setName(scan.next());
		System.out.print("Food Price : ");
		foods.get(noOfFoodTypes).setPrice(scan.nextInt());
		System.out.print("Food Nos : ");
		foods.get(noOfFoodTypes).setNos(scan.nextInt());
		System.out.println("Press 1 For Add More Food");
		temp = scan.nextInt();
		noOfFoodTypes++;
		}while(temp == 1);
	}
	public void sellFood(){
		int no = 1;
		int selectedFood;
		int cont;
		int nos;
		bill = new Bill();
		do{
		System.out.println("	Available Foods");
		for(Food food : foods){
			System.out.printf("%-2s	%-12s	%-5s	%-4s\n",no,food.getName(),food.getPrice(),food.getNos());
			no++;
		}
		no = 1;
		System.out.print("Select Your Food : ");
		selectedFood = scan.nextInt();
		do{
			System.out.print("Enter Nos : ");
			nos = scan.nextInt();
			if(nos>foods.get(selectedFood-1).getNos()){
				System.out.println("No Of Food Exceed");
			}
		}while(nos>foods.get(selectedFood-1).getNos());
		bill.getFoodNos().add(nos);
		bill.getFoodName().add(foods.get(selectedFood-1).getName());
		bill.getFoodPrice().add(foods.get(selectedFood-1).getPrice());
		foods.get(selectedFood-1).setNos(foods.get(selectedFood-1).getNos()-nos);
		System.out.println("Press 1 To Select Again");
		cont = scan.nextInt();
		}while(cont == 1);
		System.out.print("Enter Your Name : ");
		bill.setBuyerName(scan.next());
		bill.printBill();
	}
}