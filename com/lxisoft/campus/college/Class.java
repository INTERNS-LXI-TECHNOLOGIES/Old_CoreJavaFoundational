 package com.lxisoft.campus.college;
 import java.util.*;
	public class Class

	{
		Scanner Scan=new Scanner(System.in);
		Student stud[]=new Student[10];
		
		private String name;
		
		String getName()
		{
			return this.name;
		}
				
	void setStudent()
	{
		System.out.print("Enter no of student:");
			
			int tot_stud =Scan.nextInt();
			
			
				for(int i=0;i<tot_stud;i++)
			{
				if(stud[i]==null)
				{
					stud[i]=new Student();
					System.out.print("Enter name of student:");
					String stud_name=Scan.next();
					stud[i].setStudName(stud_name);
				
				
				}
			}
	}
	
	void setClsName(String name)
	{
		this.name=name;
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
