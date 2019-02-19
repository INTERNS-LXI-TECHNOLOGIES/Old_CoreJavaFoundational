package com.lxisoft.hotel.hotel;
import com.lxisoft.hotel.hotel.Food;
import com.lxisoft.hotel.hotel.Bill;
import java.util.*;
import java.io.*;
public class Hotel{
	public Hotel() throws Exception{
		BufferedReader foodDetails = new BufferedReader(new FileReader(new File("FoodDetails.txt")));
			String a;
			while((a=foodDetails.readLine()) != null){
				Food food = new Food();
				String b[] = a.split(",");
				food.setName(b[0]);
				food.setPrice(Integer.parseInt(b[1]));
				food.setNos(Integer.parseInt(b[2]));
				foods.add(food);
			}
	}
	Scanner scan = new Scanner(System.in);
	private ArrayList<Food> foods = new ArrayList<Food>();
	private Bill bill;
	public void addFood() throws Exception{
		BufferedWriter foodDetails = new BufferedWriter(new FileWriter(new File("FoodDetails.txt")));
		int temp;
		do{
		Food food = new Food();
		System.out.print("Food Name : ");
		food.setName(scan.next());
		System.out.print("Food Price : ");
		food.setPrice(scan.nextInt());
		System.out.print("Food Nos : ");
		food.setNos(scan.nextInt());
		foods.add(food);
		System.out.println("Press 1 For Add More Food");
		temp = scan.nextInt();
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
		File f = new File("FoodDetails.txt");
		BufferedReader foodDetails = new BufferedReader(new FileReader(f));
		BufferedWriter addFoodDetails = new BufferedWriter(new FileWriter(new File("FoodDetails.txt")));
		System.out.println("	Available Foods");
		for(Food food : foods){
			System.out.printf("%-2s	%-12s	%-5s	%-4s\n",no,food.getName(),food.getPrice(),food.getNos());
			no++;
		}
		System.out.print("Select Your Food To Edit : ");
		selectedFood = scan.nextInt();
		if(f.exists() == true){
			f.delete();
		}
		System.out.print("Food Name : ");
		foods.get(selectedFood-1).setName(scan.next());
		System.out.print("Food Price : ");
		foods.get(selectedFood-1).setPrice(scan.nextInt());
		System.out.print("Food Nos : ");
		foods.get(selectedFood-1).setNos(scan.nextInt());
		for(Food food : foods){
			String a = food.getName()+","+food.getPrice()+","+food.getNos()+"\n";
			addFoodDetails.write(a);
		}
		addFoodDetails.close();
	}
	public void deleteFood() throws Exception{
		int no = 1;
		int selectedFood;
		File f = new File("FoodDetails.txt");
		BufferedReader foodDetails = new BufferedReader(new FileReader(f));
		BufferedWriter addFoodDetails = new BufferedWriter(new FileWriter(new File("FoodDetails.txt")));
		System.out.println("	Available Foods");
		for(Food food : foods){
			System.out.printf("%-2s	%-12s	%-5s	%-4s\n",no,food.getName(),food.getPrice(),food.getNos());
			no++;
		}
		System.out.print("Select Your Food To Delete : ");
		selectedFood = scan.nextInt();
		if(f.exists() == true){
			f.delete();
		}
		foods.remove(selectedFood-1);
		System.out.println("	Selected Food Was deleted!!");
		for(Food food : foods){
			String a = food.getName()+","+food.getPrice()+","+food.getNos()+"\n";
			addFoodDetails.write(a);
		}
		addFoodDetails.close();
	}
	public void sellFood() throws Exception{
		Map<Integer,Food> selectedFoods = new HashMap<Integer,Food>();
		int no = 1;
		int selectedFood;
		int cont;
		int nos;
		BufferedReader foodDetails = new BufferedReader(new FileReader(new File("FoodDetails.txt")));
		bill = new Bill();
		int i = 0;
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
		selectedFoods.put(i,foods.get(selectedFood-1));
		foods.get(selectedFood-1).setNos(foods.get(selectedFood-1).getNos()-nos);
		System.out.println("Press 1 To Select Again");
		cont = scan.nextInt();
		i++;
		}while(cont == 1);
		System.out.print("Enter Your Name : ");
		bill.setBuyerName(scan.next());
		bill.printBill(selectedFoods);
	}
}