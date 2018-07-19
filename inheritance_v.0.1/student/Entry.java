package com.lxisoft.inheritance.student;
import java.util.*;
import com.lxisoft.inheritance.student.Csestudent;
import com.lxisoft.inheritance.student.Mechstudent;
public class Entry
{
    public void studentEntry()
	{    
		Scanner in=new Scanner(System.in);
		Scanner init=new Scanner(System.in);
		//String nameInput;
		//int admnInput;
		System.out.println("enter the Number of Student");
		int studCount=in.nextInt();
	    Student[] s= new Student[studCount];
		System.out.println("---------------WELCOME TO STUDENT REGISTER PORTEL---------------");
		System.out.println("Enter the department to which student to ne added"+"\n 1::CSE"+"\n2:: MECH");
		int depSelection=init.nextInt();
		switch(depSelection)
		{
			case 1:
				for(int i=0;i<studCount;i++)
				
				{
					String csnameInput;
		            int csadmnInput;
					System.out.println("Student"+(i+1));
					System.out.println("Enter the Name::");
					csnameInput=new Scanner(System.in).next();
					s[i] = new Csestudent();
					s[i].setName(csnameInput);
					System.out.println("Enter the Admission Numer::");
					csadmnInput=in.nextInt();
					s[i].setAdmn(csadmnInput);
				}
				 break;
		    
			case 2:
				for(int i=0;i<studCount;i++)
				{
					String menameInput;
					int meadmnInput;
					System.out.println("Student"+(i+1));
					System.out.println("Enter the Name::");
					menameInput=new Scanner(System.in).next();
					s[i] = new Mechstudent();
					s[i].setName(menameInput);
					System.out.println("Enter the Admission Numer::");
					meadmnInput=in.nextInt();
					s[i].setAdmn(meadmnInput);
				}
				 break;
			default: System.out.println("Enter the  correct option");
			
		}
	
	     System.out.println("Enter The branch to be printed"+"\n 1:: COMPUTERSCIENCE"+"\n 2:: MECHANICA:");
		 int printSelection=init.nextInt();
		 Csestudent k=new Csestudent();
		 Mechstudent m=new Mechstudent();
			switch(printSelection)
				{
					case 1: 
					k.cseprint();
					break;
					case 2:
					m.mechprint();
					break;
					default: System.out.println("invalid selection");
				}
		 
	}
	
	
}