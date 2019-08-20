import java.util.Scanner;
public class School
{
	String schoolName;
	String place;
	Classroom[] classes;	
	public void setDetails()
	{	
		int lt;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter school name");
		schoolName=sc.nextLine();	
		System.out.println("enter school place");
		place=sc.nextLine();		
		System.out.println("enter the classes");
		lt=sc.nextInt();
		classes=new Classroom[lt];
		
		for(int i=0;i<lt;i++)
		{
			classes[i]=new Classroom();
			classes[i].setDetails();
		}
	}

	public void printDetails()
	{
		int lt;
		lt=classes.length;
		System.out.println(" name of the school is "+schoolName);
		System.out.println("situated in "+place);	
		for(int i=0;i<lt;i++)
		{	
			classes[i].printDetails();
		}
	}
}