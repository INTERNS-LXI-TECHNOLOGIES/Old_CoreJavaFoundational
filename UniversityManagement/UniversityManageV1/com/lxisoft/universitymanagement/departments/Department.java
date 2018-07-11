package com.lxisoft.universitymanagement.departments;

public abstract class Department
{
	private String name;
	
	public Department()
	{
		name=this.getClass().getSimpleName();
	}
	
	public String getName()
	{
		return name;
	}
}