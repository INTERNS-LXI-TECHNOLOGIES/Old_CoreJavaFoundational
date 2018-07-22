package com.lxisoft.campusv3.student;
import java.util.Scanner;
public class StudentMarks
{
	StudentEntry se[]=new StudentEntry[100];
	Student st=new Student();
	Scanner sm=new Scanner(System.in);
	public void markEntry()
	{
		System.out.println("Enter the number of students");
		int id=sm.nextInt();
		int i;
		for(i=1;i<=id;i++)
		{
			se[i]=new StudentEntry();
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the name: ");
			String name=sc1.next();
			st.setname(name);
			Scanner sc2=new Scanner(System.in);
			System.out.println("Enter the address: ");
			String address=sc2.next();
			st.setaddress(address);
			System.out.println("\nEnter the mark of subject 1:");
			int sm1=sm.nextInt();
			System.out.println("\nEnter the mark of subject 2:");
			int sm2=sm.nextInt();
			System.out.println("\nEnter the mark of subject 3:");
			int sm3=sm.nextInt();
			System.out.println("\nEnter the mark of subject 4:");
			int sm4=sm.nextInt();
			System.out.println("\nEnter the mark of subject 5:");
			int sm5=sm.nextInt();
			System.out.println("\nEnter the mark of subject 6:");
			int sm6=sm.nextInt();
			int avg;
			avg=(sm1+sm2+sm3+sm4+sm5+sm6)/6;
			System.out.println("Student name is:"+st.getname());
			System.out.println("Student address is:"+st.getaddress());
			System.out.println("Average mark of student:"+avg);
				
		}
	}
}