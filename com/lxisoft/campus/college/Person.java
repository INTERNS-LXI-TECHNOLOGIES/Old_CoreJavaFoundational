package com.lxisoft.campus.college;
public class Person
{
	private String name;
	private int rno;
	public Person(String name,int rno)
	{
		this.name=name;
		this.rno=rno;
	}
	public void studDetails()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll Number:"+rno);
	}
}
		