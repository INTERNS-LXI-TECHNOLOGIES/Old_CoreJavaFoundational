package com.lxisoft.hotel.readytoeat;
//import java.util.Scanner;
import java.io.*;
import java.util.*;
/**
* This class represent management for Hotel management program
*
* @author  Amal
* @version 1.0
* @since   2019-03-23
* @lastupdated on 2019-06-27
*/
public class management{
	int status=1;
	int counter=0;
	 String Managername="Amal";
	 String MobileNo="9497825953" ;
	 String foodName;
	 String foodType;
	 String foodMrp;
	 String fudadopt;
	 String inputController;
	 String trueCase="y";
	 Food[] fud=new Food[100];
	 ArrayList<Food> foods=new ArrayList<Food>();
	/* public static void clearScreen()
	 {  
		System.out.print("\033[H\033[2J");  
		System.out.flush();  
		}*/
		public void insertFood()
		{
			Scanner in=new Scanner(System.in);
			
		while(status != 0)
			{
				fud[counter]=new Food();
				System.out.println("ENTER THE FOOD NO-"+(counter+1)+" NAME");
				foodName=in.nextLine();
				foods.add(fud[counter]); 
				fud[counter].setFoodName(foodName);
				System.out.println("ENTER THE FOOD NO-"+(counter+1)+" TYPE");
				foodType=in.nextLine();
				fud[counter].setFoodtype(foodType);
				foods.add(fud[counter]);
				System.out.println("ENTER THE FOOD NO-"+(counter+1)+"  MRP");
				foodMrp=in.nextLine();
				fud[counter].setFoodMrp(foodMrp);
				foods.add(fud[counter]);
				//System.out.println("Want to add more foods?? Y--> yes \n N--> No");
				//Scanner fudad=new Scanner(System.in);
				//status=fudad.nextLine();	
				counter++;		
					Scanner condtnCheck=new Scanner(System.in);
					System.out.println("Want to enter more items? (Y/N)?");
					inputController=condtnCheck.nextLine();
					if(inputController.equalsIgnoreCase(trueCase))
					{
						status=1;
					}
					else
					{
						status=0;
					}
					
			}
			
				 
		
		}
	public void displayFood()
	{
		int i;
		System.out.println("______________________________________");
		System.out.println("|\t \t \tMENU|");
		System.out.println("______________________________________");
		System.out.println("|FOOD |\t TYPE |\t MRP|");
		System.out.println("______________________________________");
		for(Food item:foods)
		{

		    System.out.println( "|"+item.getFoodName()+"|"+item.getFoodType()+"|"+item.getFoodMrp()+"|");
		}
		System.out.println("______________________________________");
		System.out.println("click ENTER to exit menu");
		Scanner justEnter =new Scanner(System.in);
		justEnter.nextLine();
		/*try {
			Thread.sleep(50000);
		} catch(InterruptedException e) {
			
		}*/
	}
}