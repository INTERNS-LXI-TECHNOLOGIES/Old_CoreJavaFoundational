import java.util.Scanner;
public class Car
{
String name;
String color;
int price;
Tyre tyre;

Scanner scan=new Scanner(System.in);
Tyre tyre1=new Tyre();

public void setCarDetails(){
	

System.out.println("Enter the name of the car");
name=scan.next();
System.out.println("Enter the color of the car");
color=scan.next();
System.out.println("Enter the price of thr car");
price=scan.nextInt();

tyre1.setTyreDetails();

}

public void printCarDetails(){


System.out.println("CAR DETAILS");
System.out.println("***********");	
System.out.println("Name of the car :"+name);
System.out.println("Color of the car :"+color);
System.out.println("Price of the car :"+price);

tyre1.printTyreDetails();

}
}