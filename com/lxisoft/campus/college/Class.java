package com.lxisoft.campus.college;
import java.util.*;
public class Class
{
	
		Scanner Scan=new Scanner(System.in);
		Student students[]=new Student[10];
		Faculty facultys[]=new Faculty[10];
		
		private String name;
		
		
		
	Class(String cname)
    {
       this.name=cname;
	   
	   setPerson();
	   
	}  
	void setPerson()
	{
			setStudent();
			setFaculty();
		
	}
			
	void setStudent()
	{
		System.out.print("Enter no of student:");
			
			int totalstudent =Scan.nextInt();
			
			
				for(int i=0;i<totalstudent;i++)
			{
				if(students[i]==null)
				{
					
					System.out.println("Enter name of student");
					String studentname=Scan.next();
					System.out.println("enter the id of "+studentname);
				    int studentid=Scan.nextInt();
					students[i]=new Student(studentname,studentid);
				}			
			}
	}
	
	
	void setFaculty()
	{
		System.out.print("Enter no of faculty:");
			
			int totalfaculty =Scan.nextInt();
			
			
				for (int i=0;i<totalfaculty;i++)
			{
				if(facultys[i]==null)
				{
					System.out.print("name of faculty:");
					String facultyname=Scan.next();
					System.out.print(" enter the id of "+facultyname);
					int facultyid=Scan.nextInt();
					facultys[i]=new Faculty(facultyname,facultyid);
				}
			}	
	}
    public String getClassName()
	{
	return this.name;
	}
	public void showDetails()	
	{
		System.out.println(getClassName());
		System.out.println(" FACULTIES");
		System.out.println("----------");
		for(int i=0;i<10;i++)
		{
			if(facultys[i]!=null)
			{	
				facultys[i].showDetails();
			}
			
		}
	     System.out.println(" STUDENTS");
		 System.out.println("----------");
		for(int i=0;i<10;i++)
		{
			if(students[i]!=null)
			{	
				students[i].showDetails();
			}
			
		}
	}

}
