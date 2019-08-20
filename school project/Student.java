import java.util.Scanner;
public class Student
{
	Scanner word=new Scanner(System.in);
	String name;
	Integer rollno;

	void getDetails()
	{

		System.out.println("enter the student name");
		name=word.nextLine();
		System.out.println("enter the student roll no");
		rollno=word.nextInt();
	}
	void printDetails()
	{
		System.out.println(name);
		System.out.println(rollno);
	}
}
