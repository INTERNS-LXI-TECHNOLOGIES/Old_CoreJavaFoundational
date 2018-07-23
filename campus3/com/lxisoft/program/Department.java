package com.lxisoft.program;
import java.util.*;

public class Department 
{
	String deptName,sName,fname;
	int classroom,sAdmno,fId;
	int noOfStudents;
	Student[] s;
	Faculity f=new Faculity();
	Marks[] m;
	Double average;
	public Department(String deptName)
	{
		this.deptName=deptName;

	}

	public void printDetails()
	{

		Scanner in=new Scanner(System.in);
		Scanner st=new Scanner(System.in);
		System.out.println("BRANCH NAME:"+deptName);
		System.out.println("Enter the year in which the student is learning\n1.First year\n2.Second year\n3.Third year\n4.Fourth year");
		classroom=in.nextInt();
		switch(classroom)
		{
			case 1:
				System.out.println("FIRST YEAR STUDENT");
				
				//Stundent  details
				System.out.println("*****ENTER STUDENT'S DETAILS*****");
				System.out.println("Enter the number of students in the class:");
				noOfStudents=in.nextInt();
				
				s=new Student[noOfStudents];
				for (int i=0;i<noOfStudents ;i++ ) {
					s[i]=new Student();
				}

				m=new Marks[6];
				for (int i=0;i<6 ;i++ ) 
				{
					m[i]=new Marks();
				}
				
				for (int i=0;i<noOfStudents ;i++ ) 
				{
					System.out.println("Enter the name of the student:");
					sName=st.nextLine();
					s[i].setName(sName);
					System.out.println("Enter the admission number of the student:");
					sAdmno=in.nextInt();
					s[i].setAdmno(sAdmno);
					System.out.println("\n******Enter the mark details of the student******");
					m[i].calculateAverage();
				}
				//print details
				for (int i=0;i<noOfStudents ;i++ ) 
				{
					System.out.println("***************************\nDETAILS OF STUDENT:"+(i+1));
					System.out.println("Student name:"+s[i].getName());
					System.out.println("Student id:"+s[i].getAdmno());
					System.out.println("Average marks of student"+(i+1)+":"+m[i].calcu());
					System.out.println("***************************");
				}
				break;
			case 2:
			System.out.println("SECOND YEAR STUDENT");
				
				//Stundent  details
				System.out.println("*****ENTER STUDENT'S DETAILS*****");
				System.out.println("Enter the number of students in the class:");
				noOfStudents=in.nextInt();
				
				s=new Student[noOfStudents];
				for (int i=0;i<noOfStudents ;i++ ) {
					s[i]=new Student();
				}

				m=new Marks[6];
				for (int i=0;i<6 ;i++ ) 
				{
					m[i]=new Marks();
				}
				
				for (int i=0;i<noOfStudents ;i++ ) 
				{
					System.out.println("Enter the name of the student:");
					sName=st.nextLine();
					s[i].setName(sName);
					System.out.println("Enter the admission number of the student:");
					sAdmno=in.nextInt();
					s[i].setAdmno(sAdmno);
					System.out.println("\n******Enter the mark details of the student******");
					m[i].calculateAverage();
				}
				//print details
				for (int i=0;i<noOfStudents ;i++ ) 
				{
					System.out.println("***************************\nDETAILS OF STUDENT:"+(i+1));
					System.out.println("Student name:"+s[i].getName());
					System.out.println("Student id:"+s[i].getAdmno());
					System.out.println("Average marks of student"+(i+1)+":"+m[i].calcu());
					System.out.println("***************************");
				}
				break;
			case 3:
				System.out.println("THIRD YEAR STUDENT");
				
				//Stundent  details
				System.out.println("*****ENTER STUDENT'S DETAILS*****");
				System.out.println("Enter the number of students in the class:");
				noOfStudents=in.nextInt();
				
				s=new Student[noOfStudents];
				for (int i=0;i<noOfStudents ;i++ ) {
					s[i]=new Student();
				}

				m=new Marks[6];
				for (int i=0;i<6 ;i++ ) 
				{
					m[i]=new Marks();
				}
				
				for (int i=0;i<noOfStudents ;i++ ) 
				{
					System.out.println("Enter the name of the student:");
					sName=st.nextLine();
					s[i].setName(sName);
					System.out.println("Enter the admission number of the student:");
					sAdmno=in.nextInt();
					s[i].setAdmno(sAdmno);
					System.out.println("\n******Enter the mark details of the student******");
					m[i].calculateAverage();
				}
				//print details
				for (int i=0;i<noOfStudents ;i++ ) 
				{
					System.out.println("***************************\nDETAILS OF STUDENT:"+(i+1));
					System.out.println("Student name:"+s[i].getName());
					System.out.println("Student id:"+s[i].getAdmno());
					System.out.println("Average marks of student"+(i+1)+":"+m[i].calcu());
					System.out.println("***************************");
				}
				break;
			case 4:
				System.out.println("FOURTH YEAR STUDENT");
				
				//Stundent  details
				System.out.println("*****ENTER STUDENT'S DETAILS*****");
				System.out.println("Enter the number of students in the class:");
				noOfStudents=in.nextInt();
				
				s=new Student[noOfStudents];
				for (int i=0;i<noOfStudents ;i++ ) {
					s[i]=new Student();
				}

				m=new Marks[6];
				for (int i=0;i<6 ;i++ ) 
				{
					m[i]=new Marks();
				}
				
				for (int i=0;i<noOfStudents ;i++ ) 
				{
					System.out.println("Enter the name of the student:");
					sName=st.nextLine();
					s[i].setName(sName);
					System.out.println("Enter the admission number of the student:");
					sAdmno=in.nextInt();
					s[i].setAdmno(sAdmno);
					System.out.println("\n******Enter the mark details of the student******");
					m[i].calculateAverage();
				}
				//print details
				for (int i=0;i<noOfStudents ;i++ ) 
				{
					System.out.println("***************************\nDETAILS OF STUDENT:"+(i+1));
					System.out.println("Student name:"+s[i].getName());
					System.out.println("Student id:"+s[i].getAdmno());
					System.out.println("Average marks of student"+(i+1)+":"+m[i].calcu());
					System.out.println("***************************");
				}
				break;
			default:
				System.out.println("Invalid choice");
		}
	}
}