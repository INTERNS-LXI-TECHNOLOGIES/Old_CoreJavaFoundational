package com.lxisoft.college.department;import java.util.*;
import com.lxisoft.college.classroom.Classroom;
import com.lxisoft.college.College;
import com.lxisoft.college.test.TDD;
public class Department 
{
	Classroom classRoom[]=new Classroom[4];
	ArrayList<Classroom> cRoom=new ArrayList<Classroom>();
	private String Dept_name,Dept_location;
	public int classNo;
	Scanner input=new Scanner(System.in);
	Scanner string_input=new Scanner(System.in);
	
	public void setDepartment_name(String dept_name)
	{
		this.Dept_name=dept_name;
		
	}
	public void setDepartment_location(String dept_location)
	{
		
		this.Dept_location=dept_location;
	}
	public String getDepartment_name()
	{
		return Dept_name;
	}
	
	public String getDepartment_location()
	{
		return Dept_location;
	}
	public void enter_department_details()
	{
				
		System.out.println("Enter the name of department");
		Dept_name=string_input.nextLine();
		System.out.println("Enter the location of department");	
		Dept_location=string_input.nextLine();
		System.out.println("enter the no of classroom you want");
		int classNo=input.nextInt();
		for(int i=0;i<classNo;i++)
		{
			cRoom.add(classRoom[i]);
			classRoom[i]=new Classroom();
			classRoom[i].enter_classroom_details();
			
		}
		
	}
	public void print_department_details()
	{
		System.out.println("Department name:"+Dept_name+"\n"+"Department location:"+Dept_location);
		
		for(int i=0;i<cRoom.size();i++)
		{
			classRoom[i].print_classroom_details();		
		}
			
	}
	
		
		
		

		
	

}