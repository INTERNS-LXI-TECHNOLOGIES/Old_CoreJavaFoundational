package com.lxisoft.campus2.stud;
import java.util.*;

public class MarkDetail
{
public void printmarks()
{

System.out.println("Number of Students: ");
int id = n.nextInt();
       for(int i=0;i<id;i++)
	   {
	    st[i]=new StudentEntry();
        
		st[i].show();
		System.out.println("subject 1 marks:");
		int m1=s.nextInt();
		System.out.println("subject 2 marks:");
		int m2=s.nextInt();
		System.out.println("subject 3 marks:");
		int m3=s.nextInt();
		System.out.println("subject 4 marks:");
		int m4=s.nextInt();
		System.out.println("subject 5 marks:");
		int m5=s.nextInt();
		int avg;
		avg=(m1+m2+m3+m4+m5)/5;
		System.out.println("average marks=" +avg);
		
}
}
}