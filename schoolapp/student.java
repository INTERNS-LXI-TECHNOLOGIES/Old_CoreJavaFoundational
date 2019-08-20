import java.util.Scanner; 
public class Student
{
	String studentName;
	public void setDetails()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student name");
		studentName=sc.nextLine();
	}
	public void printDetails()
	{
		System.out.println(" student name is "+studentName);
	}
}