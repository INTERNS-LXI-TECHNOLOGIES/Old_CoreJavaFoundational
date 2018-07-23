import java.util.*;
public class College
{
	String name;
	String location;
	Department[] dep;
	public College()
	{
		colDetails();
		createDep();
	}
	void colDetails()
	{
		Scanner c=new Scanner(System.in);
		System.out.println("Enter the name of college:");
		name=System.console().readLine();
		System.out.println("Enter the location of College:");
		location=System.console().readLine();
	}
	void createDep()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Departments:");
		int n=sc.nextInt();
		dep=new Department[n];
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter the name of Department:");;
		String depname=System.console().readLine();
		dep[i]=new Department(depname);
		}
	}
	void printDetails()
	{
		System.out.println("Name of College:"+name);
		System.out.println("Location of College:"+location);
		for(int i=0;i<dep.length;i++)
		{
			dep[i].displayDetails();
		}
	}
}
	
	