package com.lxisoft.college.student;
import java.util.*;
public class StudentDetails
{
	Scanner sc= new Scanner(System.in);
	Student st=new Student();
	public void detail()
	{
		System.out.println("Enter the id");
		int id=sc.nextInt();
		if(id>150)
		{
			System.out.println("Seat unavailable");
		}
			else
			
			
				System.out.println("Enter the student details");
				Scanner s1=new Scanner();
				System.out.println("enter the name:");
				String name=s1.nextLine();
				st.setname(name);
				
				Scanner s2=new Scanner(System.in);
				System.out.println("enter the student address:");
				String add=s1.nextLine();
				st.setaddress(address);
				System.out.println("name is:"+st.getname());
				System.out.println("address is:"+st.getaddress());
			
		
			
		
			
	}


}