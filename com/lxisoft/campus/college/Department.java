package com.lxisoft.campus.college;
import java.util.*;

public class Department
{
	private String departmentName;
	private Class classes[]=new Class[10];
	
	public void setDepartmentName (String name)
	{
		this.departmentName=name;
		addClass();
	}
	public String getDepartmentName()
	{
		return this.departmentName;
	}
	
	

	public void addClass()
	{	
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter no of classes:");
		int totalClasses =Scan.nextInt();
		for(int i=0;i<totalClasses;i++)
		{
			if(classes[i]==null)
			{
				System.out.print("Enter name of class:");
				String className=Scan.next();		
				classes[i]=new Class();
				classes[i].setClassName(className);
			}
		}
	}	

	public void showDetails()	
	{	
		System.out.print("Department:");
		System.out.println(getDepartmentName());
		for(int i=0;i<10;i++)
		{
			if(classes[i]!=null)
			{	
				classes[i].showDetails();
			}
		}
	}

}
