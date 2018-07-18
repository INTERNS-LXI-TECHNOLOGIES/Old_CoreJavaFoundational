package com.lxisoft.college.student;

public class Mechanic extends Student
{
	String mechanic;
	void print_mechanic_details(String mechanic_name)
	{
		mechanic=mechanic_name;
		System.out.println("Student"+mechanic_name+"is a mechanic");
	}	
}