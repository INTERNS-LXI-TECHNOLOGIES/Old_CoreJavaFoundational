package com.lxisoft.inheritance.student;
public class MechStudent extends Student {
	String mechJob="Mechanic";
	
	public void printDetails()
	{

		System.out.println("Name:"+getName());
		System.out.println("Admno:"+getAdmno());
		System.out.println("Designation:"+mechJob);
	}

}