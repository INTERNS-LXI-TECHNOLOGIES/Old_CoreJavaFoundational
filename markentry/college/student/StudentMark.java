package com.lxisoft.markentry.college.student;
import java.util.*;
public class StudentMark
{
	StudentDetails sd[]=new StudentDetails[100];
	Scanner sr=new Scanner(System.in);
	public void mark()
	{
		System.out.println("enter the no of student");
         int id=sr.nextInt();
       for(int i=0;i<id;i++)
	   {
	    sd[i]=new StudentDetails();
        
		sd[i].detail();
		System.out.println("enter the marks for subject 1");
		int id1=sr.nextInt();
		System.out.println("enter the marks for subject 2");
		int id2=sr.nextInt();
		System.out.println("enter the marks for subject 3");
		int id3=sr.nextInt();
		System.out.println("enter the marks for subject 4");
		int id4=sr.nextInt();
		System.out.println("enter the marks for subject 5");
		int id5=sr.nextInt();
		System.out.println("enter the marks for subject 6");
		int id6=sr.nextInt();
		int id7;
		id7=(id1+id2+id3+id4+id5+id6)/6;
		System.out.println("average=" + id7);
		
       }
    }

	

}