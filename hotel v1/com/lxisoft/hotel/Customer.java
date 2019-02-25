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
   
int n=0;
   
   
    public void choosing(ArrayList<Food> foods)
		   {
                System.out.println("how many food do you want");
                  n=scan.nextInt();
			   System.out.println("choose any food");
		   for(int i=0;i<n;i++)
			 {			
               
               String order=scan.next();
                 for(int j=0;j<foods.size();j++)
                   {
				   
						  if(foods.get(j).getName().equals(order))
							{
								orderedFood.add(foods.get(j));
							}
				   }
			}
		 }
			
			
	   public void deleteOrderedFood(ArrayList<Food> foods)
	      {	
			  
			   for(int i=0;i<foods.size();i++)
			      {	
                   			  
                   for(int j=0;j<orderedFood.size();j++)
                       {
						  if(foods.get(i).getName().equals(orderedFood.get(j).getName()))
								{										
									 foods.remove(i);
							    }
					  }
			      }
			 }
}	 

