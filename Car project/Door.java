import java.util.Scanner;
public class Door
{
    String company;
	String color;
	String mfd;
	String position;
	
	Door(){}
	
	Door(String company,String color,String mfd,String position)
	{
	this.position=position;	
	this.company=company;
	this.color=color;
	this.mfd=mfd;
	}
	
	public void printDetails()
	{
	System.out.println("Position:" +this.position);
	System.out.println("Company name:" +this.company);
	System.out.println("Color:" +this.color);
	System.out.println("mfd:" +this.mfd);
	System.out.println(" ");
	}
	public void getDetails()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Door Position");
		this.position = scan.next();
		System.out.println("Type the company:");
		this.company = scan.next();
		System.out.println("Type the color:");
		this.color = scan.next();
		System.out.println("Type the MFD:");
		this.mfd = scan.next();
	}
}	
