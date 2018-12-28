import java.util.Scanner;
public class Car
{

String name,colour;
int price;
Scanner scan=new Scanner(System.in);
	public void setCarDetails(int i)
	{
		i++;
	System.out.println("enter the "+i+"car name");
	name=scan.next();
	System.out.println("enter the "+" car colour");
	colour=scan.next();
	System.out.println("enter the price of the "+" car");
	price=scan.nextInt();
	
	}
	
	
	public void printCarDetails(int i)
	{
		i++;
		System.out.println("DETAILS OF THE"+i+" CAR");
		System.out.println("...................");
	System.out.println("name of the car="+name);
	System.out.println("colour of the car="+colour);
	System.out.println("price of the Car="+price);
	
	}


}