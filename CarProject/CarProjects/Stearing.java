import java.util.Scanner;

public class Stearing
{
	int id;
	
	double radius;
	String company;
 	String type;
	
	Stearing(){}
	
	Stearing(int sno , double radius , String company ,  String type)
	{
		this.id = sno;
		this.radius = radius;
		this.type = type;
		this.company = company;
	}
	
	public void printDetails()
	{
		System.out.println(" Stearing Sno : " + this.id);
		System.out.println(" Radius : " + this.radius);
		System.out.println(" Company : " + this.company);
		System.out.println(" Type : " + this.type);	
	}
	
	public void getDetails(int id)
	{
		this.id = id;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\tEnter Stearing " + id + " Details");
		System.out.print("\tCompany Name:");
		this.company = scan.next();
		System.out.print("\n\tType:");
		this.type = scan.next();
		System.out.print("\n\tRadius:");
		this.radius  = scan.nextInt();
		
		
	}

}
