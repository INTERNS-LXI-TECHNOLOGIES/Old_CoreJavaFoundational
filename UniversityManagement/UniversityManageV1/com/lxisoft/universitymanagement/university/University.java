package com.lxisoft.universitymanagement.university;
import java.util.Scanner;
import com.lxisoft.universitymanagement.clearscreen.Cls;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class University
{
	private enum Course{MECHANICAL,ELECTRICAL,ELECTRONICS,AUTOMOBILE,COMPUTER,MECHATRONICS,CIVIL}
	private File collegeFile =new File("F:/WorkSpace/Team1/UniversityManagement/UniversityManageV1/com/lxisoft/universitymanagement/database/college.txt");
	private File studentFile =new File("F:/WorkSpace/Team1/UniversityManagement/UniversityManageV1/com/lxisoft/universitymanagement/database/student.txt");
	private File facultyFile =new File("F:/WorkSpace/Team1/UniversityManagement/UniversityManageV1/com/lxisoft/universitymanagement/database/faculty.txt");
	
	
	public void printMainMenu()
	{
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{}
		Cls.clear();
		System.out.println("--------------------------------------------------Kerala Technological University-----------------------------------------------------\n");
		System.out.println("-------------------------------------------------------------Menu---------------------------------------------------------------------\n");
		System.out.println("-----------1.Registration-----------2.Login------------3.Courses------------4.Examination-----------5.Inquiry---------6.Exit----------");
		System.out.print("Choose an option: ");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		doMainChoice(choice);
	}
	
	public void doMainChoice(int choice)
	{
		System.out.print("You chose  ");
		switch(choice)
		{
			case 1:System.out.println("Registration\n"); registration(); break;
			case 2:System.out.println("Login\n"); login(); break;
			case 3:System.out.println("Courses\n"); printCourses(); break;
			case 4:System.out.println("Examination\n"); examination(); break;
			case 5:System.out.println("Inquiry\n"); inquiry(); break;
			case 6:System.exit(0);
			default:System.out.println("a wrong option\n"); break;
		}
	}
	
	public void registration()
	{
		System.out.println("1.College Registration\n2.Student Registration\n3.Faculty Registration");
		System.out.print("Choose an option : ");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		System.out.print("You chose  ");
		switch(choice)
		{
			case 1:System.out.println("College Registration\n");collegeReg();break;
			case 2:System.out.println("Student Registration\n");studentReg();break;
			case 3:System.out.println("Faculty Registration\n");facultyReg();break;
			default:System.out.println("a wrong option\n"); break;
		}
	}
	
	public void collegeReg()
	{
		System.out.println("Registering a new college to the university");
		System.out.print("Enter college name : ");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		writeToFile(collegeFile,name);
	}
	
	public void studentReg()
	{
		System.out.println("Registering a new student");
		System.out.print("Enter student name : ");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.print("Enter the name of college : ");
		String college=in.nextLine();
		System.out.print("Enter the department name : ");
		String dept=in.nextLine();
		writeToFile(studentFile,name+'|'+college+'|'+dept);
	}
	
	public void facultyReg()
	{
		System.out.println("Registering a new faculty");
		System.out.print("Enter faculty name : ");
		Scanner in=new Scanner(System.in);
		String name=in.nextLine();
		System.out.print("Enter the name of college : ");
		String college=in.nextLine();
		System.out.print("Enter the department name : ");
		String dept=in.nextLine();
		System.out.print("Enter the subject codes(Separated by ',') : ");
		String subjects=in.nextLine();
		writeToFile(facultyFile,name+'|'+college+'|'+dept+'|'+subjects);
	}
	
	public void writeToFile(File file,String content)
	{
		try
		{
			BufferedWriter bw =new BufferedWriter(new FileWriter(file,true));
			bw.write(content);
			bw.newLine();
			bw.close();
		}
		catch(IOException e)
		{
			System.out.println("Error writing to file");
		}
	}
	
	public void login()
	{
		System.out.println("1.College login\n2.Student login");
		System.out.print("Choose an option : ");
		Scanner in=new Scanner(System.in);
	}
	
	public void printCourses()
	{
		for(Course c:Course.values())
		{
			System.out.println(c);
		}
		System.out.print("Press ENTER to continue");
		try
		{
			char ch=(char)System.in.read();
		}
		catch(IOException e)
		{}
	}
	
	public void examination()
	{
		System.out.println("1.Examination Notification\n2.Examination results");
	}
	
	public void inquiry()
	{
		System.out.println("1.College Details\n2.Student Details\n3.Faculty Details");
		System.out.print("Choose an option : ");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		switch(choice)
		{
			case 1:collegeDetails(); break;
			case 2:studentDetails(); break;
			case 3:facultyDetails(); break;
			default:System.out.println("a wrong option\n"); break;
		}
	}
	
	public void collegeDetails()
	{
		try
		{
			FileReader fr=new FileReader(collegeFile);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine()) != null) 
			{
                System.out.println(line);				
            }  
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
		finally
		{
			System.out.print("Press ENTER to continue");
			try
			{
				char ch=(char)System.in.read();
			}
			catch(IOException e)
			{
		
			}
		}
	}
	
	public void  studentDetails()
	{
		try
		{
			Scanner scan=new Scanner(studentFile);
			while(scan.hasNextLine())
			{
				System.out.println();
				String line=scan.nextLine();
				for(int i=0;i<line.length();i++)
				{
					if(line.charAt(i)=='|')
					{
						System.out.println();
					}
					else
					{
						System.out.print(line.charAt(i));
					}
				}
				System.out.println("\n______________________________________");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		finally
		{
			System.out.print("Press ENTER to continue");
			try
			{
				char ch=(char)System.in.read();
			}
			catch(IOException e)
			{
		
			}
		}
	}
	
	public void facultyDetails()
	{
		try
		{
			Scanner scan=new Scanner(facultyFile);
			while(scan.hasNextLine())
			{
				System.out.println();
				String line=scan.nextLine();
				for(int i=0;i<line.length();i++)
				{
					if(line.charAt(i)=='|')
					{
						System.out.println();
					}
					else
					{
						System.out.print(line.charAt(i));
					}
				}
				System.out.println("\n_______________________________________");
			}
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
		finally
		{
			System.out.print("Press ENTER to continue");
			try
			{
				char ch=(char)System.in.read();
			}
			catch(IOException e)
			{
		
			}
		}
	}
}