package com.lxisoft.hotel;
import java.util.Scanner;
public class Hotel
{
Scanner scan=new Scanner(System.in);
Admin admin;
Customer[] customers;

	public void setDetails()
		{

			System.out.print("No.of customers:");
			int c=scan.nextInt();
			customers=new Customer[c];
			for(int i=0;i<c;i++)
			   {
					customers[i]=new Customer();
					
					customers[i]=bill();
		       }
		}
		
}