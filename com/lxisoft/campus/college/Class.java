package com.lxisoft.campus.college;
import java.util.*;
public class Class
{
	
		Scanner Scan=new Scanner(System.in);
		Student stud[]=new Student[10];
		
		private String name;
		
		
		
	Class(String cname)
    {
       this.name=cname;
	   setStudent();
	}  
	void setStudent()
	{
		System.out.print("Enter no of student:");
			
			int tot_stud =Scan.nextInt();
			
			
				for(int i=0;i<tot_stud;i++)
			{
				if(stud[i]==null)
				{
					
					System.out.print("Enter name of student:");
					String stud_name=Scan.next();
					System.out.println("enter department of student");
					String stud_dep=Scan.next();
					
				    if (stud_dep equls("cse"))
					{
					student[i]=new Cse(stud_name);
					}
				    else
					{
					student[i]=new 	Mech(stud_name);
					}
				
				}			
			}
	}
	
	
	
	
	
	public void display()	
	{
		System.out.println(this.name);
		for(int i=0;i<10;i++)
		{
			if(stud[i]!=null)
			{	
				stud[i].display();
			}
		}
	}

}