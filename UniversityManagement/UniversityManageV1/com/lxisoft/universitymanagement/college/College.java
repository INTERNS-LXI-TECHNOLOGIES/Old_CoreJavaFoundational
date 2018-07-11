package com.lxisoft.universitymanagement.college;
import java.util.ArrayList;
import com.lxisoft.universitymanagement.departments.*;
public class College
{
	String id;
	String name;
	ArrayList<Department> depts=new ArrayList<Department>();
	
	public College(String id,String name,ArrayList<Department> depts)
	{
		this.id=id;
		this.name=name;
		this.depts=depts;
	}
	
	public String getID()
	{
		return id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String toString()
	{
		return "\nCollege ID: \t"+id+"\nCollegeName: \t"+name;
	}
	
	public String getDepts()
	{
		String deps="";
		for(Department d:depts)
			deps+=d.getName()+',';
		return deps.substring(0,deps.length()-1);
	}
}