package com.lxisoft.universitymanagement.university;
import java.util.Scanner;
import com.lxisoft.universitymanagement.clearscreen.Cls;
import com.lxisoft.universitymanagement.college.College;
import java.io.File;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import com.lxisoft.universitymanagement.departments.*;
import java.io.FileNotFoundException;


public class University
{
	private File collegeFile =new File("./com/lxisoft/universitymanagement/database/college.txt");
	private ArrayList<College> collegeList=new ArrayList<College>();
	private String[] courses={"Mechanical","Electrical","Electronics","Computer"};
	
	public University()
	{
		try
		{
			FileReader fr=new FileReader(collegeFile);
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine()) != null) 
			{
				String id="";
				String name="";
				ArrayList<Department> courses=new ArrayList<Department>();
                for(int i=0;i<line.length();i++)
				{
					while(line.charAt(i)!='|')
					{
						id+=line.charAt(i);
						i++;
					}
					i++;
					while(line.charAt(i)!='|')
					{
						name+=line.charAt(i);
						i++;
					}
					i++;
					while(line.charAt(i)!='|')
					{
						String temp="";
						while(line.charAt(i)!=',')
						{
							temp+=line.charAt(i);
							i++;
						}
						courses.add(createDept(temp));
						i++;
					}
				}
				College c=new College(id,name,courses);
				collegeList.add(c);
            }
		}
		catch(IOException e)
		{
			System.out.println("Error");
		}
	}
	
	public void waitForKey()
	{
		System.out.print("Press ENTER to continue");
		try
		{
			char ch=(char)System.in.read();
		}
		catch(IOException e)
		{}
	}
	
	public void printMainMenu()
	{
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
			case 6:System.out.println("to exit\n");System.exit(0);
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
		System.out.println("Enter (Y) if you offer the following course.");
		ArrayList<Department> crs=new ArrayList<Department>();
		String crsToFile="";
		for(String course:courses)
		{
			Department c=askFor(course);
			if(c!=null)
				crs.add(c);
			crsToFile+=course+',';
		}
		String uniqueID="KTUCOL"+collegeList.size();
		System.out.println("Registration successful\nYour unique ID is : "+uniqueID);
		College c=new College(uniqueID,name,crs);
		collegeList.add(c);
		writeToFile(collegeFile,uniqueID,name,crsToFile);
		waitForKey();
	}
	
	public Department askFor(String deptName)
	{
		System.out.println(deptName+"?");
		Scanner in=new Scanner(System.in);
		char c=in.nextLine().charAt(0);
		Department d;
		if(c=='Y'||c=='y')
		{
			d=createDept(deptName);
			return d;
		}
		else
			return null;
	}
	
	public Department createDept(String deptName)
	{
		Department d=null;
		switch(deptName)
			{
				case "Mechanical": d=new Mechanical();
				case "Electrical": d=new Electrical();
				case "Electronics": d=new Electronics();
				case "Computer": d=new Computer();
			}
		return d;
	}
	
	public void studentReg()
	{
		
	}
	
	public void facultyReg()
	{
		
	}
	
	public void writeToFile(File file,String... content)
	{
		try
		{
			BufferedWriter bw =new BufferedWriter(new FileWriter(file,true));
			for(String val:content)
			{
				bw.write(val);
				bw.write('|');
			}
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
		System.out.println("1.College login\n2.Student login\n3.faculty login");
		System.out.print("Choose an option : ");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		switch(choice)
		{
			case 1://collegeLogin(); break;
			case 2://studentLogin(); break;
			case 3://facultyLogin(); break;
			default:System.out.println("a wrong option\n"); break;
		}
	}
	
	public void collegelogin()
	{
		
	}
	
	public void studentLogin()
	{
		
	}
	
	public void facultylogin()
	{
		
	}
	
	public void printCourses()
	{
		for(String c:courses)
		{
			System.out.println(c);
		}
		waitForKey();
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
		for(College c:collegeList)
		{
			System.out.println(c+"\n____________________________");
		}
		waitForKey();
	}
	
	public void  studentDetails()
	{
		
	}
	
	public void facultyDetails()
	{
		
	}
}