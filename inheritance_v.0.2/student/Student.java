package com.lxisoft.inheritance.student;
//import java.util.*;
public class Student
{
	
	 
	//int option;
	int sum;
	int avg;
	private String studentName;
	private int admnNo;
	private int slotA;
	private int slotB;
	private int slotC;
	private int slotD;
	private int slotE;
	private int slotF;
	public void setName(String studentName1)
	{  
	   this.studentName=studentName1;
		
	}
	public void setAdmn(int admnNo1)
	{
		this.admnNo=admnNo1;
	}
	public String getName()
	{
		return this.studentName;
	}
	public int getAdmn()
	{
		return this.admnNo;
	}
	public void setMarkA(int slotA1)
	{  
	   this.slotA=slotA1;
		
	}
public void setMarkB(int slotB1)
	{  
	   this.slotB=slotB1;
		
	}
public void setMarkC(int slotC1)
	{  
	   this.slotC=slotC1;
		
	}
	public void setMarkD(int slotD1)
	{  
	   this.slotD=slotD1;
		
	}
	public void setMarkE	(int slotE1)
	{  
	   this.slotE=slotE1;
		
	}
	public void setMarkF(int slotF1)
	{  
	   this.slotF=slotF1;
		
	}
	public int  getsum()
	{
		
		sum=this.slotA+this.slotB+this.slotC+this.slotD+this.slotE+this.slotF;
		return sum;
	}
	public int  getavg()
	{
		avg=sum/6;
		return avg;
	}
		
	
}