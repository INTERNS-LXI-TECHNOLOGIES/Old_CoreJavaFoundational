 package com.lxisoft.campus.college;
 import java.util.*;
 public class College
{
	Department dept[]=new Department[10];
	private String name;
	Scanner Scan=new Scanner(System.in);

	public void setClgName(String name)
	{
		this.name=name;
		
		
	}
	public void setDepartment()
	{	
		System.out.print("Enter no of dept:");
		int tot_dept =Scan.nextInt();
		
		
			for(int i=0;i<tot_dept;i++)
		{
			if(dept[i]==null)
			{
						
				dept[i]=new Department();
				System.out.print("Enter name of dept:");
				String dept_name=Scan.next();
				dept[i].setDeptName(dept_name);
			
			
			}
		}
	}	
	public void setClass()
	{
		System.out.print("Enter name of dept to add class:");
		String dept_name=Scan.next();
		for(int i=0;i<10;i++)
		{
			
			if (dept[i]!=null)
			{	
							
					String dep=dept[i].getName();
					if(dep.equals(dept_name))
					{	
						
						dept[i].setclass();
					}
			}
		}
	
		
	}
	public void setStudent()
	{
		System.out.print("Enter department:");
		String dept_name=Scan.next();
		for(int i=0;i<10;i++)
		{
			
			if (dept[i]!=null)
			{	
							
					String dep=dept[i].getName();
					if(dep.equals(dept_name))
					{	
						
						dept[i].setStudent();
					}
			}
		}
	}
public void display()	
{
	System.out.println(this.name);
	for(int i=0;i<10;i++)
	{
		if(dept[i]!=null)
		{	
			dept[i].display();
		}
	}
}	

}