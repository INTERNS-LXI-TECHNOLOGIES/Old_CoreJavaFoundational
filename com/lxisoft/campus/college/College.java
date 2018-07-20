 package com.lxisoft.campus.college;
 import java.util.*;
 public class College
{   
  private  String name; 
  private Department dept[]=new Department[10];
  
  
  public College(String cname)
  {
  this.name=cname;
  setDepartment();
  display();
  }
  
	
	
	

	public void setDepartment()
	{	
	    Scanner Scan=new Scanner(System.in);
		System.out.print("Enter no of dept:");
		int tot_dept =Scan.nextInt();
		
		
			for(int i=0;i<tot_dept;i++)
		{
			if(dept[i]==null)
			{
						
				
				System.out.print("Enter name of dept:");
				String dept_name=Scan.next();
				dept[i]=new Department(dept_name);
				
			
			
			}
		}
	}	
	
public void display()	
{
	System.out.println("		"+this.name+"		");
	System.out.println("****************************");
	for(int i=0;i<10;i++)
	{
		if(dept[i]!=null)
		{	
			dept[i].display();
		}
	}
}	

}