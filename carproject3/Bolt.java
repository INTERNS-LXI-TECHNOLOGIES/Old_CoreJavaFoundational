import java.util.Scanner;
public class Bolt
{
String shape;

Scanner scan=new Scanner(System.in);

public void setBoltDetails()
{
System.out.println("Enter the shape of the bolt");
shape=scan.next();
}

public void printBoltDetails()
{
System.out.println("Shape of the bolt :"+shape);
}
}