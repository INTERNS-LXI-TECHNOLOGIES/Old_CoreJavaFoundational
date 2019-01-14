import java.util.Scanner;
public class Tire
{
String name;
int price;
Scanner s=new Scanner(System.in);
public void setDetails()
{
System.out.println("name of tires");
name=s.nextLine();
System.out.println("price of tires:");
price=s.nextInt();
}
public void printDetails()
{
System.out.println("tire name:"+name);
System.out.println("price:"+price);
}
}
