package com.lxisoft.inheritance.student;
import java.util.*;
import com.lxisoft.inheritance.student.Csestudent;
import com.lxisoft.inheritance.student.Mechstudent;
public class Entry
{
	 
    public void studentEntry()
	{	Student[] s;
		//Scanner in=new Scanner(System.in);
		Scanner init=new Scanner(System.in);
		//String nameInput;
		//int admnInput;
		System.out.println("ENTER THE NUMBER OF STUDENTS");
		int studCount=init.nextInt();
	    s= new Student[studCount];
		System.out.println("|----------------------------------------------------------------|");
		System.out.println("|---------------WELCOME TO STUDENT REGISTER PORTEL---------------|");
		System.out.println("|----------------------------------------------------------------|");
label1:System.out.println("CHOOSE THE OPTION"+"\n1>>>>COMPUTERSCIENCE<<<<"+"\n2>>>>MECHANICAL<<<<"+"\n>>>>INSERT MORE<<<<");
		int depSelection=init.nextInt
			switch(depSelection)
			{
				case 1:
					for(int i=0;i<studCount;i++)
	
					{
						String csnameInput;
						Scanner in=new Scanner(System.in);
						int csadmnInput;
						System.out.println("STUDENT NUMBER::"+(i+1));
						System.out.println("PLEASE ENTER THE NAME::");
						csnameInput=in.nextLine();
						//System.out.print(csnameInput);
						s[i] = new Csestudent();
						s[i].setName(csnameInput);
						System.out.println("ENTER THE ADMISSION NUMBER::");
						csadmnInput=in.nextInt();
						s[i].setAdmn(csadmnInput);
						//s[i].cseprint();
					}
					break;

				case 2:
					for(int i=0;i<studCount;i++)
					{
						String menameInput;
						Scanner in=new Scanner(System.in);
						int meadmnInput;
						System.out.println("STUDENT NUMBER"+(i+1));
						System.out.println("PLEASE ENTER THE NAME::");
						menameInput=in.nextLine();
						s[i] = new Mechstudent();
						s[i].setName(menameInput);
						System.out.println("ENTER THE ADMISSION NUMBER::");
						meadmnInput=in.nextInt();
						s[i].setAdmn(meadmnInput);
					}
						break;
				case 3:
						System.out.println("SELECT THE OPTION AGAIN");
						
			  
				default: System.out.println("!!!!!INVALID SELECTION!!!!!");

		}
			System.out.println("=====================THANK YOU=====================");
	     System.out.println("PLEASE SELECT THE BRANCH TO BE PRINTED"+"\n 1::::::COMPUTERSCIENCE::::::"+"\n 2::::::MECHANICAL::::::");
		 int printSelection=init.nextInt();

		for(int i=0;i<studCount;i++)
		{
			if(s[i] instanceof Csestudent && printSelection==1)
			{
				
				((Csestudent)s[i]).cseprint();
			}
			else if(s[i] instanceof Mechstudent && printSelection==2)
			{
				
				((Mechstudent)s[i]).mechprint();
	        }
		}

	}

}