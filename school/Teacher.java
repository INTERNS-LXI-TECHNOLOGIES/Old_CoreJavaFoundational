import java.util.Scanner;

public class Teacher
{
	String teacherName;
	String subject;
	Scanner sc=new Scanner(System.in);
public void setDetails()
{

	System.out.println("Enter teacher name : ");
	teacherName=sc.nextLine();
	System.out.println("Enter the handling subject : ");
	subject=sc.nextLine();


}
public void printDetails()
{

	System.out.println("Teacher name is : "+teacherName);
	System.out.println("handling subject is : "+subject);
	System.out.println("\n");
}
}