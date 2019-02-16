package com.lxisoft.hotel.hotel;
import com.lxisoft.hotel.hotel.Food;
import com.lxisoft.hotel.hotel.Bill;
import java.util.*;
import java.io.*;
public class Hotel{
	public Hotel() throws Exception{
		//ObjectInputStream foodDetails = new ObjectInputStream(new FileInputStream("FoodDetails.txt"));
		BufferedReader foodDetails = new BufferedReader(new FileReader(new File("FoodDetails.txt")));
			int c=0;
			String a;
			while((a=foodDetails.readLine()) != null){
				foods.add(new Food());
				String b[] = a.split(",");
				foods.get(c).setName(b[0]);
				foods.get(c).setPrice(Integer.parseInt(b[1]));
				foods.get(c).setNos(Integer.parseInt(b[2]));
				noOfFoodTypes++;
				c++;
			}
	}
	Scanner scan = new Scanner(System.in);
	private ArrayList<Food> foods = new ArrayList<Food>();
	private Bill bill;
	private int noOfFoodTypes;
	public void addFood() throws Exception{
		BufferedWriter foodDetails = new BufferedWriter(new FileWriter(new File("FoodDetails.txt")));
		//ObjectOutputStream foodDetails = new ObjectOutputStream(new FileOutputStream("FoodDetails.txt"));
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
		for(Food food : foods){
			String a = food.getName()+","+food.getPrice()+","+food.getNos()+"\n";
			foodDetails.write(a);
		}
		foodDetails.close();
	}
	public void editFood() throws Exception{
		int no = 1;
		int selectedFood;
		System.out.println("	Available Foods");
		for(Food food : foods){
			System.out.printf("%-2s	%-12s	%-5s	%-4s\n",no,food.getName(),food.getPrice(),food.getNos());
			no++;
		}
		System.out.print("Select Your Food To Edit : ");
		selectedFood = scan.nextInt();
		System.out.print("Food Name : ");
		foods.get(selectedFood-1).setName(scan.next());
		System.out.print("Food Price : ");
		foods.get(selectedFood-1).setPrice(scan.nextInt());
		System.out.print("Food Nos : ");
		foods.get(selectedFood-1).setNos(scan.nextInt());
	}
	public void sellFood() throws Exception{
		int no = 1;
		int selectedFood;
		int cont;
		int nos;
		BufferedReader foodDetails = new BufferedReader(new FileReader(new File("FoodDetails.txt")));
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