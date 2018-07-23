package com.lxisoft.campus.college;
import  com.lxisoft.campus.student.*;
import java.util.*;
public class Class
{
	
	Student cse_stud[]=new CseStudent[10];
	Student mech_stud[]=new MechStudent[10];
	Student stud[]=new Student[10];
	Faculty fac;
	private String name;
		
		
	Class(String cls_name,String dept_name)
	{
		this.name=cls_name;
		setPerson(dept_name);
	}
		
	
				
	public void setPerson(String dept_name)
	{	
		Scanner Scan=new Scanner(System.in);
		System.out.println("Enter faculty name,idno & age:");
		String fac_name=Scan.next();
		
		String fac_idno=Scan.next();
		int fac_age=Scan.nextInt();

			
		fac=new Faculty(fac_name,fac_idno,fac_age);
		
		System.out.print("Enter no of students:");
		int tot_stud =Scan.nextInt();
			
		
		
		for(int i=0;i<tot_stud;i++)
			{
			
					System.out.print("Enter name,idno & age of student:");
					String stud_name=Scan.next();
					String stud_idno=Scan.next();
					int stud_age=Scan.nextInt();
					if(dept_name.equals("mech"))
					{
						stud[i]=new MechStudent(stud_name,stud_idno,stud_age);
					}
					else if(dept_name.equals("cse"))
					{
						
						stud[i]=new CseStudent(stud_name,stud_idno,stud_age);
					}
					else
						stud[i]=new Student(stud_name,stud_idno,stud_age);
			}	
			
	}
	
	public void display(String dept_name)	
	{
		System.out.print("Class:");
		System.out.println(this.name);
		System.out.println("\tname\tid\tage\ttot mark\tavg");
		System.out.print("Faculty:");
		
		fac.display();
		System.out.println("");
		System.out.println("Students:");
		for(int i=0;i<10;i++)
		{	if(dept_name.equals("cse"))
			{
				if(cse_stud[i]!=null)
				{
					cse_stud[i].display();
					
				}
			}
			else if(dept_name.equals("mech"))
			{
				if(mech_stud[i]!=null)
				{
					mech_stud[i].display();
				}
			}				
			else
			{
				if(stud[i]!=null)
				{
					stud[i].display();
				}
			}
		}
	}
		
}
