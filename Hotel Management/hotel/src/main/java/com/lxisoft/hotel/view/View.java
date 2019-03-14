package com.lxisoft.hotel.view;
import com.lxisoft.hotel.controller.*;
import com.lxisoft.hotel.model.*;
import com.lxisoft.hotel.services.*;
import com.lxisoft.hotel.logger.*;
import java.util.*;
import java.text.*;
import java.io.*;
/**
*<h1>View Class For Hotel Managemet</h1>
<p>
*This class is used for view and getting inputs from user.
*@author Mohammed Anish
*@version 1.1
*/
public class View{
	static Scanner scan = new Scanner(System.in);
	static HotelController hotelController = new HotelController();
	static BillController bill = new BillController();
	static UserController uc = new UserController();
	static RoomController room = new RoomController();
	static Log log = new Log();
	/**
	*This is a main method which makes use of administrater method
	*@param args unused
	*@exception Exception
	*/
	public static void main(String[] args) throws Exception{
		log.log.info("***Entered main method***");
		administrator();
		log.log.info("***Exited main method***");
	}
	/**
	*This method is used for displaying login menu 
	*it will show two options:
	*1.Admin
	*2.User
	*<p>If you select admin it will display 4 options that is
	*for add food,edit food,delete food and getting previous bills
	*the method for given options are addFoodView,editFoodView,
	*deleteFoodView,getPrevBillname this method are for only calling the
	*front end of the admin page.
	*@exception Exception
	*/
	public static void administrator() throws Exception{
		log.log.info("***Entered Aniministrator method***");
		log.log.warn("***May cause Exception***");
		Console c = System.console();
		int cont;
		char[] p;
		File f = new File("up.properties");
		Properties up = new Properties();
		up.setProperty("adminusername","USER");
		up.setProperty("adminpassword","ADMIN");
		up.setProperty("userusername","USER");
		up.setProperty("userpassword","USER");
		up.store(new FileWriter(f),"Properties");
		do{
		System.out.println("	Select From Below\n"+" Admin\n"+" User");
		String user = scan.next();
		if(user.equalsIgnoreCase("admin")){
			System.out.print("Password : ");
			p = c.readPassword();
			String password = String.valueOf(p);
			if(password.equals("admin")){
				System.out.println("1.Add Food\n2.Edit Food\n3.Delete Food\n4.View Bill");
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
					case 4:
					getPrevBillName();
					break;
				}
			}
			else{
				System.out.println("	Wrong Password");
			}
		}
		else if(user.equalsIgnoreCase("user")){
			System.out.println("1.Register\n2.Log in");
			int choice = scan.nextInt();
			switch(choice){
				case 1:
				registerUser();
				break;
				case 2:
				login();
				break;
			}	
		}
		else{
			System.out.println("	Invalid Entry");
		}
		System.out.println("Press 1 To Continue");
		cont = scan.nextInt();
		}while(cont == 1);
		log.log.info("***Exited Aniministrator method***");
	}
	/**
	*This method is for Registering User.
	*every time you call this method it will create new User 
	*and sent datas to registerUser method in UserController class
	*@see UserController
	*@exception Exception
	*/
	public static void registerUser() throws Exception{
		User user = new User();
		boolean a;
		do{
		System.out.print("Enter emai id :");
		user.setEmailid(scan.next());
		System.out.print("Enter Mobile No : ");
		user.setMobno(scan.next());
		System.out.print("Enter password : ");
		user.setPassword(scan.next());
		a = uc.registerUser(user.getEmailid(),user.getMobno(),user.getPassword());
		if(a==false){
			System.out.println("Entered details Doesn't match ");
		}
		else{
			System.out.println("Registration Succes ");
		}
		}while(a == false);
	}
	/**
	*This method is for login User.
	*this method will get email as a input from user and sent it to 
	*login method in UserController for checking whether it,s correct or 
	*not and if correct it will ask for password and if password also true,
	*will display user login page that contains sellFoodView, searchByNameView,
	*searchByPriceView and searchByContainsView method
	*@see UserController
	*@exception Exception
	*@see Exception 
	*/
	public static void login() throws Exception{
		 Console c = System.console();
		 char[] p;
		 String email;
		 String a;
	do{
		 System.out.print("Enter email id :");
		 email = scan.next();
		 a = uc.login(email);
		 if(a == null ){
		 	System.out.println("Wrong Email Id Try Again");
		 }
		}while(a == null);
		 System.out.print("Enter password :");
		 p = c.readPassword();
		 String password = String.valueOf(p);
		 if(a.equals(password)){
		 	System.out.println("1.Room Booking\n 2.Sell Food");
		 	int s = scan.nextInt();
		 	if(s==2){
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
			else if(s==1){
				roomView();
			}
			}
			else{
				System.out.println("	Wrong Password");
			}
	}
	/**
	*This method is used for add foods to foods array in HotelController class
	*@see HotelController
	*@exception Exception
	*/
	public static void addFoodView() throws Exception{
		log.log.info("***Entered addFoodView method***");
		log.log.warn("***May cause Exception***");
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
		log.log.info("***Exited addFoodView method***");
	}
	/**
	*This method is used for edit foods on ArrayList in HotelController class
	*@see HotelController
	*@exception Exception
	*/
	public static void editFoodView() throws Exception{
		log.log.info("***Entered editFoodView method***");
		log.log.warn("***May cause Exception***");
		Food selectedFood = foodSelecting();
		String temp = selectedFood.getName();
		System.out.print("Food Name : ");
		selectedFood.setName(scan.next());
		System.out.print("Food Price : ");
		selectedFood.setPrice(scan.nextInt());
		System.out.print("Food Nos : ");
		selectedFood.setNos(scan.nextInt());
		hotelController.editFood(selectedFood.getName(),selectedFood.getPrice(),selectedFood.getNos(),temp);
		log.log.info("***Exited editFoodView method***");
	}
	/**
	*This method is used for delete foods in foods ArrayList in HotelController class
	*@see HotelController
	*@exception Exception
	*/
	public static void deleteFoodView() throws Exception{
		log.log.info("***Entered deleteFoodView method***");
		log.log.warn("***May cause Exception***");
		Food selectedFood = foodSelecting();
		System.out.println("	Selected Food Was deleted!!");
		hotelController.deleteFood(selectedFood);
		log.log.info("***Exited deleteFoodView method***");
	}
	/**
	*This method is used for sell foods.
	*this method using foodSelecting method for seleting foods,
	*and store selected foods in  selectedFoods HashMap and also sent
	*selectedFoods HashMap to printBill method as parameter
	*@exception Exception
	*/
	public static void sellFoodView() throws Exception{
		log.log.info("***Entered sellFoodView method***");
		log.log.warn("***May cause Exception***");
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
		log.log.info("***Exited sellFoodView method***");
	}
	/**
	*This method is view for searching foods by its name this method
	*gets food name from user and sent food name to searchByName 
	*method in HotelController class
	*@see HotelController
	*@exception Exception
	*/
	public static void searchByNameView() throws Exception{
		log.log.info("***Entered searchByNameView method***");
		log.log.warn("***May cause Exception***");
		System.out.print("Enter Food Name : ");
		String name = scan.next();
		hotelController.searchByName(name);
		sellFoodView();
		log.log.info("***Exited searchByNameView method***");
	}
	/**
	*This method is view for searching foods by its name that cntains given string. this method
	*gets food string  from user and sent food that string to searchByContains 
	*method in HotelController class
	*@see HotelController
	*@exception Exception
	*/
	public static void searchByContainsView() throws Exception{
		log.log.info("***Entered searchByContainsView method***");
		log.log.warn("***May cause Exception***");
		System.out.print("Enter Food Name : ");
		String name = scan.next();
		hotelController.searchByContains(name);
		sellFoodView();
		log.log.info("***Exited searchByContainsView method***");
	}
	/**
	*This method is view for searching foods by its price this method
	*gets food starting price and ending from user and sent that prices to searchByPrice 
	*method in HotelController class
	*@see HotelController
	*@exception Exception
	*/
	public static void searchByPriceView() throws Exception{
		log.log.info("***Entered searchByPriceView method***");
		log.log.warn("***May cause Exception***");
		System.out.print("Enter Price From ");
		int a = scan.nextInt();
		System.out.print("Enter Price To ");
		int b = scan.nextInt();
		hotelController.searchByPrice(a,b);
		sellFoodView();
		log.log.info("***Exited searchByPriceView method***");
	}
	/**
	*This method is view for food Selecting,
	*this method prints all available foods from foods array in HotelController
	*class and gets a int from user an convert it into corresponting foods and retun that
	*food
	*@return Food
	*@see HotelController
	*/
	public static Food foodSelecting(){
		log.log.info("***Entered foodSelecting method***");
		TreeSet<Food> foods = new TreeSet<Food>((Food a,Food b)->{return a.getName().compareTo(b.getName());});
		for(Food food : hotelController.getFoods()){
			foods.add(food);
		}
		int no = 1;
		int selectedFood;
		System.out.println("	Available Foods");
		for(Food food : foods){
			System.out.printf("%-2s	%-12s	%-5s	%-4s\n",no,food.getName(),food.getPrice(),food.getNos());
			no++;
		}
		no = 1;
		System.out.print("Select Your Food : ");
		selectedFood = scan.nextInt();
		log.log.info("***Exited foodSelecting method***");
		return  hotelController.getFoods().get(selectedFood-1);
	}
	/**
	*This method is for printing bill
	*
	*@see HotelController
	*@exception Exception
	*/
	public static void printBill(Map<Integer,Food> selectedfoods) throws Exception{
		Date date = new Date();
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat t = new SimpleDateFormat("hh:mm:ss");
		String da = d.format(date);
		String ti = t.format(date);
		log.log.info("***Entered printBill method***");
		log.log.warn("***May cause Exception***");
		File f = new File("billNo.properties");
		Properties billNo = new Properties();
		billNo.load(new FileReader(f));
		int totalPrice = 0;
		String foodName = "," ;
		String foodPrice = ",";
		String foodNos = ",";
		System.out.println("--------------------------------------");
		System.out.println("\n\n	Hotel White Sand\n 	   Pathripala\n");
		System.out.println("Coustemer Name : "+bill.getBuyerName()+"\n");
		System.out.println("Date : "+da+"\n");
		System.out.println("Time : "+ti+"\n");
		System.out.println("Bill No : "+billNo.getProperty("LastBillNo")+"\n");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","Sl.No","Name","Rate","Prize");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","-----","----","----","-----");
		for(int i=0;i<selectedfoods.size();i++){
			System.out.printf("%-5s	%-12s	%-5s	%-5s\n",i+1,selectedfoods.get(i).getName(),selectedfoods.get(i).getPrice(),bill.foodPrice(selectedfoods.get(i).getPrice(),bill.getFoodNos().get(i)));
			foodName = foodName+selectedfoods.get(i).getName()+",";
			foodPrice = foodPrice+selectedfoods.get(i).getPrice()+",";
			foodNos = foodNos+bill.getFoodNos().get(i)+",";
		}
		System.out.printf("\n%-15s	%-5s\n","Total Amount : 		",bill.totalBill(selectedfoods));
		System.out.println("--------------------------------------");
		int newBillNo = Integer.parseInt(billNo.getProperty("LastBillNo"))+1;
		String a = ""+newBillNo;
		bill.prevBill(bill.getBuyerName(),foodName,foodPrice,foodNos,Integer.parseInt(billNo.getProperty("LastBillNo")),da,ti);
		billNo.setProperty("LastBillNo",a);
		billNo.store(new FileWriter(f),"Properties");
		log.log.info("***Exited printBill method***");
	}
	/**
	*This method is for getting privious bill from database
	*it will get bill no from user and set it to BillController
	*class's setPrevBill method
	*@see HotelController
	*@exception Exception
	*/
	public static void getPrevBillName() throws Exception{
		log.log.info("***Entered getPrevBillName method***");
		log.log.warn("***May cause Exception***");
		System.out.println("enter Bill NO :");
		int billno = scan.nextInt();
		bill.setprevBill(billno);
		log.log.info("***Exited getPrevBillName method***");
	}
	/**
	*This method is for printing previous bill
	*@param name Coustmer name
	*@param foodName Food name
	*@param foodPrice Food price
	*@param foodNos No.of foods
	*@param id Bill no
	*@see HotelController
	*@exception Exception
	*/
	public static void prevBillView(String name,String foodName,String foodPrice,String foodNos,int id,String date,String time) throws Exception{
		log.log.info("***Entered prevBillView method***");
		log.log.warn("***May cause Exception***");
		String a[] = foodName.split(",");
		String b[] = foodPrice.split(",");
		String c[] = foodNos.split(",");
		int t = 0;
		System.out.println("--------------------------------------");
		System.out.println("\n\n	Hotel White Sand\n 	   Pathripala\n");
		System.out.println("Coustemer Name : "+name+"\n");
		System.out.println("Date : "+date+"\n");
		System.out.println("Time : "+time+"\n");
		System.out.println("Bill No : "+id+"\n");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","Sl.No","Name","Rate","Prize");
		System.out.printf("%-5s	%-12s	%-5s	%-5s\n","-----","----","----","-----");
		for(int i=1;i<a.length;i++){
			System.out.printf("%-5s	%-12s	%-5s	%-5s\n",i,a[i],b[i],Integer.parseInt(b[i])*Integer.parseInt(c[i]));
			t = t+Integer.parseInt(b[i])*Integer.parseInt(c[i]);
		}
		System.out.printf("\n%-15s	%-5s\n","Total Amount : 		",t);
		System.out.println("--------------------------------------");
		log.log.info("***Exited prevBillView method***");
	}
	/**
	*this method is for room booking view
	*/
	public static void roomView()throws Exception{
		int a = 0;
		do{
		System.out.print("	Available Rooms\n"+room.roomCreation()+"\nSelect Room No :");
		int roomNo = scan.nextInt();
		System.out.print("Check In Date : ");
		String inDate = scan.next();
		System.out.print("Check Out Date : ");
		String outDate = scan.next();
		if(room.checkingRoom(roomNo,inDate,outDate)==true){
			room.roomBooking(roomNo,inDate,outDate);
			System.out.println("Booking Succes");
		}
		else{
			System.out.println("Already booked on that date!!");
			System.out.println("Press 1 to Try Again");
			a = scan.nextInt();
		}
		}while(a==1);
	}
}