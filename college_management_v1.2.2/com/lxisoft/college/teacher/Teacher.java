package com.lxisoft.college.teacher;
import java.util.*;
import com.lxisoft.college.classroom.Classroom;

public class Teacher 
{
	private String Tutor_name,Tutor_address;
	Scanner input=new Scanner(System.in);
	Scanner string_input=new Scanner(System.in);
	public void setTutor_name(String tutor_name)
	{
		this.Tutor_name=tutor_name;
		
	}
	public void setTutor_address(String tutor_address)
	{

		this.Tutor_address=tutor_address;
	}
	public String getTutor_name()
	{
		return Tutor_name;
		
	}
	public String getTutor_address()
	{

		return Tutor_address;
	}
	
	public void enter_tutor_details()
	{
		int salary=10000;
		System.out.println("Enter the name of tutor");
		Tutor_name=string_input.nextLine();
		System.out.println("Enter the address of tutor");
		Tutor_address=string_input.nextLine();
		System.out.println("Enter the number of subject taken by "+Tutor_name);
		int subject=input.nextInt();
		int totalSalary=subject*salary;
		System.out.println("Monthly salary of "+Tutor_name+" is"+totalSalary);
		
		
	}	
	public void print_tutor_details()
	{
		System.out.println("Teacher name:"+Tutor_name+"\n"+"Address:"+Tutor_address);
	}

} 