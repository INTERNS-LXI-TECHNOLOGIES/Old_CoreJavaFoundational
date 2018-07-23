package com.lxisoft.campus.student;
import com.lxisoft.campus.college.*;
public class Person
{
	private String name,idno;
	private int age;
	
	public Person(String name,String idno,int age)
	{
		this.name=name;
		this.idno=idno;
		this.age=age;
	}
	public void display()
	{
		System.out.print(this.name+"\t"+this.idno+"\t"+this.age+"\t");
	}
}