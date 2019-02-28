package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;
public class Admin 
{
Scanner scan=new Scanner(System.in);




   public void inventoryOptions(ArrayList<Food> foods)
	{
		int numOfFood;
		int w;
		int con;
		do
		{
		
		System.out.println("CHOOSE\n1)ADD\n2)DELETE\n3)EDIT");
		int c=scan.nextInt();
		if(c==1)
		{
			System.out.println("how many foods do you want to add");
		   numOfFood=scan.nextInt(); 
		
			for( w=0;w<numOfFood;w++)
			{
			   
			  foods.add(new Food());
			    
			  System.out.println("enter the name of the food");
              foods.get(w).setName(scan.next());
			  System.out.println("enter the pricef the food");
			  foods.get(w).setPrice(scan.nextInt());
			  System.out.println("enter the count of the food");
			  foods.get(w).setCount(scan.nextInt());
			 
			}
          printFoodDetails(foods,w);
	    }
		else if(c==2)
		{
			System.out.println("which food you want to delete");
			String d=scan.next();
			for(int k=0;k<foods.size();k++)
			{
					if(foods.get(k).getName().equals(d))
					{
						foods.remove(k);
					}
			}
		}
		
		else if(c==3)
		{     
		       System.out.println("which one is edit choose any options\n1)food\n2)price\n3)count");
			int edit=scan.nextInt();
			
	           /*if(edit.equals("food"))
				{
					System.out.println("which name is replace");
					String replace=scan.next();
					for(int s=0;s<foods.size();s++)
			        {
						if(foods.get(s).getName().equals(replace))
						{
							System.out.println("enter the currect name of the food");
							foods.get(s).setName(scan.next());
						}       
			         }
		         }*/
				 if(edit==2)
				{
			        System.out.println("which price is replace");
					int replace=scan.nextInt();
					for(int s=0;s<foods.size();s++)
			        {
						if(foods.get(s).getPrice()==replace)
						{
			            System.out.println("enter the currect price of the food");
						foods.get(s).setPrice(scan.nextInt());
						}
					}
				}
				else if(edit==3)
				{       
			        System.out.println("which price is replace");
		            int replace=scan.nextInt();
					for(int s=0;s<foods.size();s++)
			        {
						if(foods.get(s).getPrice()==replace)
				        {
						System.out.println("enter the currect count of the food");
						foods.get(s).setCount(scan.nextInt());
				        }
				     }
				}		
		}
		
	else
		{
			System.out.println("not fount");
		}
		System.out.println("do you want to continue    yes=1  /  no=0");
	    con=scan.nextInt();
	}
	while(con==1);
}
	
	
	
	public void printFoodDetails(ArrayList<Food> foods,	int w)
	{
	    int numOfFood=foods.size();
		
		for( w=0;w<numOfFood;w++)
		{
			
			System.out.println("NAME : "+foods.get(w).getName()+"        PRICE : "+foods.get(w).getPrice()+"         COUNT : "+foods.get(w).getCount());
		}
	}
}		