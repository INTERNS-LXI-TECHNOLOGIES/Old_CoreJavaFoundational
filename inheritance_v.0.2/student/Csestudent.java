package com.lxisoft.inheritance.student;
public class Csestudent extends Student
{
	String csekeyatribute="Programmer";
	public void cseprint()
		{
			System.out.println("Name::"+getName()+"\nAdmition number"+getAdmn()+"\nKeyattribute::"+csekeyatribute+"\nTotal Mark"+getsum()+"\n Average"+getavg());
		}
	
	
}