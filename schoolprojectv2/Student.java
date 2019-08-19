import java.util.Scanner;
public class Student
{
int rollno;
String name;
public void scan()
{

Scanner s=new Scanner(System.in);

System.out.println("enter student name");
name=s.nextLine();
System.out.println("enter student roll no");
rollno=s.nextInt();
}

public void print()
{
	System.out.println("\n");
	System.out.println("rollno="+rollno);
	System.out.println("student name="+name);
}
}