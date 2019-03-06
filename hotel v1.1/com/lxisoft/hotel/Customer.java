package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Customer
{
Scanner scan=new Scanner(System.in);
private String food;
ArrayList<Food>  orderedFood=new ArrayList<Food>();  
   
   public void setFood()
   {
	   this.food=food;
   }
   public String getFood()
   {
	   return food;
   }
		public void foodChoosing(ArrayList<Food> foods)
		   {
				int countOfFood=0;
				System.out.println("how many food do you want");
				int numOfFood=scan.nextInt();    
				   for(int i=0;i<numOfFood;i++)
					 {
					      System.out.println("choose any food");				 
						   String order=scan.next();
						  
						   System.out.println("how many"+  order  + "want");
							countOfFood=scan.nextInt();
					       
								 for(int j=0;j<foods.size();j++)
								   {
								         
									  if(foods.get(j).getName().equals(order))
										{
										  if(countOfFood<=foods.get(j).getCount()) 
							                  {
												orderedFood.add(foods.get(j));
												foods.get(j).setCount(foods.get(j).getCount()-countOfFood);
											  }
										}
								}
					  }
	           }	  
			  
			  
			  
			  
			  
			  
}		

	  

