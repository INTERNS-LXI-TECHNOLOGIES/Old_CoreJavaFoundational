import java.util.Scanner;
public class Teacher
{

String name;
int id;
public void scan()
{	

Scanner s=new Scanner(System.in);
System.out.println("enter teacher name");
name=s.nextLine();
System.out.println("enter teacher id");
id=s.nextInt();

}

public void print()
{
	
	System.out.println("teacher id="+id);
	System.out.println("teacher name="+name);
}
}