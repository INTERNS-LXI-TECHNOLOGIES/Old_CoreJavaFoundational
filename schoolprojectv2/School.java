import java.util.Scanner;
public class School
{
String schoolname;
String schoolplace;

Classroom class1=new Classroom();
public void scan()
{

Scanner s=new Scanner(System.in);
System.out.println("enter school name");
schoolname=s.nextLine();
System.out.println("enter school place");
schoolplace=s.nextLine();
class1.scan();
}

public void print()
{
	System.out.println("school name="+schoolname);
	System.out.println("school place="+schoolplace);
	class1.print();
}

}