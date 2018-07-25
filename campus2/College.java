package com.lxisoft.campus2;

import com.lxisoft.campus2.stud.Student;
import com.lxisoft.campus2.stud.Admission;
import com.lxisoft.campus2.stud.MarkDetail;
import com.lxisoft.campus2.fac.Faculty;
import com.lxisoft.campus2.fac.FacultySal;
import java.util.*;


public class College
{
	public void college()
	{
		System.out.println("COLLEGE PORTAL");
		Faculty fc = new Faculty();
		MarkDetail ad = new MarkDetail();
		FacultySal fs = new FacultySal();
		
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
						int c1 = sc.nextInt();
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
									fs.salary();
									
									System.out.println("Faculty name : "+ fc.getname());
									System.out.println("Faculty id : " + fc.getfacid());
									
									
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
						int c2 = sc.nextInt();
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
									fs.salary();
									
								break;
								
								case 2:
									System.out.println("enter details of Student:");
									ad.printmarks();
								
								break;
								
								default: System.out.println("invalid!!");
								break;
						}
					default: System.out.println("invalid!!");
								break;
				}
				break;
						
						
		case 2: Scanner s2 = new Scanner(System.in);
		System.out.println("mechanical"); 
					System.out.println("which batch..? \n 1.Batch 1 \n2.Batch 2  ");
					int m = sc.nextInt();
					switch(m)
				{
				case 1: System.out.println("entered into Batch 1");
						
						System.out.println("choose 1.Faculty 2.Student");
						int m1 = sc.nextInt();
						switch(m1)
						{
								case 1: 
									System.out.println("enter the details of Faculty");
						
									System.out.println("enter the faculty name:");
									String name = s2.nextLine();
									fc.setname(name);
						
						
						
									System.out.println("enter the faculty id:");
									String facid = s2.nextLine();
									fc.setfacid(facid);
									
									System.out.println("Faculty name : "+ fc.getname());
									System.out.println("Faculty id : " + fc.getfacid());
									fs.salary();
									
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
						int m2 = sc.nextInt();
						switch(m2)
						{
								case 1: 
									System.out.println("enter the details of Faculty");
						
									System.out.println("enter the faculty name:");
									String name = s2.nextLine();
									fc.setname(name);
						
						
						
									System.out.println("enter the faculty id:");
									String facid = s2.nextLine();
									fc.setfacid(facid);
									
									System.out.println("Faculty name : "+ fc.getname());
									System.out.println("Faculty id : " + fc.getfacid());
									fs.salary();
									
								break;
								
								case 2:
									System.out.println("enter details of Student:");
									ad.printmarks();
								
								break;
								
						}
					default: System.out.println("invalid!!");
								break;
				
		
	
			
	
		}
		
	}
	}

}