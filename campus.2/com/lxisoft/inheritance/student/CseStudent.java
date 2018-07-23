package com.lxisoft.inheritance.student;
public class CseStudent extends Student{
	String cseJob="Programmer";
	
	
	public void printCseDetails()
	{		
		System.out.println("Name:"+getName());
		System.out.println("Admno:"+getAdmno());
		System.out.println("Designation:"+cseJob);
		
	}

}