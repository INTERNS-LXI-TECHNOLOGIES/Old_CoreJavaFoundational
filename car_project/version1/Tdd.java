import java.util.Scanner;
public class Tdd
{
public static void main(String args[])
{
	
Car car1=new Car();
Car car2=new Car();
Car car3=new Car();

Scanner scan=new Scanner(System.in);

System.out.println("enter the name of the 1st car"); 
car1.name=scan.next();
System.out.println("enter the colour of 1st car");
car1.colour=scan.next();

System.out.println("enter the name of the 2nd car");
car2.name=scan.next();
System.out.println("enter the colour of the 2nd car");
car2.colour=scan.next();

System.out.println("enter the name of 3rd car");
car3.name=scan.next();
System.out.println("enter the colour of 3rd car");
car3.colour=scan.next();


System.out.println(" the 1st car detials");
System.out.println("......................");

System.out.println("1st car name="+car1.name);
System.out.println("1st car colour="+car1.colour);

System.out.println(" the 2nd car detials");
System.out.println("......................");

System.out.println("2nd car name="+car2.name);
System.out.println("2nd car colour="+car2.colour);

System.out.println(" the 3rd car detials");
System.out.println(".........................");

System.out.println("3rd car name="+car3.name);
System.out.println("3rd car colour="+car3.colour);




}
}