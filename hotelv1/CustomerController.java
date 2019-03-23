package com.lxisoft.hotelv1;
import java.util.Scanner;
public class CustomerController
{
	Scanner scan=new Scanner(System.in);
	private Customer customer;
	public void setCustomer(Customer customer)
	{
		this.customer=customer;
	}
	public Customer getCustomer()
	{
		return customer;
	}
	public void userDetails()
	{
		customer=new Customer();
		customer.setUsername("user");
		customer.setPassword("user");
	}
	public String selectFood()
	{
	
	String food=scan.next();
	return food;
	}
}