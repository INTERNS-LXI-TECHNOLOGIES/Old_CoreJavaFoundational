package com.lxisoft.college.student;
public class Student
{
	private String Stud_name,Stud_address;
	
	public void set_student_name(String stud_name)
	{
		this.Stud_name=stud_name;
		
		
		
	}
	public void set_student_address(String stud_address)
	{
		this.Stud_address=stud_address;
	}
	
	public String get_student_name()
	{
		return Stud_name;
		
		
	}
	public String get_student_address()
	{
		return Stud_address;
		
		
	}
}