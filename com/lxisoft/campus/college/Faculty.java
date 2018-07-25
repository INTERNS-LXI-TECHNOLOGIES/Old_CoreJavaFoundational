package com.lxisoft.campus.college;
import java.util.*;
public class Faculty
{
	private String name;
	private int sal;
	private int sub;
	private int hrs;
	private int salary;
	public Faculty(String name,int sal,int sub,int hrs)
	{
		this.name=name;
		this.sal=sal;
		this.sub=sub;
		this.hrs=hrs;
	}
	void facDetails()
	{
		System.out.println("Name of Faculty:"+name);
		salary=hrs*sal;
		System.out.println("Salary is:"+salary);
	}
}
		
	
