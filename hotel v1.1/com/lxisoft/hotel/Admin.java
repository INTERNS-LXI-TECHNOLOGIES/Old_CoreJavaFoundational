package com.lxisoft.hotel;
import java.util.Scanner;
import java.util.ArrayList;	
import java.io.*;		
public class Admin 
{
	File f=new File("A.Txt");
	FileWriter fw;
	BufferedWriter bw;
Scanner scan=new Scanner(System.in);

   public void choose(ArrayList<Food> foods)throws Exception
	   {
		 int con;
		 
		 do
		  {
		  System.out.println("CHOOSE\n1)ADD\n2)DELETE\n3)EDIT");
		  int c=scan.nextInt();
		  switch(c)
			  {
				  case 1: add(foods);break;
				  case 2: deletion(foods);break;
				  case 3: edit(foods);break;
			  }
		  System.out.println("do you want to continue  then press 1 or not press 0");
		  con=scan.nextInt();
		  }
		 while(con==1);
	   }
  
  
  int numOfFood;
     public void add(ArrayList<Food> foods)throws Exception
	   {   
	       
           System.out.println("how many foods do you want to add");
		    numOfFood=scan.nextInt();
		   for(int w=0;w<numOfFood;w++)
				 {
					  Food food=new Food();
					  System.out.println("enter the name of the food");
					  food.setName(scan.next());
					  System.out.println("enter the price of the food");
					  food.setPrice(scan.nextInt());
					  System.out.println("enter the count of the food");
					  food.setCount(scan.nextInt());
					  foods.add(food);
				}
				//System.out.println("333333"+foods);
			printFoodDetails(foods);
       }
    
	 public void deletion(ArrayList<Food> foods)throws Exception
	  {
		   System.out.println("which food you want to delete");
		   String d=scan.next();
		   FileWriter fw=new FileWriter(f,false);
		   BufferedWriter bw=new BufferedWriter(fw);
		   Food foodToDelete=null;
		   for(int k=0;k<foods.size();k++)
			     {
					
						if(foods.get(k).getName().equals(d))
						{
							
							
							//System.out.println(foods);
							foodToDelete=foods.get(k);
							//foods.remove(k);
							
							
							
						    System.out.println("\n fffff"+foods+"\n");
						//bw.write(foods);
				//bw.write(foods.get(k).getName()+"    ,   "+foods.get(k).getPrice()+"  ,   "+foods.get(k).getCount()+"\n");
						//bw.flush();
							
						}
				 }
				 foods.remove(foodToDelete);
				 for(Food ff:foods)
				 {
						bw.append(ff.getName()+"    ,   "+ff.getPrice()+"  ,   "+ff.getCount()+"\n");
						//bw.flush();
						
			     }
				 bw.close();
	  } 
	  
	 public void edit(ArrayList<Food> foods)throws Exception
	 {
		  System.out.println("which one is edit choose any options\n1)food\n2)price\n3)count");
		  int edit=scan.nextInt();
		  FileWriter fw=new FileWriter(f);
		   BufferedWriter bw=new BufferedWriter(fw);
		   		
	           if(edit==1)
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
					 
					 for(int s=0;s<foods.size();s++)
			        {
					   bw.write(foods.get(s).getName()+"  "+foods.get(s).getPrice()+"  "+foods.get(s).getCount()+"\n");
						   
					}
                      bw.close();					
		          }
				 
		 
				 if(edit==2)
				{
			        System.out.println("which food price is replace");
					String replace=scan.next();
					for(int s=0;s<foods.size();s++)
			        {
						if(foods.get(s).getName().equals(replace))
						{
			            System.out.println("enter the currect price of the food");
						foods.get(s).setPrice(scan.nextInt());
						}
					}
				 for(int s=0;s<foods.size();s++)
			        {
					   bw.write(foods.get(s).getName()+"  "+foods.get(s).getPrice()+"  "+foods.get(s).getCount()+"\n");
						   
					}
                      bw.close();					
		          }
				
				else if(edit==3)
				{       
			        System.out.println("which foodcount is replace");
		            String replace=scan.next();
					for(int s=0;s<foods.size();s++)
			        {
						if(foods.get(s).getName().equals(replace))
				        {
						System.out.println("enter the currect count of the food");
						foods.get(s).setCount(scan.nextInt());
	                    }
				
					}
					 for(int s=0;s<foods.size();s++)
			        {
					   bw.write(foods.get(s).getName()+"  "+foods.get(s).getPrice()+"  "+foods.get(s).getCount()+"\n");
						   
					}
                      bw.close();		
				}
	 }				
   public void printFoodDetails(ArrayList<Food> foods)throws Exception 
	{
	    int numOfFood=foods.size();
		fw=new FileWriter(f,true);
		bw = new BufferedWriter(fw);
		for(int w=0;w<numOfFood;w++)
		{
			
		System.out.println("NAME : "+foods.get(w).getName()+"        PRICE : "+foods.get(w).getPrice()+"         COUNT : "+foods.get(w).getCount());
		bw.write(""+foods.get(w).getName()+"    ,   "+foods.get(w).getPrice()+"  ,   "+foods.get(w).getCount()+"\n");				
       
		}
	 bw.close();
	}
}	