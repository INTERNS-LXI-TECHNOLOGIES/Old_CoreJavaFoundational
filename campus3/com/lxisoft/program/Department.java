package com.lxisoft.program;
import java.util.*;

public class Department 
{
	String deptName,sName,fname;
	int classroom,sAdmno,fId;
	int noOfStudents;
	Student[] s;
	Faculity[] f;
	Marks[] m;
	Double average;
	int noOfFaculity,noOfSubjects,salary,salaryPerHour,noOfHours;
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
					System.out.println("Enter the name of the student "+(i+1));
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
					System.out.println("Enter the name of the student "+(i+1));
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
					System.out.println("Enter the admission number of the student "+(i+1));
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
					System.out.println("Enter the name of the student "+(i+1));
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
	public void faculityPrintDetails()
	{
		Scanner rd=new Scanner(System.in);
		Scanner rds=new Scanner(System.in);
		System.out.println("Enter the number of faculty in the college");
		noOfFaculity=rd.nextInt();
		f=new Faculity[noOfFaculity];
		for (int i=0;i<noOfFaculity ;i++ ) {
					f[i]=new Faculity();
		}		
		for(int i=0;i<noOfFaculity;i++)
		{
			System.out.println("*****ENTER FACULTY'S DETAILS*****");
			System.out.println("Enter the name of the faculty "+(i+1));
			fname=rds.nextLine();
			f[i].setName(fname);
			System.out.println("Enter the id of faculty");
			fId=rd.nextInt();
			f[i].setId(fId);
			System.out.println("Enter the number of subject taken by the faculty");
			noOfSubjects=rd.nextInt();
			for(int j=0;j<noOfSubjects;j++)
			{
				System.out.println("Enter the salary per hour in subject"+(j+1));
				salaryPerHour=rd.nextInt();
				System.out.println("Enter the hours that the faculty worked on subject"+(j+1));
				noOfHours=rd.nextInt();
				salary+=salaryPerHour*noOfHours;
			}
			System.out.println("\n**************************");
			System.out.println("Name of Faculty"+(i+1)+":"+f[i].getName());
			System.out.println("ID of Faculty"+(i+1)+f[i].getId());
			System.out.println("Salary of faculty"+(i+1)+":$"+salary);
			System.out.println("**************************\n");
		}

		
	}
}