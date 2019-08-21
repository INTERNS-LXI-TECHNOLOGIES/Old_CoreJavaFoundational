import java.util.Scanner;
public class Classroom
{
	String division;
	Student []students;
	Teacher teacher;
	Scanner sc=new Scanner(System.in);
public void setDetails()
{
	System.out.println(" Enter the class and division: ");
	division=sc.nextLine();
	System.out.println("Enter the number of students: ");
	int n=sc.nextInt();
	students=new Student[n];
	System.out.println(" Number of students: "+n);
	teacher=new Teacher();
	teacher.setDetails();
	for(int i=0;i<n;i++)
	{
		students[i]=new Student();
		students[i].setDetails();
	}
}
public void printDetails()
{
	int n=students.length;
	System.out.println("class and division is :"+division);
	teacher.printDetails();
	for(int i=0;i<n;i++)
	{	
		students[i].printDetails();
	}
	}
}