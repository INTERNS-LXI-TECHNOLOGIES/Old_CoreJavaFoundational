package com.lxisoft.universitymanagement.faculty;

public class Faculty
{
	private String facultyID;
	private String name;
	private String[] subjects;
	
	public Faculty(String facultyID,String name,String[] subjects)
	{
		this.facultyID=facultyID;
		this.name=name;
		this.subjects=subjects;
	}
	
	public String toString()
	{
		String subs="";
		for(String str:subjects)
		{
			subs+=' '+str+',';
		}
		return "\nFacultyID :\t"+facultyID+"\nName :\t\t"+name+"\nSubjects :\t"+subs.substring(0,subs.length()-1);
	}
}