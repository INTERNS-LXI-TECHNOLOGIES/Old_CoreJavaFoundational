package com.lxisoft.hotel;
import com.lxisoft.hotel.Admin;
import java.util.Scanner;
public class Hotel
{
	Scanner scan=new Scanner(System.in);
	private Admin admin=new Admin();
	Cashear cashear=new Cashear();
	
	public void setAdmin(Admin admin)
	{
		this.admin=admin;
	}
	public Admin getAdmin()
	{
		return admin;
	}
	public void setCashear (Cashear cashear)
	{
		this.cashear=cashear;
	}
	public Cashear getCashear()
	{
		return cashear;
	}
	
	
	
	    public void selecting()
		{
		System.out.println("do you want admin or cashear\nadmin=1\ncashear=0");
		int s=scan.nextInt();
			if( s==1)	
			{
				System.out.println("enter the admin password");
				int i=scan.nextInt();
				if(i==1234)
				{
					admin.selectingFood();
				}
				else 
				{
					System.out.println("not fount");
				}
				
			}
			else
			{
				System.out.println("enter cashear password");
				int j=scan.nextInt();
				if(j==7787)
				{
			       cashear.printDetails();
				}
				else
				{
					System.out.println("not fount");
				}
			}
			
		}
	
}