package com.lxisoft.college.student;

public class Programmers extends Student
{
	String programmer;
	void print_programmer_details(String programer_name)
	{
		programmer=programer_name;
		System.out.println("Student"+programer_name+"is a programmer");
	}	
}