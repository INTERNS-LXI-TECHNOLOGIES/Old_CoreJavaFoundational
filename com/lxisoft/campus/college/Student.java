package com.lxisoft.campus.college;
import java.util.*;
public class Student extends Person
{
	private String sname;
	private int rno;
	private int tot_mark;
	private double avg;
	public Student(String sname,int rno)
	{
		super(sname,rno);
		studMark();
	}
	public void studMark()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the mark of first student:");
		int m1=sc.nextInt();
		System.out.println("Enter the mark of second student:");
		int m2=sc.nextInt();
		System.out.println("Enter the mark of third student:");
		int m3=sc.nextInt();
		tot_mark=m1+m2+m3;
		avg=tot_mark/3.0;
	}
	public void studDetails()
	{
		super.studDetails();
		System.out.println("Total Mark:"+tot_mark);
		System.out.println("Average Mark:"+avg);
	}
}