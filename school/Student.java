import java.util.Scanner;
public class Student
{
	int id;
	String studentName;
	Scanner sc=new Scanner(System.in);

public void setDetails()
{

	System.out.println(" Enter the student name : ");
	studentName=sc.nextLine();
	System.out.println(" Enter the roll number : ");
	id=sc.nextInt();
}
public void printDetails()
{
	System.out.println("roll number is :"+id);
	System.out.println("student name is :"+studentName);
}
}