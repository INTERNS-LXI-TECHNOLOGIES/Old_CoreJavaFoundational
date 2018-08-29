
package com.lxisoft.college.student;

public class Student
{
	String Stud_name,Stud_address;
	
	public void set_student_details(String stud_name,String stud_address)
	{
		Stud_name=stud_name;
		Stud_address=stud_address;
		
		
	}
	public void print_student_details()
	{
		System.out.println("Student name:"+Stud_name+"\n"+"Address:"+Stud_address);
		
		
	}

} 