package com.lxisoft.campus.college;
import  com.lxisoft.campus.student.*;
import java.util.*;
public class Class
{
	Scanner Scan=new Scanner(System.in);
	Student []students=new Student[10];
	private String name;
		
		
	Class(String cls_name,String dept_name)
	{
		this.name=cls_name;
		setStudent(dept_name);
	}
		
	String getName()
		{
			return this.name;
		}
				
	public void setStudent(String dept_name)
	{	
		System.out.print("Enter no of students:");
		int tot_stud =Scan.nextInt();
		for(int i=0;i<tot_stud;i++)
			{
					System.out.print("Enter name of student:");
					String stud_name=Scan.next();
					if(dept_name.equals("cse"))
					{
						students[i]=new CseStudent(stud_name);
					}
					else if(dept_name.equals("mech"))
					{
						students[i]=new MechStudent(stud_name);
					}
			}
			
	}
	
	public void display()	
	{
		System.out.println(this.name);
		for(int i=0;i<10;i++)
		{
			if(students[i]!=null)
			{	
				if(students[i] instanceof CseStudent)
				{
					students[i].display();
				}
				else if (students[i] instanceof MechStudent)
				{
					students[i].display();
				}
			}
		}
	}
}
