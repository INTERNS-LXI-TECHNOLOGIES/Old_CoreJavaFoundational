package com.lxisoft.campus.person;

public class Person
{
	private String personName,personIdno;
	private int personAge;
	
	public void addPerson(String name,String idno,int age)
	{
		this.personName=name;
		this.personIdno=idno;
		this.personAge=age;
	}
	
	
	
	public void showDetails()
	{
		System.out.print(this.personName+"\t"+this.personIdno+"\t"+this.personAge+"\t");
	}
}