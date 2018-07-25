package com.lxisoft.campus.college;
import  com.lxisoft.campus.person.*;
import java.util.*;

public class Class
{
	private Student students[]=new Student[10];
	private Faculty faculty=new Faculty();
	private String className;
		
	public void setClassName(String className)
	{
		this.className=className;
		addPerson();
	}
	
	public String getClassName()
	{
		return this.className;
	}
	
	
		
	public void addPerson()
	{	
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter faculty name,idno & age:");
		String facultyName=Scan.next();
		String facultyIdno=Scan.next();
		int facultyAge=Scan.nextInt();
		
		faculty.addPerson(facultyName,facultyIdno,facultyAge);
		
		System.out.print("Enter no of students:");
		int totalStudents =Scan.nextInt();
		for(int i=0;i<totalStudents;i++)
		{
			
			System.out.print("Enter name,idno & age of student:");
			String studentName=Scan.next();
			String studentIdno=Scan.next();
			int studentAge=Scan.nextInt();
			students[i]=new Student();
			students[i].addStudent(studentName,studentIdno,studentAge);
		}	
			
	}
	
	public void showDetails()	
	{
		System.out.print("Class:");
		System.out.println(getClassName());
		System.out.println("\tname\tid\tage\ttot mark\tavg");
		System.out.print("Faculty:");
		faculty.showDetails();
		System.out.println("");
		System.out.println("Students:");
		for(int i=0;i<10;i++)
		{	
			if(students[i]!=null)
			{
				students[i].showDetails();
			}
		}
	}
}
