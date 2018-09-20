package com.lxisoft.forest;
import java.util.*;
public class ForestView
{

	public String askName()
	{
		System.out.print("Enter Forest name: ");
		Scanner scan=new Scanner(System.in);
		return scan.nextLine();
	}

	public void printName(String name)
	{
		System.out.println("---------------Welcome to "+name+" Forest------------------");
	}
}