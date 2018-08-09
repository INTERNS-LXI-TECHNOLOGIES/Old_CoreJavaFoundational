package com.lxisoft.markEntry.campus.faculty;
import java.util.Scanner;
public class Facultysalary
{
public void salary()
{    Scanner sc=new Scanner(System.in);
	System.out.println("Enter the no of session taken today");
	int i=sc.nextInt();
	System.out.println("Do you have another class in same department in other batch today(1.y/2.n)");
	int ch=sc.nextInt();
	if (ch==1)
		
	{
	
    System.out.println("Enter the no of session taken ");
	int j=sc.nextInt();	
	i=i+j;
	System.out.println("Do you have another class in other department  today(1.y/2.n)");
	ch=sc.nextInt();
	if (ch==1)
		
	{
	
    System.out.println("Enter the no of session taken ");
     j=sc.nextInt();	
	i=i+j;
	}
	else
	{
		
	}	
	}
	else
	{
	System.out.println("Do you have another class in other department  today(1.y/2.n)");
	ch=sc.nextInt();
	if (ch==1)
		
	{
	System.out.println("yes");
    System.out.println("Enter the no of session taken ");
	 int j=sc.nextInt();	
	i=i+j;
	}
	else
	{
		
	}
    }
  System.out.println("Total hours= "+ i);  	
  i=i*500;
  System.out.println("Total = "+ i); 
  
}

} 