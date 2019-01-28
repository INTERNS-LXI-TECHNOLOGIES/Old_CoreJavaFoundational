package com.lxisoft.metro.tdd;
import com.lxisoft.metro.metro.Metro;

import java.util.Scanner;
public class Tdd
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
	int c;	
	private Metro metro;
	
	
	int k;
				do{
					setTrain(new Metro());
					
					System.out.println("do you want admin or user admin=1,user=2");
					c=scan.nextInt();
				if(c == 1)
					{
						System.out.println("please enter the admin password");
					    int a=scan.nextInt();
						if(a==1290)
						{
					      metro.MetroDetails();
						  metro.printDetails();
						}
						else
						{
							System.out.println("not fount");
						}
					}
					
				
				else if(c==2)
					{
						System.out.println("please enter the user password");
						int b=scan.nextInt();
						if(b==1490)
						{
					      metro.reservation();
					     
						}
						else
						{
							System.out.println("not fount");
						}					
					}
					
				else
					{
						
						System.out.println("not fount");
						System.out.println("do you want to continue the press 1 then press 0");
						
					}
					k=scan.nextInt();
					
				}while(k==1);
				
	}
}

