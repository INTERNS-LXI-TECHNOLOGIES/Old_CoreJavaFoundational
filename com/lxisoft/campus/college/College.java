package com.lxisoft.campus.college;
import java.util.*;
public class College
{
	Department dept[]=new Department[2];
	private String name;

		public College (String name)
		{
			this.name=name;
			setDepartment();
		}

		

		public void setDepartment()
		{	
					System.out.println("cse");
					dept[0]=new Department("cse");
					System.out.println("mech");
					dept[1]=new Department("mech");
		}	
		
		public void display()	
		{
			System.out.println(this.name);
			for(int i=0;i<2;i++)
			{
				if(dept[i]!=null)
				{	
					dept[i].display();
				}
			}
		}	

	}