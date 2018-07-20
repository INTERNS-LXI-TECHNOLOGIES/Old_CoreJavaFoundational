package com.lxisoft.college.test;
import com.lxisoft.inheritance.faculty.Faculty;
import com.lxisoft.college.student.*;


import java.util.*;
public class TDD
{
	 public static void main(String args[])
	 {	 System.out.println("Welcome to college Registration");
		 Faculty f=new Faculty();
		 Student st=new Student();
		 
	     Scanner sc=new Scanner(System.in);
		 System.out.println("choose the department..\n1.Cse\n2.Ece\n");
		 int c1=sc.nextInt();
		switch(c1)
		{
			case 1:
			Scanner s=new Scanner(System.in);
			
			System.out.println("You are in Cse");
			System.out.println("choose your batch..\n1.First year\n2.Second year\n3.Third year\n");
			int c2=sc.nextInt();
			switch(c2)
			{
				case 1:
				
				System.out.println("you are First year");
				System.out.println("choose whether you are a student or faculty..\n1.Student\n2.Faculty\n");
				int c3=sc.nextInt();
				switch(c3)
				{
				 case 1:
					
					System.out.println("you are a student");
					st.detail();

					
					
				   break;
				   case 2:
				    System.out.println("you are a faculty");
					System.out.println("enter the details of the faculty");
				    System.out.println("enter the faculty name:");
				    String name=s.nextLine();
					f.setname(name);
				   
				   System.out.println("enter the faculty address:");
				   String address=s.nextLine();
				   f.setaddress(address);
				   
				   System.out.println("faculty name:"+f.getname());
		           System.out.println("faculty address:"+f.getaddress());
				   
					
					
				   break;
				}
				break;
				case 2:
				System.out.println("you are Second  year");
				System.out.println("choose whether you are a student or faculty..\n1.Student\n2.Faculty\n");
				int c4=sc.nextInt();
				switch(c4)
				{
				 case 1:
					
					System.out.println("you are a student");
				   break;
				   case 2:
					
					System.out.println("you are a faculty");
				
					System.out.println("enter the details of the faculty");
				    System.out.println("enter the faculty name:");
				    String name=s.nextLine();
					f.setname(name);
				   
				   System.out.println("enter the faculty address:");
				   String address=s.nextLine();
				   f.setaddress(address);
				   
				   System.out.println("faculty name:"+f.getname());
		           System.out.println("faculty address:"+f.getaddress());
				   break;
				}
				break;
				
				case 3:
				System.out.println("you are Third  year");
				System.out.println("choose whether you are a student or faculty..\n1.Student\n2.Faculty\n");
				int c5=sc.nextInt();
				switch(c5)
				{
				 case 1:
					
					System.out.println("you are a student");
				   break;
				   case 2:
					
					System.out.println("you are a faculty");
					System.out.println("enter the details of the faculty");
				    System.out.println("enter the faculty name:");
				    String name=s.nextLine();
					f.setname(name);
				   
				   System.out.println("enter the faculty address:");
				   String address=s.nextLine();
				   f.setaddress(address);
				   
				   System.out.println("faculty name:"+f.getname());
		           System.out.println("faculty address:"+f.getaddress());
				   break;
				}
				break;
			}
			break;
				
			case 2:
			System.out.println("Ece");
			Scanner ss=new Scanner(System.in);
			System.out.println("choose your batch..\n1.First year\n2.Second year\n3.Third year\n");
			int c6=sc.nextInt();
				switch(c6)
			{
				case 1:
				
				System.out.println("you are First year");
				System.out.println("choose whether you are a student or faculty..\n1.Student\n2.Faculty\n");
				int c7=sc.nextInt();
				switch(c7)
				{
				 case 1:
					
					System.out.println("you are a student");
				   break;
				   case 2:
					
					System.out.println("you are a faculty");
									
					System.out.println("enter the details of the faculty");
				    System.out.println("enter the faculty name:");
				    String name=ss.nextLine();
					f.setname(name);
				   
				   System.out.println("enter the faculty address:");
				   String address=ss.nextLine();
				   f.setaddress(address);
				   
				   System.out.println("faculty name:"+f.getname());
		           System.out.println("faculty address:"+f.getaddress());
				   break;
				}
				break;
				case 2:
				System.out.println("you are Second  year");
				System.out.println("choose whether you are a student or faculty..\n1.Student\n2.Faculty\n");
				int c8=sc.nextInt();
				switch(c8)
				{
				 case 1:
					
					System.out.println("you are a student");
				   break;
				   case 2:
					
					System.out.println("you are a faculty");
									
					System.out.println("enter the details of the faculty");
				    System.out.println("enter the faculty name:");
				    String name=ss.nextLine();
					f.setname(name);
				   
				   System.out.println("enter the faculty address:");
				   String address=ss.nextLine();
				   f.setaddress(address);
				   
				   System.out.println("faculty name:"+f.getname());
		           System.out.println("faculty address:"+f.getaddress());
				   break;
				}
				break;
				case 3:
				System.out.println("you are Third  year");
				System.out.println("choose whether you are a student or faculty..\n1.Student\n2.Faculty\n");
				int c9=sc.nextInt();
				switch(c9)
				{
				 case 1:
					
					System.out.println("you are a student");
				   break;
				   case 2:
					
					System.out.println("you are a faculty");
									
					System.out.println("enter the details of the faculty");
				    System.out.println("enter the faculty name:");
				    String name=ss.nextLine();
					f.setname(name);
				   
				   System.out.println("enter the faculty address:");
				   String address=ss.nextLine();
				   f.setaddress(address);
				   
				   System.out.println("faculty name:"+f.getname());
		           System.out.println("faculty address:"+f.getaddress());
				   break;
				}
				break;
			}
			break;
			
		}
		
		
		 
	 }
}
		 
