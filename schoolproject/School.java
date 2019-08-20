import java.util.Scanner;
public class School
{ 
	String schoolName;
	String schoolPlace;
	Classroom[] classes;
	public void scan()
	{
		int i,c;	
		Scanner s=new Scanner(System.in);
		System.out.println("enter school name");
		schoolName=s.nextLine();
		System.out.println("enter school place");
		schoolPlace=s.nextLine();
		System.out.println("enter number of classes");
		c=s.nextInt();
		classes=new Classroom[c];
		
		for(i=0;i<c;i++)
		{
			classes[i]=new Classroom();
			classes[i].scan();
		}
	}
	public void print()
	{
		int i,c;
		c=classes.length;
		System.out.println("\n");
		System.out.println("school "+schoolName+" is located in "+schoolPlace);
		for(i=0;i<c;i++)
		{
			classes[i].print();
		}
	}

}