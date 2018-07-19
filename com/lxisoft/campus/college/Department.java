 package com.lxisoft.campus.college;
 import java.util.*;
public class Department
	

{
	private String name;
	Class [] classes=new Class[10];
	Scanner Scan=new Scanner(System.in);
    Department(String dname)
	{
		this.name=dname;
		setclass();
	}

	
	

	public void setclass()
	{	
			Scanner Scan=new Scanner(System.in);
			System.out.print("Enter no of class:");
			
			int tot_cls =Scan.nextInt();
			
			
				for(int i=0;i<tot_cls;i++)
				{
					if(classes[i]==null)
					{
						
						System.out.print("Enter name of class:");
						String cls_name=Scan.next();
						classes[i]=new Class(cls_name);
					
					
					}
				}
		
	
		
	}

	
	
	



	public void display()	
	{
		System.out.println(this.name);
		for(int i=0;i<10;i++)
		{
			if(classes[i]!=null)
			{	
				classes[i].display();
			}
		}
	}

}
