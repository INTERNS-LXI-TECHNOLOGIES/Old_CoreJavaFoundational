import java.util.Scanner;
public class Subject
{
	String subjectName;
	int mark;
	public void scan()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter subject name");
		subjectName=s.next();
		System.out.println("enter mark obtained");
		mark=s.nextInt();
		
	}
	public void print()
	{
		System.out.println("mark in "+subjectName+" is "+mark);
	}
}