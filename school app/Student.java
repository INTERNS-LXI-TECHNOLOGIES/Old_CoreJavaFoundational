import java.util.Scanner; 

public class Student
{
	String stName;
	int rNo;

	public void scan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		stName=sc.nextLine();
		System.out.println("enter student rollno");
		rNo=sc.nextInt();
	}

	public void print()
	{
		System.out.println(" rollno of the student is "+rNo+" and name is "+stName);
	}
}