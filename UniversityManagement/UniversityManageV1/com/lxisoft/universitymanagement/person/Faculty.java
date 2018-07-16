package com.lxisoft.universitymanagement.person;

public class Faculty extends Person
{
	private String[] subjects;
	
	public Faculty(String id,String name,String[] subjects)
	{
		setID(id);
		setName(name);
		this.subjects=subjects;
	}
	
	public String toString()
	{
		String subs="";
		for(String str:subjects)
		{
			subs+=' '+str+',';
		}
		return "\nFacultyID :\t"+getID()+"\nName :\t\t"+getName()+"\nSubjects :\t"+subs.substring(0,subs.length()-1);
	}
}