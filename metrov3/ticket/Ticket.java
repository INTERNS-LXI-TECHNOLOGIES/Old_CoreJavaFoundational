package com.lxisoft.metrov3.ticket;
public class Ticket
{
	
	private String name;
	private String gender;
	private	String aadharno;
	private String age;
	private String price;
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	public String getGender()
	{
		return gender;
	}
	public void setAadharNo(String aadharno)
	{
		this.aadharno=aadharno;
	}
	public String getAadharNo()
	{
		return aadharno;
	}
	public void setAge(String age)
	{
		this.age=age;
	}
	public String getAge()
	{
		return age;
	}
	public void setPrice(String price)
	{
		this.price=price;
	}
	public String getPrice()
	{
		return price;
	}
	
		
public void ticketDetails()
	{	
	System.out.print("\tTicket Details\n");
	System.out.print("Passenger Name:"+getName()+"\n");
	System.out.print("Gender:"+getGender()+"\n");
	System.out.print("Age:"+getAge()+"\n");
	System.out.print("Aadhar Number:"+getAadharNo()+"\n");
	System.out.print("Price:"+getPrice()+"\n");
	}

}