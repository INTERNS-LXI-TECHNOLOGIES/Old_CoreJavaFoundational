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
   

   
    public void choosing(ArrayList<Food> foods)
		   {
                System.out.println("how many food want");
                 int n=scan.nextInt();
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
		      System.out.println("kkkkkkkkkkkkkkkkkkkkkkkkkkkk");
		      System.out.println("fff"+foods.size());
				for(int i=0;i<foods.size();i++)
				{
				   if(food==foods.get(i).getName())	
				   {
					   
					   foods.remove(i);
				   }
				}
		  }
	 

    /* public void choosing(ArrayList<Food> foods)
		   {
			   
			System.out.println("choose any food");
			
		    food=scan.next();
				for(int i=0;i<foods.size();i++)
				{
				   if(food==foods.get(i).getName())	
				   {
					   foods.remove(i);
				   }
				}
		   }*/
}