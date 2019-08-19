import java.util.Scanner;
public class School
{
int i; 
String schoolname;
String schoolplace;
Classroom classes[]=new Classroom[2];
public void scan()
{

Scanner s=new Scanner(System.in);
System.out.println("enter school name");
schoolname=s.nextLine();
System.out.println("enter school place");
schoolplace=s.nextLine();
for(i=0;i<2;i++)
{
classes[i]=new Classroom();
classes[i].scan();
}
}
public void print()
{
	System.out.println("\n");
	System.out.println("school name="+schoolname);
	System.out.println("school place="+schoolplace);
	for(i=0;i<2;i++)
	{
	classes[i].print();
	}
}

}