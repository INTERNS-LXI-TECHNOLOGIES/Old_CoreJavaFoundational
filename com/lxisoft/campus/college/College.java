 package com.lxisoft.campus.college;
 import java.util.*;
 public class College
{   
  private  String name; 
  private Department departments[]=new Department[10];
  
  
  public College(String cname)
  {
  this.name=cname;
  setDepartment();
  showDetails();
  }
  
	public String getCollege()
	{
		return this.name;
	}	
	
	

	public void setDepartment()
	{	
	    Scanner Scan=new Scanner(System.in);
		System.out.print("Enter no of dept:");
		int tot_dept =Scan.nextInt();
		
		
			for(int i=0;i<tot_dept;i++)
		{
			if(departments[i]==null)
			{
						
				
				System.out.print("Enter name of dept:");
				String dept_name=Scan.next();
				departments[i]=new Department(dept_name);
				
			
			
			}
		}
	}	
	
public void showDetails()	
{
	System.out.println(getCollege());
	System.out.println("****************************");
	for(int i=0;i<10;i++)
	{
		if(departments[i]!=null)
		{	
			departments[i].showDetails();
		}
	}
}	

}