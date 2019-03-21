package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
public class Customer
{
File f=new File("A.Txt");
FileWriter fw;
BufferedWriter bw;	
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
		public void foodChoosing(ArrayList<Food> foods)throws Exception
		   {
				fw=new FileWriter(f);
			BufferedWriter bw=new BufferedWriter(fw);
		   int countOfFood=0;
				System.out.println("how many food do you want");
				int numOfFood=scan.nextInt();    
				   for(int i=0;i<numOfFood;i++)
					 {
					      System.out.println("choose any food");				 
						   String order=scan.next();
						  
						   System.out.println("how many"+  order  +"want");
							countOfFood=scan.nextInt();
					       System.out.println("size="+foods.size());
						   if(f.exists())
						   {
						   f.delete();
						   }
								 for(int j=0;j<foods.size();j++)
								   {
									  if(foods.get(j).getName().equals(order))
										{
										  if(countOfFood<=foods.get(j).getCount()) 
							                  {
												       
											    
											    orderedFood.add(foods.get(j));
												orderedFood.clear();
												
											    foods.get(j).setCount(foods.get(j).getCount()-countOfFood);
												System.out.println("........."+foods.get(j));
											
											System.out.println("odered food"+foods.get(j).getName()+" count=  "+ foods.get(j).getCount()+"\n");
											
											  }
									
											
									         
										}
										bw.write(foods.get(j).getName()+","+foods.get(j).getPrice()+","+ foods.get(j).getCount()+"\n");	
											
								}
								bw.close();
					  }
	           }	  
}		