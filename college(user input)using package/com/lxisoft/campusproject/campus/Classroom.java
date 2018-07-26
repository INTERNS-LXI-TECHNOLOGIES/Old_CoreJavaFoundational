package com.lxisoft.campusproject.campus;
import java.util.*;
public class Classroom
{
	String name;
	String location;
	Student[] stu;
	Faculty[] fac;
	public Classroom(String name,String location)
	{
		this.name=name;
		this.location=location;
		createstudent();
		createfaculty();
	}
			void createstudent()
			{
				Scanner c=new Scanner(System.in);
				System.out.println("enter the limit of the student");
				int n=c.nextInt();
				stu=new Student[n];
					for(int i=0;i<n;i++)
					{
						System.out.println("enter the name of the student");
						String stuname=System.console().readLine();
						System.out.println("enter the roll no");
						int sturollno=c.nextInt();
						stu[i]=new Student(stuname,sturollno);
					}
				}	
				void createfaculty()
				{
					Scanner c=new Scanner(System.in);
				    System.out.println("enter the limit of the faculty");
				    int n=c.nextInt();
				    fac=new Faculty[n];
					for(int i=0;i<n;i++)
					{
						System.out.println("enter the name of the faculty");
						String facname=System.console().readLine();
						fac[i]=new Faculty(facname);
					}
				}	
			

	public void printdetailsC()
	{
		System.out.println("name of the classroom:"+name);
		System.out.println("location of the classroom:"+location);
					for(int i=0;i<stu.length;i++)//student object
					         {
					            stu[i].printdetailsS();
	            	             }
	               
	                 for(int i=0;i<fac.length;i++)//faculty object
	                 {
	                 	fac[i].PrintdetailsF();
	                 }
	 }                

}