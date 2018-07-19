package com.lxisoft.inheritance.student;
public class Csestudent extends Student
{
	String csekeyatribute="Programmer";
	public void cseprint()
		{
			Csestudent q=new Csestudent();
			System.out.println("Name::"+super.getName()+"\nAdmition number"+getAdmn()+"\nKeyattribute::"+q.csekeyatribute);
		}
	
	
}