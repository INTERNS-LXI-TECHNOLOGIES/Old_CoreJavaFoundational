package com.lxisoft.campusv3.student;
import java.util.Scanner;
public class StudentEntry
{
	Scanner sc=new Scanner(System.in);	
	
	
	public void entry()
	{
		System.out.println("enter the admission id:");
		int id=sc.nextInt();
		
		if(id>100)
		{
			System.out.println("\nsorry seat is unavailable");
		}
		else
		{
			
            System.out.println("\nSeats available");
		}
	}
} 