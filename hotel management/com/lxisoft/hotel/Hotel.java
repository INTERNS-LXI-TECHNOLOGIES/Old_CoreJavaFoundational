package com.lxisoft.hotel;
import com.lxisoft.admin.*;
import java.util.Scanner;
public class Hotel
{

Admin admin=new Admin();

Scanner scan=new Scanner(System.in);

	public void homePage()
		{
			int ch;
			do
			{
			  System.out.println("------------------------------------------------------------------");
              System.out.println("                        FOOD  /                                   ");
			  System.out.println("                             / ORDERING                           ");
			  System.out.println("------------------------------------------------------------------");
			  System.out.println("  ");
			  System.out.println("1.ADMIN LOGIN");
			  System.out.println("2.CUSTOMER LOGIN");
			  System.out.println("  ");
			  System.out.print("Enter your choice:");
			  ch=scan.nextInt();
			  
			  switch(ch)
			  {
				  case 1:admin.adminLogin();
				  break;
				  case 2:System.out.println("Temperarly not reachable");
				  break;
			      default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
			}while(ch>2);
		}
		
}