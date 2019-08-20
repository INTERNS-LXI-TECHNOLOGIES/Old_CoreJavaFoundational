import java.util.Scanner;
public class Student
{
	int rollno;
	String name;
	Scanner sc=new Scanner(System.in);

	void setStudentDetails()
	{
	System.out.println("Enter roll no:	");
	rollno=sc.nextInt();
	System.out.println("Enter name: ");
	name=sc.next();

	}

	void getStudentDetails()
	{   
		
		System.out.println("Rollno:	"+rollno);
		System.out.println("Name:	"+name);
	}
}