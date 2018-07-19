 package com.lxisoft.campus.college;
 import java.util.*;
public class Department
	

{
	private String name;
	Class [] classes=new Class[10];
	Scanner Scan=new Scanner(System.in);
public	String getName()
	{
		return this.name;
	}

	public void setDeptName(String name)
	{
		this.name=name;
		
		
	}
	public void setStudent()
	{
		System.out.print("Enter class:");
		String cls_name=Scan.next();
		for(int i=0;i<10;i++)
		{
			
			if (classes[i]!=null)
			{	
							
					String cl=classes[i].getName();
					if(cl.equals(cls_name))
					{	
						
						classes[i].setStudent();
					}
			}
		}

	
	
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
						classes[i]=new Class();
						System.out.print("Enter name of class:");
						String cls_name=Scan.next();
						classes[i].setClsName(cls_name);
					
					
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
