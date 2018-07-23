package com.lxisoft.campus.college;
import java.util.*;
public class Class
{
	
		Scanner Scan=new Scanner(System.in);
		Student student[]=new Student[10];
		Faculty faculty[]=new Faculty[10];
		
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
			
			int tot_stud =Scan.nextInt();
			
			
				for(int i=0;i<tot_stud;i++)
			{
				if(student[i]==null)
				{
					
					System.out.println("Enter name of student");
					String stud_name=Scan.next();
					System.out.println("enter the id of "+stud_name);
				    int student_id=Scan.nextInt();
					System.out.println("enter department of student");
					String stud_dep=Scan.next();
					
				    if (stud_dep.equals("cse"))
					{
					student[i]=new Cse(stud_name,student_id);
					}
				    else
					{
					student[i]=new 	Mech(stud_name,student_id);
					}
				
				}			
			}
	}
	
	
	void setFaculty()
	{
		System.out.print("Enter no of faculty:");
			
			int tot_faculty =Scan.nextInt();
			
			
				for (int i=0;i<tot_faculty;i++)
			{
				if(faculty[i]==null)
				{
					System.out.print("name of faculty:");
					String fname=Scan.next();
					System.out.print(" enter the id of "+fname);
					int fid=Scan.nextInt();
					faculty[i]=new Faculty(fname,fid);
				}
			}	
	}
	
	public void display()	
	{
		System.out.println(this.name);
		System.out.println(" FACULTIES");
		System.out.println("----------");
		for(int i=0;i<10;i++)
		{
			if(faculty[i]!=null)
			{	
				faculty[i].display();
			}
			
		}
	     System.out.println(" STUDENTS");
		 System.out.println("----------");
		for(int i=0;i<10;i++)
		{
			if(student[i]!=null)
			{	
				student[i].display();
			}
			
		}
	}

}
