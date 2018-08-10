package com.lxisoft.averagemarks.college;
import java.util.Scanner;
import com.lxisoft.averagemarks.college.Student;
import com.lxisoft.averagemarks.college.Faculty;
public class College
{
	Scanner sc2 = new Scanner(System.in);
	
public void ave()

{
	Faculty f=new Faculty();
	Student st=new Student();
	
	System.out.println("ARE YOU A STUDENT (1) OR FACULTY(2)?");
	int choice=sc2.nextInt();
	switch(choice)
	{
		case 1:st.inputDetails();
		break;
		case 2: f.display();
		break;
		default:System.out.println("INVALID");
	
	}
	
}

}