import java.util.*;
public class Student
{
	String sname;
	int rno;
	public Student(String sname,int rno)
	{
		this.sname=sname;
		this.rno=rno;
	}
	void studDetails()
	{
		System.out.println("Name of Student:"+sname);
		System.out.println("Rollno of Student:"+rno);
	}
}