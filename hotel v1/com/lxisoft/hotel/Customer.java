package com.lxisoft.hotel;
import java.util.Scanner;
public class Customer
{
Scanner scan=new Scanner(System.in);
private String food;
   public void setFood()
   {
	   this.food=food;
   }
   public String getFood()
   {
	   return food;
   }
   

		   public void choosing()
		   {
			System.out.println("choose any food");
			food=scan.next();	
		   }
}