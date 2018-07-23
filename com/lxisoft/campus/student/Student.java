package com.lxisoft.campus.student;
import com.lxisoft.campus.college.*;
import java.util.*;
public class Student extends Person
{
	private int tot_mark;
	private double avg;
	
	public Student(String studname,String idno,int age)
	{
		
		super(studname,idno,age);
		setMark();
	}	
	
		public void setMark()
		{
				Scanner Scan=new Scanner(System.in);
				
				
					System.out.print("Mark:");
					int mark1=Scan.nextInt();
					int mark2=Scan.nextInt();
					int mark3=Scan.nextInt();
					this.tot_mark=mark1+mark2+mark3;
					this.avg=tot_mark/3.0;
				
		}
		public void display()
		{
			System.out.print("\t");
			super.display();
			System.out.println(this.tot_mark+"\t"+this.avg);
			
		}
			

}	
	
	
	
	