package com.lxisoft.controller;
import com.lxisoft.model.*;
import java.util.*;
public class HotelController{
    
    public void customerData(){
        Customer customer = new Customer();
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter Customer name : "); 
        customer.setName(sc.next());    
        System.out.print("Enter table no. :"); 
        customer.setTableNo(sc.nextInt());
    }
    int ch;
    String hotelName ="Internationale";
    ArrayList<String> menu = new ArrayList<String>();
    ArrayList<Food> list = new ArrayList<Food>();
     public HotelController(){
        menu.add("Menu");
        menu.add("Remove Item");
        menu.add("<<Back");
        menu.add("Exit");
     }
     public void temp(ArrayList<Food> list){
        this.list = list;    
    }
    public void mainMenu(){
        for(int i=0;i<list.size();i++){
        
            System.out.println("Item: " +list.get(i).getName()+"                          "+list.get(i).getQuantity()+" "+list.get(i).getPrice());
        }     
        
    }

    public void list(){

    
    ArrayList<Food> food = new ArrayList<Food>();
    System.out.println("<<<<<<<<<<<<<<"+hotelName+">>>>>>>>>>>>>");
    customerData();
    displayMainMenu(menu);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Choice:");
    ch=sc.nextInt();
    switch(ch){
       case 1:
       System.out.println("No Item                               Price  Qty");
       System.out.println("__ ____                               _____  ___"); 
       this.mainMenu();
       displayMenu(); 
       break;
       case 2:
       break;
       case 3:
       System.out.println("Exit");
       break;
       
   }
}
public void displayMenu(){
    
    do{
        for(int i=0;i<3;i++){
        int ch;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter item:");
        ch=sc.nextInt();
        }
    }while(3==ch);
    
    switch(ch){

        case 1:
        System.out.println("Item: " +list.get(0).getName()+"                       "+list.get(0).getPrice());
        break;
        case 2:
        System.out.println("Item: " +list.get(2).getName()+"                      "+list.get(2).getPrice());
        break;
        case 3:
        System.out.println("Item: " +list.get(3).getName()+"                      "+list.get(3).getPrice());
        break;
    }
}
 
    public void displayMainMenu(ArrayList list) { 
        int i=1; 
        Iterator itr1=list.iterator(); 
        while(itr1.hasNext()) { 
            System.out.println(" "+i+"."+itr1.next()); 
            i++; 
        } 
    }
}
