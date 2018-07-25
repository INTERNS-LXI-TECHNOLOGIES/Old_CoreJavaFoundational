package com.lxisoft.program;
import java.util.*;

public class College
{
	//Varaible initialisation
	String name;
	String email;
	long phno;
	int noOfDepartment;
	String[] deptName=new String[5];
	Department d[]=new Department[4];
	

	//constructor to initialize variables
	public College(String name,String email,long phno)
	{
		this.name=name;
		this.email=email;
		this.phno=phno;
		
	}
	//print details
	public void printDetails()
	{
		Scanner in=new Scanner(System.in);
		Scanner st=new Scanner(System.in);

		System.out.println("********************************");
		System.out.println("*        College Portal        *");
		System.out.println("********************************");
		System.out.println("\nCollege Name:\t"+name);
		System.out.println("Email ID:\t"+email);
		System.out.println("Phone number:\t"+phno);
		System.out.println("********************************\n");

		System.out.println("Enter the number of department in college");
		noOfDepartment=in.nextInt();
		System.out.println("\n");
		for(int i=0;i<noOfDepartment;i++)
		{
			System.out.println("Enter the name of the department "+(i+1)+":");
			deptName[i]=st.nextLine();
			System.out.println("\n");

		}
		System.out.println("\n");

		for(int i=0;i<noOfDepartment;i++)
		{
			d[i]=new Department(deptName[i]);
		}

		for(int i=0;i<noOfDepartment;i++)
		{
			d[i].printDetails();
			d[i].faculityPrintDetails();
		}

	}
}

