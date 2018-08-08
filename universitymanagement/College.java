//package com.lxisoft.management.college;
import java.io.*;
import java.util.*;
public class College
{
	String clg_name,clg_addr,clg_email;
	int clg_phno;
	Department dept=new Department();
	Faculty fac=new Faculty();
	Student stud=new Student();
	public void collegeHome()
	{
	
		System.out.println("WELCOME");
		System.out.println("\n\t\t1.FACULTY LISTS\n\t\t2.STUDENT LISTS\n\t\t3.STUDENT REGISTRATION\n\t\t4.FACULTY LOGIN\n\t\t5.EXIT");
		Scanner input=new Scanner(System.in);
		int selection = input.nextInt();	
		switch(selection)
		{
			case 1:fac.faculty_details();
					break;
			case 2:stud.Student_details();
					break;
			case 3:dept.department();
					break;
			case 4:faculty_login();
					break;
			case 5:exit();
					break;
		}
	}
	public void faculty_login()
	{
	
		Scanner input=new Scanner(System.in);
		System.out.println("\n\tLOGIN");
		System.out.println("\n\nEMAIL ID");
		String email= input.nextLine();
		System.out.println("\nPASSWORD");
		String pwd= input.nextLine();
		fac.faculty_details();
	
	}
	public void exit()
	{
		
	}
	
}