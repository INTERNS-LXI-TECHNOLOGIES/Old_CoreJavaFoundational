package com.lxisoft.markEntry.campus.student;
import java.util.Scanner;

public class StudentmarkEntry
{
StudentEntry se[]=new StudentEntry[100];
Scanner s=new Scanner(System.in);	

public void markEntry()
{

System.out.println("enter the no of student");
int id=s.nextInt();
       for(int i=0;i<id;i++)
	   {
	    se[i]=new StudentEntry();
        
		se[i].entry();
		System.out.println("enter the marks for subject 1");
		int id1=s.nextInt();
		System.out.println("enter the marks for subject 2");
		int id2=s.nextInt();
		System.out.println("enter the marks for subject 3");
		int id3=s.nextInt();
		System.out.println("enter the marks for subject 4");
		int id4=s.nextInt();
		System.out.println("enter the marks for subject 5");
		int id5=s.nextInt();
		System.out.println("enter the marks for subject 6");
		int id6=s.nextInt();
		int id7;
		id7=(id1+id2+id3+id4+id5+id6)/6;
		System.out.println("average=" + id7);
		
       }
} 
}