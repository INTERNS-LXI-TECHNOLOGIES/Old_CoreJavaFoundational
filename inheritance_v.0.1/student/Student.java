package com.lxisoft.inheritance.student;
import java.util.*;
public class Student
{
	
	 
	int option;
	private String studentName;
	private int admnNo;
	String aps;
	//Scanner choose=new Scanner(System.in);
	public void setName(String studentName1)
	{  
	    //System.out.println("*******test**********");
		this.studentName=studentName1;
		//System.out.println(studentName);
	}
	public void setAdmn(int admnNo1)
	{
		this.admnNo=admnNo1;
	}
	public String getName()
	{
		//System.out.println("*******test**********");
		//System.out.println(this.studentName); //EncapsInputStream  error is present
		//System.out.println("valueee"+aps);
		return this.studentName;
	}
	public int getAdmn()
	{
		return this.admnNo;
	}

}