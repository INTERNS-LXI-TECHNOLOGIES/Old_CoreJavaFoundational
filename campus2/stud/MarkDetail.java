package com.lxisoft.campus2.stud;
import java.util.*;

public class MarkDetail
{
Admission ad[] = new Admission[100];
Scanner n = new Scanner(System.in);

public void printmarks()
{

System.out.println("Number of Students: ");
int id = n.nextInt();
       for(int i=0;i<id;i++)
	   {
	    ad[i]=new Admission();
        
		st[i].show();
		System.out.println("subject 1 marks:");
		int m1=n.nextInt();
		System.out.println("subject 2 marks:");
		int m2=n.nextInt();
		System.out.println("subject 3 marks:");
		int m3=n.nextInt();
		System.out.println("subject 4 marks:");
		int m4=n.nextInt();
		System.out.println("subject 5 marks:");
		int m5=n.nextInt();
		int avg;
		avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("average marks=" +avg);
		
}
}
}