package com.lxisoft.campus.college;
import java.util.*;
public class College
{
	Department dept[]=new Department[10];
	private String name;
	private int tot_dept;
		public College (String name)
		{
			this.name=name;
			setDepartment();
		}

		

		public void setDepartment()

		{
					Scanner Scan=new Scanner(System.in);
					System.out.print("Enter no of dept:");	
					tot_dept=Scan.nextInt();
					for(int i=0;i<tot_dept;i++)
					{
						if(dept[i]==null)
							{
							System.out.print("Dept Name:");
							String dept_name=Scan.next();
							dept[i]=new Department(dept_name);
							}
					}
		}	
		
		public void display()	
		{
			System.out.println(""+this.name);
			for(int i=0;i<tot_dept;i++)
			{		
				if(dept[i]!=null)
				{	
					dept[i].display();
				}
			}
	
		}	

	}