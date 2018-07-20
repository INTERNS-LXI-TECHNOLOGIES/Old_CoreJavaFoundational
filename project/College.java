package com.lxisoft.project;
import com.lxisoft.project.student.Student;
import java.util.*;


public class College
{
	public static void main(String args[])
	{
		System.out.println("Student Portal");
		Student sd = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("which department..? \n1.CSE \n2.EEE");
		int choice = sc.nextInt();
		Scanner s = new Scanner(System.in);
		switch(choice)
		{
		
			case 1: 
					System.out.println("computer science"); 
					System.out.println("which batch..? \n 1.Batch 1 \n2.Batch 2  ");
					int c = sc.nextInt();
					switch(c)
				{
				case 1: System.out.println("entered into Batch 1");
						System.out.println("enter the details of Student");
						
						System.out.println("enter the student name:");
						String name = s.nextLine();
						sd.setname(name);
						
						
						
						System.out.println("enter the admission id:");
						String adm = s.nextLine();
						sd.setadm(adm);
						
						System.out.println("Student name : "+ sd.getname());
						System.out.println("admission id : " + sd.getadm());
						
			
				break;
			
				case 2: System.out.println("entered into Batch 2");
						System.out.println("enter the details of Student");
						
						System.out.println("enter the student name:");
						name = s.nextLine();
						sd.setname(name);
						
						
						System.out.println("enter the admission id:");
						 adm = s.nextLine();
						sd.setadm(adm);
						
						System.out.println("Student name : "+ sd.getname());
						System.out.println("admission id : " + sd.getadm());
				break;
				
				
				
				}
				
				break;
						
						
		case 2: System.out.println("mechanical"); 
					System.out.println("which batch..? \n 1.Batch 1 \n2.Batch 2  ");
					int ch = sc.nextInt();
					switch(ch)
				{
				case 1: 
						System.out.println("entered into Batch 1");
						System.out.println("enter the details of Student");
						
						System.out.println("enter the student name:");
						String name = s.nextLine();
						sd.setname(name);
						
						System.out.println("enter the admission id:");
						String adm = s.nextLine();
						sd.setadm(adm);
						
						System.out.println("Student name : "+ sd.getname());
						System.out.println("admission id : " + sd.getadm());
						
			
				break;
			
			case 2: System.out.println("entered into Batch 2");
						System.out.println("enter the details of Student");
						
						System.out.println("enter the student name:");
					    name = s.nextLine();
						sd.setname(name);
						
						System.out.println("enter the admission id:");
						adm = s.nextLine();
						sd.setadm(adm);
						
						System.out.println("Student name : "+ sd.getname());
						System.out.println("admission id : " + sd.getadm());
			
				break;
				}
				
			default:System.out.println("invalid!!");
				break;
		 
				
		
	
			
	
		}
		
}
}