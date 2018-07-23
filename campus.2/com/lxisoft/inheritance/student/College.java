package com.lxisoft.inheritance.student;
import java.util.*;

public class College{
	int noOfStudents;
	int choice;
	String name;
	int admno;
	CseStudent[] s;
	MechStudent[] m;
	

	public void printDetails(){
		System.out.println("Enter the number of students");
		Scanner sc=new Scanner(System.in);
		noOfStudents=sc.nextInt();
		Scanner rs=new Scanner(System.in);
		s=new CseStudent[noOfStudents];
		m=new MechStudent[noOfStudents];
		/*for(int i=0;i<noOfStudents;i++)
		{
			s[i]=new Student();
		}
		*/
		System.out.println("*******WELCOME TO STUDENT'S PORTAL******\n");
		System.out.println("*****************************************\n");
		System.out.println("Enter the department to which the student is to be added\n"+"1.CSE\n"+"2.Mechanical");
		choice=sc.nextInt();
		
		switch(choice)
		{
			case 1:
				
				for(int i=0;i<noOfStudents;i++)
				{
					s[i]=new CseStudent();
					System.out.println("CSE student");
					System.out.println("Enter the name of the student:");
					name=rs.nextLine();
					//System.out.println(name);
					s[i].setName(name);
					System.out.println("Enter the Admission number of the student");
					admno=sc.nextInt();
					s[i].setAdmno(admno);
				}
				for(int i=0;i<noOfStudents;i++)
				{
					s[i].printCseDetails();	
				}
				break;
			case 2:
				for(int i=0;i<noOfStudents;i++)
				{
					m[i]=new MechStudent();
					System.out.println("Mech student");
					System.out.println("Enter the name of the student:");
					name=rs.nextLine();
					//System.out.println(name);
					m[i].setName(name);
					System.out.println("Enter the Admission number of the student");
					admno=sc.nextInt();
					m[i].setAdmno(admno);
										
					
				}
				for(int i=0;i<noOfStudents;i++)
				{
					System.out.println("Student"+(i+1)+"details are:");
					m[i].printDetails();
					System.out.println("\n");
				}


				break;
			default:
				System.out.println("Invalid choice");
		}
	}

}