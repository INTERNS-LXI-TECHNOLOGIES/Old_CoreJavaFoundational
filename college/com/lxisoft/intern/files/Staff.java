package com.lxisoft.intern.files;
import java.io.*;
import java.util.*;
public class Staff
{   String name;
	int id;
	int salary;
    static BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
    static Scanner in = new Scanner (System.in);

    public void createStaff()
	{
        try{
     System.out.println("Enter the name   : ");
	 name=input.readLine();
	 System.out.println("Enter the id     : ");
	 id=in.nextInt();
	 System.out.println("Enter the salary : ");
     salary=in.nextInt();}catch(IOException e){}
    
    }
     public void displayStaff()
    {
    	System.out.println("Name:"+name+"\nID:"+id+"\nSalary:"+salary);
    }
}