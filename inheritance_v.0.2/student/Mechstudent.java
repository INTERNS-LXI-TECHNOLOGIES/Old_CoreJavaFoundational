package com.lxisoft.inheritance.student;
public class Mechstudent extends Student
{
	String mechkeyatribute="Mechanic";
	public void mechprint()
		{
			
		
			System.out.println("Name::"+getName()+"\nAdmition number"+getAdmn()+"\nKeyattribute::"+mechkeyatribute);
		}

	
}