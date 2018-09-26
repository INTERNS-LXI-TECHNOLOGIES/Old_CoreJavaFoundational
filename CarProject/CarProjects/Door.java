
import java.util.Scanner;

public class Door
{
	int id;
	
	String color;
	String company;
	String type;
	
	Door(){}
	Door(int sno , String color , String company , String type)
	{
		this.id = sno;
		this.color = color;
		this.company = company;
		this.type = type;
	}
	
	public void printDetails()
	{
		System.out.print(" Door Sno : " + this.id);
		System.out.print(" Color : " + this.color);
		System.out.print(" Company : " + this.company);
		System.out.println(" MFD : " + this.type);	
	}
	
	public void getDetails(int id)
	{
		this.id = id;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\tEnter Door " + id + " Details");
		System.out.print("\tCompany Name:");
		this.company = scan.next();
		System.out.print("\n\tType:");
		this.type = scan.next();
		System.out.print("\n\tColor:");
		this.color = scan.next();
		
		
	}
}
