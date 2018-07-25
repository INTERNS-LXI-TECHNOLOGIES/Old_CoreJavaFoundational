package com.lxisoft.college.student;
import com.lxisoft.college.classroom.Classroom;
import java.util.*;
public class Student
{
	
	private String Stud_name,Stud_address;
	Scanner input=new Scanner(System.in);
	Scanner string_input=new Scanner(System.in);
	public void setStudent_name(String stud_name)
	{
		this.Stud_name=stud_name;
		
	}
	public void setStudent_address(String stud_address)
	{
		this.Stud_address=stud_address;
	}
	public String getStudent_name()
	{
		return Stud_name;
		
	}
	public String getStudent_address()
	{
		return Stud_address;
	}
	
	public void enter_student_details()
	{
		int total=0;
		
		System.out.println("Enter the name of student");
		Stud_name=string_input.nextLine();
		System.out.println("Enter the address of student");
		Stud_address=string_input.nextLine();
		for(int i=0;i<6;i++)
		{

			System.out.println("Enter the mark in subject "+i);
			int mark=input.nextInt();
			total=total+mark;
			
		}
        System.out.println("Total mark obtained by student is"+total);
		int average=total/6;
		System.out.println("Average mark of student is "+average);
		
	}
	public void print_student_details()
	{
		System.out.println("Student name:"+Stud_name+"\n"+"Address:"+Stud_address);
			
	}

} 