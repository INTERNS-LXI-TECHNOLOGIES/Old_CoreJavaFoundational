import java.util.Scanner;
public class Tyre
{
String name;
int size;

Scanner scan =new Scanner(System.in);

public void setTyreDetails()
{

System.out.println("Enter the brand name of the tyre");
name=scan.next();
System.out.println("Enter the size of the tyre");
size=scan.nextInt();

}


public void printTyreDetails()
{

System.out.println("Brand name of the tyre :"+name);
System.out.println("Size of the tyre :"+size);

}
}
