package com.lxisoft.campus2.stud;
import java.util.Scanner;
public class Admission
{
Scanner sc=new Scanner(System.in);	
Student st=new Student();
public void entry()
{

System.out.println("enter total entry of student");
int id=sc.nextInt();
if(id>100)
{
System.out.println("no more admission");}
else
{System.out.println("The details of Student:");
                            Scanner sc1=new Scanner(System.in);
					        System.out.println("Enter student name:");
							String name=sc1.next();
							st.setname(name);
							Scanner sc2=new Scanner(System.in);
							 System.out.println("Enter admission number:");
						   String adm=sc2.next();
							st.setadm(adm);
							System.out.println("Name of Student:"+st.getname());
							System.out.println("admission number:"+st.getaddress());

}

}
} 