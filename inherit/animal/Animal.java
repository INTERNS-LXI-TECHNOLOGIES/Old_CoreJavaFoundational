package org.unicef.inherit.animal;
public class Animal
{
	
	private String name;
	private String name2;
	
	public void setname1(String name1)
	{
		this.name=name1;
	}
	public String getname1()
	{
		return name;
	}
	public void setname2(String name3)
	{
		this.name2=name3;
	}
	public String getname2()
	{
		return name2;
	}
	public void di()
	{
		System.out.println("from parent class");
	}
}