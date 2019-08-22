package com.lxisoft.campus.person;
import java.util.*;

public class Student extends Person
{
	private int totalMarks;
	private double average;
	
	public void setTotalMarks(int totalMarks)
	{
		this.totalMarks=totalMarks;
	}
	public void setAverage(double average)
	{
		this.average=average;
	}
	public int getTotalMarks()
	{
		return this.totalMarks;
	}
	public double getAverage()
	{
		return this.average;
	}
	
	
	public void addStudent(String studentName,String studentIdno,int studentAge)
	{
		super.addPerson(studentName,studentIdno,studentAge);
		addMark();
	}	
	
	public void addMark()
	{
		Scanner Scan=new Scanner(System.in);
		System.out.print("Mark:");
		int mark1=Scan.nextInt();
		int mark2=Scan.nextInt();
		int mark3=Scan.nextInt();
		setTotalMarks(mark1+mark2+mark3);	
		setAverage(getTotalMarks()/3.0);
	}
	
	public void showDetails()
	{
		System.out.print("\t");
		super.showDetails();
		System.out.println(getTotalMarks()+"\t"+getAverage());
	}
}	
	
	
	
	