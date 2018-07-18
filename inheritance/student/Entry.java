package com.lxisoft.inheritance.student;
import java.util.*;
import com.lxisoft.inheritance.student.Student;
public class Entry
{
	
	public void studentEntry()
	{
		
	Scanner in=new Scanner(System.in);
	Scanner init=new Scanner(System.in);
	String nameInput;
	int admnInput;
	System.out.println("enter the Number of Student");
	int studCount=in.nextInt();
	Student[] s=new Student[studCount];
	System.out.println("-------WELCOME TO STUDENT REGISTER PORTEL-----");
	for(int i=0;i<studCount;i++)
	{
	System.out.println("Student"+(i+1));
	System.out.println("Enter the Name::");
	nameInput=init.nextLine();
	s[i] = new Student();
	s[i].setName(nameInput);
	System.out.println("Enter the Admission Numer::");
	admnInput=in.nextInt();
	s[i].setAdmn(admnInput);
	}
	}
	s.choice();
}