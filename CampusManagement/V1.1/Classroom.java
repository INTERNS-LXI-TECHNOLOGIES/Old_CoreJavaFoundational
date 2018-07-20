import java.util.*;
public class Classroom
{
	String location;
	Faculty f;
	Student[] stud;
	public Classroom(String location)
	{
		this.location=location;
		createFac();
		createStudent();
	}
	void createFac()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the faculty Name:");
		String name=System.console().readLine();
		f=new Faculty(name);
	}
	void createStudent()
	{
		Scanner p=new Scanner(System.in);
		System.out.println("Enter the number of students:");
		int n=p.nextInt();
		stud=new Student[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of student:");
			String sname=System.console().readLine();
			System.out.println("Enter the Roll Number of student:");
			int rno=p.nextInt();
			stud[i]=new Student(sname,rno);
		}
		
	}
	void printDetails()
	{
		System.out.println("Location of Classroom:"+location);
		f.facDetails();
		for(int i=0;i<stud.length;i++)
		{
			stud[i].studDetails();
		}
	}
}