package com.lxisoft.inheritance.student;
public class Mechstudent extends Student
{
	String mechkeyatribute=("Mechanic");
	public void mechprint()
		{
			Mechstudent y=new Mechstudent();
		
			System.out.println("Name::"+y.getName()+"\nAdmition number"+y.getAdmn()+"\nKeyattribute::"+y.mechkeyatribute);
		}

	
}