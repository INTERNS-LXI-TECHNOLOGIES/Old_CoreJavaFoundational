package com.lxisoft.program;
import java.util.*;

public class Marks
{
	int m1,m2,m3,m4,m5,m6;
	double avg;
	public void calculateAverage()
	{
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the mark of student in sub 1:");
		m1=in.nextInt();
		System.out.println("Enter the mark of student in sub 2:");
		m2=in.nextInt();
		System.out.println("Enter the mark of student in sub 3:");
		m3=in.nextInt();
		System.out.println("Enter the mark of student in sub 4:");
		m4=in.nextInt();
		System.out.println("Enter the mark of student in sub 5:");
		m5=in.nextInt();
		System.out.println("Enter the mark of student in sub 6:");
		m6=in.nextInt();

		avg=(m1+m2+m3+m4+m5+m6)/6;
		System.out.println("**************************************\n");
		
	}
	public double calcu()
	{
		return avg;
	}


}