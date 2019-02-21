package com.lxisoft.hotel.test;
import com.lxisoft.hotel.hotel.*;
import com.lxisoft.hotel.bill.*;
import com.lxisoft.hotel.food.Food;
import java.util.*;
import java.io.*;
public class Tdd{
	static Scanner scan = new Scanner(System.in);
	static HotelController hotel = new HotelController();
	static Hotel hotelModel = new Hotel();
	static Bill bill = new Bill();
	public static void main(String[] args) throws Exception{
		administrator();
	}
	public static void administrator() throws Exception{
		Console c = System.console();
		hotel.hotelController();
		int cont;
		char[] p;
		do{
		System.out.println("	Select From Below\n"+" Admin\n"+" User");
		String user = scan.next();
		if(user.toUpperCase().equals("ADMIN")){
			System.out.print("Password : ");
			p = c.readPassword();
			String password = String.valueOf(p);
			if(password.equals("admin")){
				System.out.println("1.Add Food\n2.Edit Food\n3.Delete Food");
				int select = scan.nextInt();
				switch(select){
					case 1:
					addFoodView();
					break;
					case 2:
					editFoodView();
					break;
					case 3:
					deleteFoodView();
					break;
				}
			}
			else{
				System.out.println("	Wrong Password");
			}
		}
		else if(user.toUpperCase().equals("USER")){
			System.out.print("Password : ");
			p = c.readPassword();
			String password = String.valueOf(p);
			if(password.equals("user")){
				sellFoodView();
			}
			else{
				System.out.println("	Wrong Password");
			}
		}
		else{
			System.out.println("	Invalid Entry");
		}
		System.out.println("Press 1 To Continue");
		cont = scan.nextInt();
		}while(cont == 1);
	}
	public static void addFoodView() throws Exception{
		int temp;
		do{
		Food food = new Food();
		System.out.print("Food Name : ");
		food.setName(scan.next());
		System.out.print("Food Price : ");
		food.setPrice(scan.nextInt());
		System.out.print("Food Nos : ");
		food.setNos(scan.nextInt());
		hotel.addFood(food);
		System.out.println("Press 1 For Add More Food");
		temp = scan.nextInt();
		}while(temp == 1);
	}
	public static void editFoodView() throws Exception{
		int selectedFood = foodSelecting();
		System.out.print("Food Name : ");
		hotelModel.getFoods().get(selectedFood).setName(scan.next());
		System.out.print("Food Price : ");
		hotelModel.getFoods().get(selectedFood).setPrice(scan.nextInt());
		System.out.print("Food Nos : ");
		hotelModel.getFoods().get(selectedFood).setNos(scan.nextInt());
		hotel.editFood();
	}
	public static void deleteFoodView() throws Exception{
		int selectedFood = foodSelecting();
		System.out.println("	Selected Food Was deleted!!");
		hotel.deleteFood(selectedFood);
	}
	public static void sellFoodView() throws Exception{
		Map<Integer,Food> selectedFoods = new HashMap<Integer,Food>();
		int nos;
		int i=0;
		int cont = 0;
		do{
		int selectedFood = foodSelecting();
		do{
			System.out.print("Enter Nos : ");
			nos = scan.nextInt();
			if(nos>hotelModel.getFoods().get(selectedFood).getNos()){
				System.out.println("No Of Food Exceed");
			}
		}while(nos>hotelModel.getFoods().get(selectedFood).getNos());
		bill.getFoodNos().add(nos);
		selectedFoods.put(i,hotelModel.getFoods().get(selectedFood));
		hotelModel.getFoods().get(selectedFood).setNos(hotelModel.getFoods().get(selectedFood).getNos()-nos);
		System.out.println("Press 1 To Select Again");
		cont = scan.nextInt();
		i++;
		}while(cont == 1);
		System.out.print("Enter Your Name : ");
		bill.setBuyerName(scan.next());
		printBill(selectedFoods);
	}
	public static int foodSelecting(){
		int no = 1;
		int selectedFood;
		System.out.println("	Available Foods");
		for(Food food : hotelModel.getFoods()){
			System.out.printf("%-2s	%-12s	%-5s	%-4s\n",no,food.getName(),food.getPrice(),food.getNos());
			no++;
		}
		no = 1;
		System.out.print("Select Your Food : ");
		selectedFood = scan.nextInt();
		return selectedFood-1;
	}
	public static void printBill(Map<Integer,Food> selectedfoods){
		int totalPrice = 0;
		System.out.println("--------------------------------------");
		System.out.println("\n\n	Hotel White Sand\n 	   Pathripala\n");
		System.out.println("Coustemer Name : "+bill.getBuyerName()+"\n");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","Sl.No","Name","Rate","Prize");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","-----","----","----","-----");
		for(int i=0;i<selectedfoods.size();i++){
			System.out.printf("%-5s	%-12s	%-5s	%-5s\n",i+1,selectedfoods.get(i).getName(),selectedfoods.get(i).getPrice(),selectedfoods.get(i).getPrice()*bill.getFoodNos().get(i));
			totalPrice = totalPrice+bill.getFoodNos().get(i)*selectedfoods.get(i).getPrice();
		}
		System.out.printf("\n%-15s	%-5s\n","Total Amount : 		",totalPrice);
		System.out.println("--------------------------------------");
	}
}