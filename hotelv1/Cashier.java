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
		System.out.println("\t\t\tFOOD PALACE\t\t\t");
		System.out.println("SNo\t\tFood items\t\t Count\t\tPrice");
		
	}
}