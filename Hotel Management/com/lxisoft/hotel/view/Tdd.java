package com.lxisoft.hotel.view;
import com.lxisoft.hotel.controller.*;
import com.lxisoft.hotel.model.*;
import com.lxisoft.hotel.services.*;
import java.util.*;
import java.io.*;
public class Tdd{
	static Scanner scan = new Scanner(System.in);
	static HotelController hotelController = new HotelController();
	static BillController bill = new BillController();
	public static void main(String[] args) throws Exception{
		administrator();
	}
	public static void administrator() throws Exception{
		Console c = System.console();
		int cont;
		char[] p;
		File f = new File("up.properties");
		Properties up = new Properties();
		up.setProperty("adminusername","admin");
		up.setProperty("adminpassword","ADMIN");
		up.setProperty("userusername","user");
		up.setProperty("userpassword","USER");
		up.store(new FileWriter(f),"Properties");
		do{
		System.out.println("	Select From Below\n"+" Admin\n"+" User");
		String user = scan.next();
		if(user.toUpperCase().equals(up.getProperty("adminpassword"))){
			System.out.print("Password : ");
			p = c.readPassword();
			String password = String.valueOf(p);
			if(password.equals("admin")){
				System.out.println("1.Add Food\n2.Edit Food\n3.Delete Food");
				int select = scan.nextInt();
				hotelController.callHotelRepo();
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
		else if(user.toUpperCase().equals(up.getProperty("userpassword"))){
			System.out.print("Password : ");
			p = c.readPassword();
			String password = String.valueOf(p);
			if(password.equals("user")){
				System.out.println("1.View All\n2.Search By Name\n3.Search By Price\n4.Search By Contains");
				int select = scan.nextInt();
				switch(select){
					case 1:
					hotelController.callHotelRepo();
					sellFoodView();
					hotelController.getFoods().clear();
					break;
					case 2:
					searchByNameView();
					hotelController.getFoods().clear();
					break;
					case 3:
					searchByPriceView();
					hotelController.getFoods().clear();
					break;
					case 4:
					searchByContainsView();
					hotelController.getFoods().clear();
					break;
				}
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
		hotelController.addFood(food);
		System.out.println("Press 1 For Add More Food");
		temp = scan.nextInt();
		}while(temp == 1);
	}
	public static void editFoodView() throws Exception{
		Food selectedFood = foodSelecting();
		String temp = selectedFood.getName();
		System.out.print("Food Name : ");
		selectedFood.setName(scan.next());
		System.out.print("Food Price : ");
		selectedFood.setPrice(scan.nextInt());
		System.out.print("Food Nos : ");
		selectedFood.setNos(scan.nextInt());
		hotelController.editFood(selectedFood.getName(),selectedFood.getPrice(),selectedFood.getNos(),temp);
	}
	public static void deleteFoodView() throws Exception{
		Food selectedFood = foodSelecting();
		System.out.println("	Selected Food Was deleted!!");
		hotelController.deleteFood(selectedFood);
	}
	public static void sellFoodView() throws Exception{
		Map<Integer,Food> selectedFoods = new HashMap<Integer,Food>();
		int nos;
		int i=0;
		int cont = 0;
		do{
		Food selectedFood = foodSelecting();
		do{
			System.out.print("Enter Nos : ");
			nos = scan.nextInt();
			if(nos>selectedFood.getNos()){
				System.out.println("No Of Food Exceed");
			}
		}while(nos>selectedFood.getNos());
		bill.getFoodNos().add(nos);
		selectedFoods.put(i,selectedFood);
		selectedFood.setNos(selectedFood.getNos()-nos);
		System.out.println("Press 1 To Select Again");
		cont = scan.nextInt();
		i++;
		}while(cont == 1);
		System.out.print("Enter Your Name : ");
		bill.setBuyerName(scan.next());
		printBill(selectedFoods);
	}
	public static void searchByNameView() throws Exception{
		System.out.print("Enter Food Name : ");
		String name = scan.next();
		hotelController.searchByName(name);
		sellFoodView();
	}
	public static void searchByContainsView() throws Exception{
		System.out.print("Enter Food Name : ");
		String name = scan.next();
		hotelController.searchByContains(name);
		sellFoodView();
	}
	public static void searchByPriceView() throws Exception{
		System.out.print("Enter Price From ");
		int a = scan.nextInt();
		System.out.print("Enter Price To ");
		int b = scan.nextInt();
		hotelController.searchByPrice(a,b);
		sellFoodView();
	}
	public static Food foodSelecting(){
		int no = 1;
		int selectedFood;
		System.out.println("	Available Foods");
		for(Food food : hotelController.getFoods()){
			System.out.printf("%-2s	%-12s	%-5s	%-4s\n",no,food.getName(),food.getPrice(),food.getNos());
			no++;
		}
		no = 1;
		System.out.print("Select Your Food : ");
		selectedFood = scan.nextInt();
		return  hotelController.getFoods().get(selectedFood-1);
	}
	public static void printBill(Map<Integer,Food> selectedfoods){
		int totalPrice = 0;
		System.out.println("--------------------------------------");
		System.out.println("\n\n	Hotel White Sand\n 	   Pathripala\n");
		System.out.println("Coustemer Name : "+bill.getBuyerName()+"\n");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","Sl.No","Name","Rate","Prize");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","-----","----","----","-----");
		for(int i=0;i<selectedfoods.size();i++){
			System.out.printf("%-5s	%-12s	%-5s	%-5s\n",i+1,selectedfoods.get(i).getName(),selectedfoods.get(i).getPrice(),bill.foodPrice(selectedfoods.get(i).getPrice(),bill.getFoodNos().get(i)));
		}
		System.out.printf("\n%-15s	%-5s\n","Total Amount : 		",bill.totalBill(selectedfoods));
		System.out.println("--------------------------------------");
	}
}