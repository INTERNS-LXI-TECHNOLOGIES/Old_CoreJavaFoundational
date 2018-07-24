package com.lxisoft.campus2;

import com.lxisoft.campus2.stud.Student.java;
import com.lxisoft.campus2.stud.Admission.java;
import com.lxisoft.campus2.stud.MarkDetail.java;
import java.util.*;


public class College
{
	public void college()
	{
		System.out.println("COLLEGE PORTAL");
		Faculty fc = new Faculty();
		Student sd = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("which department..? \n1.CSE \n2.EEE");
		int choice = sc.nextInt();
		switch(choice)
		{
		
			case 1: Scanner s = new Scanner(System.in);
					System.out.println("computer science"); 
					System.out.println("which batch..? \n 1.Batch 1 \n2.Batch 2  ");
					int c = sc.nextInt();
					switch(c)
				{
				case 1: System.out.println("entered into Batch 1");
						
						System.out.println("choose 1.Faculty 2.Student");
						int c1 = sc.nextint();
						switch(c1)
						{
								case 1: 
									System.out.println("enter the details of Faculty");
						
									System.out.println("enter the faculty name:");
									String name = s.nextLine();
									fc.setname(name);
						
						
						
									System.out.println("enter the faculty id:");
									String facid = s.nextLine();
									fc.setfacid(facid);
									
									System.out.println("Faculty name : "+ fc.getname());
									System.out.println("Faculty id : " + fc.getfacid());
									fc.salary();
									
								break;
								
								case 2:
									System.out.println("enter details of Student:");
									ad.printmarks();
								
								break;
								
								default: System.out.println("invalid!!");
								break;
						}
							
				break;
			
				case 2: System.out.println("entered into Batch 2");
						
						System.out.println("choose 1.Faculty 2.Student");
						int c2 = sc.nextint();
						switch(c2)
						{
								case 1: 
									System.out.println("enter the details of Faculty");
						
									System.out.println("enter the faculty name:");
									String name = s.nextLine();
									fc.setname(name);
						
						
						
									System.out.println("enter the faculty id:");
									String facid = s.nextLine();
									fc.setfacid(facid);
									
									System.out.println("Faculty name : "+ fc.getname());
									System.out.println("Faculty id : " + fc.getfacid());
									fc.salary();
									
								break;
								
								case 2:
									System.out.println("enter details of Student:");
									ad.printmarks();
								
								break;
								
								default: System.out.println("invalid!!");
								break;
						}
							
				break;
						
						
		case 2: 
		System.out.println("mechanical"); 
					System.out.println("which batch..? \n 1.Batch 1 \n2.Batch 2  ");
					int m = sc.nextInt();
					switch(m)
				{
				case 1: System.out.println("entered into Batch 1");
						
						System.out.println("choose 1.Faculty 2.Student");
						int m1 = sc.nextint();
						switch(m1)
						{
								case 1: 
									System.out.println("enter the details of Faculty");
						
									System.out.println("enter the faculty name:");
									String name = s.nextLine();
									fc.setname(name);
						
						
						
									System.out.println("enter the faculty id:");
									String facid = s.nextLine();
									fc.setfacid(facid);
									
									System.out.println("Faculty name : "+ fc.getname());
									System.out.println("Faculty id : " + fc.getfacid());
									fc.salary();
									
								break;
								
								case 2:
									System.out.println("enter details of Student:");
									ad.printmarks();
								
								break;
								
								default: System.out.println("invalid!!");
								break;
						}
							
				break;
			
				case 2: System.out.println("entered into Batch 2");
						
						System.out.println("choose 1.Faculty 2.Student");
						int m2 = sc.nextint();
						switch(m2)
						{
								case 1: 
									System.out.println("enter the details of Faculty");
						
									System.out.println("enter the faculty name:");
									String name = s.nextLine();
									fc.setname(name);
						
						
						
									System.out.println("enter the faculty id:");
									String facid = s.nextLine();
									fc.setfacid(facid);
									
									System.out.println("Faculty name : "+ fc.getname());
									System.out.println("Faculty id : " + fc.getfacid());
									fc.salary();
									
								break;
								
								case 2:
									System.out.println("enter details of Student:");
									ad.printmarks();
								
								break;
								
								default: System.out.println("invalid!!");
								break;
						}
		 
				
		
	
			
	
		}
		
	}
	}
	}
}