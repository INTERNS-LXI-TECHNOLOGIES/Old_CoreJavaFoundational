package com.lxisoft.campus.college;
import java.util.*;

public class College
{
	private Department departments[]=new Department[10];
	private String collegeName;
	private int totalDepartments;
	
	public void setCollegeName(String name)
	{
		this.collegeName=name;
		addDepartment();
	}
		
	public String getCollegeName()
	{
		return this.collegeName;
	}
	
	public void addDepartment()
	{
		Scanner Scan=new Scanner(System.in);
		System.out.print("Enter no of departments:");	
		totalDepartments=Scan.nextInt();
		for(int i=0;i<totalDepartments;i++)
		{
			if(departments[i]==null)
			{
				System.out.print("Department Name:");
				String departmentName=Scan.next();
				departments[i]=new Department();
				departments[i].setDepartmentName(departmentName);
			}			
		}
	}		

	public void showDetails()	
	{	
		System.out.println(""+getCollegeName());
		for(int i=0;i<totalDepartments;i++)
		{		
			if(departments[i]!=null)
			{	
				departments[i].showDetails();
			}
		}	
	}	

}