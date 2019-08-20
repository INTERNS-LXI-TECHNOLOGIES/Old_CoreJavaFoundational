import java.util.Scanner;

public class Teacher
{
String trname;
String sub;
Scanner sc=new Scanner(System.in);
public void setdetails()
{

System.out.println("Enter teacher name : ");
 trname=sc.nextLine();
System.out.println("Enter the handling subject : ");
sub=sc.nextLine();


}
public void printdetails()
{

System.out.println("Teacher name is : "+trname);
System.out.println("handling subject is : "+sub);
}
}