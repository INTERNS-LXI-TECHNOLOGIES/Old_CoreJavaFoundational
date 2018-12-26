import java.util.Scanner;
public class Tyre
{
String name;
int size;
Bolt bolt;

Scanner scan =new Scanner(System.in);

Bolt bolt1=new Bolt();

public void setTyreDetails()
{

System.out.println("Enter the brand name of the tyre");
name=scan.next();
System.out.println("Enter the size of the tyre");
size=scan.nextInt();

bolt1.setBoltDetails();
}


public void printTyreDetails()
{

System.out.println("Brand name of the tyre :"+name);
System.out.println("Size of the tyre :"+size);

bolt1.printBoltDetails();
}
}
