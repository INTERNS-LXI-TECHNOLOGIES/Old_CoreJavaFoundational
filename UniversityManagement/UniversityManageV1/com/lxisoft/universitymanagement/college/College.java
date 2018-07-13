package com.lxisoft.universitymanagement.college;
import java.util.ArrayList;
import com.lxisoft.universitymanagement.departments.*;
public class College
{
	private String id;
	private String name;
	private String abbr;
	private ArrayList<Department> departmentList=new ArrayList<Department>();
	
	public College(String id,String name,String abbr)
	{
		this.id=id;
		this.name=name;
		this.abbr=abbr;
	}
	
	public void addDepartment(Department d)
	{
		departmentList.add(d);
	}
	
	public String getID()
	{
		return id;
	}
	
	public String getAbbr()
	{
		return abbr;
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
		for(Department d:departmentList)
		{
			deps+=' '+d.getName()+',';
		}
		return deps.substring(0,deps.length()-1);
	}
	
	public Department getDepartment(int deptIndex)
	{
		return departmentList.get(deptIndex);
	}
	
	public void getDepartmentFaculty()
	{
		for(Department d:departmentList)
		{
			System.out.println("\n\n------------------------------------");
			System.out.println(d.getName()+" Department");
			d.printFacultyList();
		}
	}
}