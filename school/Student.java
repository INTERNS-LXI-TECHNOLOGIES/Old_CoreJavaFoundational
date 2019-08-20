import java.util.Scanner;
public class Student
{
int id;
String stname;
Scanner sc=new Scanner(System.in);

public void setdetails()
{

System.out.println(" Enter the student name : ");
stname=sc.nextLine();
System.out.println(" Enter the roll number : ");
 id=sc.nextInt();
}
public void printdetails()
{
System.out.println("roll number is :"+id);
System.out.println("student name is :"+stname);
}
}