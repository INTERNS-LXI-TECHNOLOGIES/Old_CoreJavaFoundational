 package com.lxisoft.campus.college;
 import java.util.*;
public class Department
	

{
	private String name;
	Class [] classes=new Class[10];
	Scanner Scan=new Scanner(System.in);
    Department(String departmentname)
	{
		this.name=departmentname;
		setclass();
	}

	
	

	public void setclass()
	{	
			Scanner Scan=new Scanner(System.in);
			System.out.print("Enter no of class:");
			
			int totalclass =Scan.nextInt();
			
			
				for(int i=0;i<totalclass;i++)
				{
					if(classes[i]==null)
					{
						
						System.out.print("Enter name of class:");
						String cls_name=Scan.next();
						classes[i]=new Class(cls_name);
					
					
					}
				}
		
	
		
	}

	
	
	

    public String getDepartment()
	{
		 return this.name;
	}	

	public void showDetails()	
	{
		System.out.println(getDepartment());
		
		System.out.println("******");
		for(int i=0;i<10;i++)
		{
			if(classes[i]!=null)
			{	
						
				        classes[i].showDetails();
			}
		}
	}

}
