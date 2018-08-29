package com.lxisoft.college.test;
import com.lxisoft.college.student.*;
public class TDD
{
	public static void main(String arg[])
	{
		CSE cse_student=new CSE();
		MECH mech_student=new MECH();
		mech_student.print_mech_student_details("Aruna");
		cse_student.print_cse_student_details("Abinz");
		Student stud=new Student();
		stud.set_student_details("Akhil S","Palakkad");
		stud.print_student_details();	
	}
}