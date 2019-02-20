package com.lxisoft.hotelv1;
import java.util.Scanner;
public class Cashier
{
	private String username;
	private String password;
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getUsername()
	{
		return username;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	public String getPassword()
	{
		return password;
	}
	public void userDetails()
	{
		username="cashier";
		password="user";
	}
	public void printBill()
	{
		System.out.println("\t\t\t\tFOOD PALACE\t\t\t\t");
		System.out.println("\t\t\t\tBILL\t\t\t\t");
		System.out.println("\t\t---------------------------------------\t\t");
		System.out.println("SNo\t\t\t\tFood items\t\t\t\tCount\t\t\t\tPrice");
		
	}
}