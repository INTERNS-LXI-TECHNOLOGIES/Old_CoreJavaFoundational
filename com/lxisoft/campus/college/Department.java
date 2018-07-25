package com.lxisoft.campus.college;
import java.util.*;
public class Department
{
	private String depname;
	Classroom[] cr;
	public Department(String depname)
	{
	this.depname=depname;
	createClassroom();
	}
	void createClassroom()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of classrooms:");
		int n=sc.nextInt();
		cr=new Classroom[n];
		System.out.println("Enter the location of classroom:");
		String location=System.console().readLine();
		for(int i=0;i<n;i++)
		{
			cr[i]=new Classroom(location,this.depname);
		}
	}
	void displayDetails()
	{
		System.out.println("Department name:"+depname);
		for(int i=0;i<cr.length;i++)
		{
			cr[i].printDetails();
		}
	}
}
	
	
