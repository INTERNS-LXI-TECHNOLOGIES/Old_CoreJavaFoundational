package com.lxisoft.campus;

public class Student 
{
	private String name1;
	private String name2;
	
	public void setname1(String nm1)
	{
		this.name1=nm1;
	}
	
	public void setname2(String nm2)
	{
		this.name2=nm2;
	}
	
	
	public String getname1()
	{
		return name1;
	}
	
	public String getname2()
	{
		return name2;
	}
	public void pip()
	{
System.out.println("from parent class");
	}
}