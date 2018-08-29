package com.lxisoft.college;
import java.util.*;
import com.lxisoft.college.department.Department;
public class College
{
	private String C_name;
	private String C_address;
	public int depNo,j,n;
	Scanner input=new Scanner(System.in);
	Scanner string_input=new Scanner(System.in);
	Department dep[]=new Department[2];
	
	public void set_college_name(String name)
	{
		this.C_name=name;
	}
	public void set_college_address(String address)
	{	
		this.C_address=address;
	}
	public String getCollege_name()
	{
		return C_name;
		
	}
	public String getCollege_address()
	{
		return C_address;
		
	}
	public void enter_college_details()
	{
		System.out.println("********College Management*********");
	System.out.println("Enter the name of the college:");
	C_name=string_input.nextLine();
	
	System.out.println("Enter the address of the college:");
	C_address=string_input.nextLine();
	
		System.out.println("Enter the no of department");
		int depNo=input.nextInt();
		for(j=0;j<depNo;j++)
		{
	
	
		dep[j]=new Department();
		dep[j].enter_department_details();
		}
	}
	public void print_college_details()
	{
	
				System.out.println("\n");
				System.out.println("*************Details of "+C_name+ " College****************");
				System.out.println("\n");
				System.out.println("College name:"+C_name+"\n"+"Address:"+C_address);
				
				for(int j=0;j<dep.length;j++)
				{
					dep[j].print_department_details();
				}
			
	
	}


}