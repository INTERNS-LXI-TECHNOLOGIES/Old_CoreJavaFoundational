//package com.lxisoft.management.university;
//import com.lxisoft.management.college.*;
import java.io.*;
import java.util.*;
public class University
{
	//public static College coll=new College();
	public ArrayList<College> list=new ArrayList<College>();
	public College col;
	
	public void homePage()
	{
		col=new College();
		System.out.println("\n\n\t\t\t\t\t\t\t\t************HOME PAGE**************");
		System.out.println("\n\n1.COLLEGE REGISTRATION\t\t2.COLLEGE DETAILS\t\t2.FACULTY DETAILS\t3.STUDENT DETAILS");
		Scanner input=new Scanner(System.in);
		int selection=input.nextInt();
		switch(selection)
		{
			case 1:collegeRegistration();
					break;
			case 2:collegeList();
					break;
			case 3:fac.faculty_details();
					break;
			case 4:stud.student_Details();
					break;
		}
	}
	public  void collegeRegistration()
	{
		list.add(col);
		Scanner input=new Scanner(System.in);
		System.out.println("\tCOLLEGE REGISTRATION FORM");
		System.out.println("\n\nCOLLEGE NAME :");
		col.clg_name= input.nextLine();
		System.out.println("ADDRESS");
		col.clg_addr= input.nextLine();
		System.out.println("EMAIL");
		col.clg_email= input.nextLine();
		System.out.println("PHONE NUMBER");
		col.clg_phno= input.nextInt();
		System.out.println("\n\nRegistration is succefully completed");
		System.out.println("\n\n\nClick 1 for display the details\n\nClick 2 for home page");
				int selection1 = input.nextInt();
				switch(selection1)
			   {
				    case 1:collegeList();
							break;
					case 2:homePage();
							break;
			   }
		
	}
	public void collegeList()
	{
		System.out.println("\t\tCOLLEGE NAME:\t\tADDRESS:\t\tEMAIL:\t\tPHONE NUMBER: \n\n");
		for(College c:list)
		{
	    System.out.println("");
		System.out.print("\t\t"+c.clg_name+"\t\t\t"+c.clg_addr+"\t\t\t"+c.clg_email);
		System.out.print("\t\t"+c.clg_phno);
		System.out.println("login"+c.clg_name);
		}
		
		System.out.println("\n\n\nClick 1 for home page");
		Scanner input=new Scanner(System.in);
		int selection1 = input.nextInt();
		switch(selection1)
		{
			 case 1:homePage();
					break;
		}
		
	}
		
		
	
	
	
}