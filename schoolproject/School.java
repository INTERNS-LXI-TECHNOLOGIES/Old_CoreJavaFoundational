 import java.util.Scanner;
 public class School
{
String schoolname;
String location;
int i,n;
Classroom classes[] =new Classroom[5];
Scanner sc=new Scanner(System.in);

public void setdetails()

{
	
	System.out.println("Enter the school name: ");
	 schoolname=sc.nextLine();
    System.out.println("Enter the school location: ");
 location=sc.nextLine();
 System.out.println("Enter the number of classroom: ");
 n=sc.nextInt();
 System.out.println("Number of classroom: "+n);
 for(i=0;i<n;i++)
	{
		classes[i]=new Classroom();
		classes[i].setdetails();
}
}
public void printdetails()
{
	
	System.out.println("school name is: "+schoolname);
	System.out.println("school location is: "+location);
	for(i=0;i<n;i++)
	{
		classes[i].printdetails();
}
}
}