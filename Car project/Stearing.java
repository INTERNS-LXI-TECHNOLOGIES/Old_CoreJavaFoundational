import java.util.Scanner;
public class Stearing
{
	double radius;
	String brandName;
	String color;
	
	Stearing(){}
	
	Stearing(double radius,String brandname,String color)
	{
		this.radius=radius;
		this.brandName=brandname;
		this.color=color;
	}
	
	public void printDetails()
	{
	 System.out.println("radius:" +this.radius);
	 System.out.println("brandname:" +this.brandName);
	 System.out.println("color:" +this.color);
	 System.out.println(" ");
	 
	}
	public void getDetails()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Stearing details");
		System.out.println("Type the Radius");
		this.radius = scan.nextDouble();
		System.out.println("Type the Brandname:");
		this.brandName = scan.next();
		System.out.println("Type the color:");
		this.color = scan.next();
	}
	 
}
