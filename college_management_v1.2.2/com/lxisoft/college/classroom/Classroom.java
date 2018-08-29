package com.lxisoft.college.classroom;
import java.util.*;
import com.lxisoft.college.College;
import com.lxisoft.college.department.Department;
import com.lxisoft.college.teacher.Teacher;
import com.lxisoft.college.student.Student;

public class Classroom 
{
private String Class_name;
private String Class_location;
 public int studNo;
Scanner input=new Scanner(System.in);
	Scanner string_input=new Scanner(System.in);
	Teacher tutor=new Teacher();
	Student student[]=new Student[2];
	ArrayList<Student> students=new ArrayList<Student>();
	
	
	public void setClassroom_name(String class_name)
	{
		this.Class_name=class_name;
		
		
	}
	public void setClassroom_location(String class_location)
	{
		
		this.Class_location=class_location;
		
	}
	public String getClassroom_name()
	{
		return Class_name;
	}
	public String getClassroom_location()
	{
		return Class_location;
	}
	public void enter_classroom_details()
	{
		System.out.println("Enter the name of classroom ");
		Class_name=string_input.nextLine();
		System.out.println("Enter the location of classroom ");
		Class_location=string_input.nextLine();
		tutor.enter_tutor_details();
		System.out.println("enter the no of students you want");
		int studNo=input.nextInt();
		for(int i=0;i<studNo;i++)
		{
			students.add(student[i]);
			student[i]=new Student();
			student[i].enter_student_details();
		}
	}
	public void print_classroom_details()
	{
		
		System.out.println("Class name:"+Class_name+"\n"+"Class location:"+Class_location);
		tutor.print_tutor_details();
		
		for(int i=0;i<students.size();i++)
		{
				student[i].print_student_details();
		}
			
	}

		
		
		
		
		
		
	

} 