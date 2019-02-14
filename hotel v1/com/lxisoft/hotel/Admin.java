package com.lxisoft.hotel;
import java.util.Scanner;
public class Admin 
{
	Scanner scan=new Scanner (System.in);
      public void selectingFood()
		{
		  
		  System.out.println("how many members want food");
		  int f=scan.nextInt();
			  if (f<=2)
			  {
			  System.out.println("available\n.....\n1)pizza 2)alfam");
			  System.out.println("which fodd do you want");
			  String selectedFood=scan.next();
			       if(selectedFood.equals("pizza"))
				   {
					   System.out.println("price of pizza=139");
				   }
				   else
				   {
					   System.out.println("price of alfam=133");
				   }
			  }
		}
}