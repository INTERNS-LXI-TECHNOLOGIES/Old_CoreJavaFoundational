 import java.util.Scanner;
 public class School
{
	String schoolName;
	String location;
	Classroom []classes;
	Scanner sc=new Scanner(System.in);

public void setDetails()

{
	
	System.out.println("Enter the school name: ");
	schoolName=sc.nextLine();
    System.out.println("Enter the school location: ");
    location=sc.nextLine();
    System.out.println("Enter the number of classroom: ");
    int n=sc.nextInt();
	classes =new Classroom[n];
    System.out.println("Number of classroom: "+n);
 for(int i=0;i<n;i++)
	{
		classes[i]=new Classroom();
		classes[i].setDetails();
}
}
public void printDetails()
{
	
	System.out.println("school name is: "+schoolName);
	System.out.println("school location is: "+location);
	int n=classes.length;
	for(int i=0;i<n;i++)
	{
		classes[i].printDetails();
}
}
}