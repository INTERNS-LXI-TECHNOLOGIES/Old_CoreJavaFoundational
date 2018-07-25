package com.lxisoft.campus2.stud;

import java.util.*;

public class MarkDetail
{
	
Admission ad[] = new Admission[100];
Scanner s1 = new Scanner(System.in);

public void printmarks()
	{  
  
System.out.println("Number of Students: ");
int id = s1.nextInt();
       for(int i=0;i<id;i++)
	   {
	    ad[i]=new Admission();
		ad[i].entry();
        
		
		System.out.println("subject 1 marks:");
		int m1=s1.nextInt();
		System.out.println("subject 2 marks:");
		int m2=s1.nextInt();
		System.out.println("subject 3 marks:");
		int m3=s1.nextInt();
		System.out.println("subject 4 marks:");
		int m4=s1.nextInt();
		System.out.println("subject 5 marks:");
		int m5=s1.nextInt();
		int avg;
		avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("average marks=" +avg);
		
}
}
}