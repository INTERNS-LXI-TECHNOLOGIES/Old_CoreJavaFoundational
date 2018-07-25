package com.lxisoft.campus.college;
import java.util.*;
public class Student extends Person
{    
    private double average;
	private int sub1;
	private int sub2;
    private int sub3;
	private int totalmark;
	Scanner scan=new Scanner(System.in);
	Student(String name,int id)
	{   
		super(name,id);
        System.out.println("enter the mark of 3 subjects");										
		sub1=scan.nextInt();
	    sub2=scan.nextInt();	
	    sub3=scan.nextInt();
        totalmark=sub1+sub2+sub3;
		average=(totalmark/3.0);
		
    }	

	
	
	public void showDetails()
	{
		super.showDetails();
		System.out.println("Average="+average);
	}
}	