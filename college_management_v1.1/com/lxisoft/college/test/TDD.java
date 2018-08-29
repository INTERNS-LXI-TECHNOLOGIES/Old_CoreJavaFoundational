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
		//System.out.println(stud.Stud_name);
		stud.set_student_name("Akhil S");
		stud.set_student_address("Palakkad");
		System.out.println(stud.get_student_name());	
		
		System.out.println(stud.get_student_address());
	}
}