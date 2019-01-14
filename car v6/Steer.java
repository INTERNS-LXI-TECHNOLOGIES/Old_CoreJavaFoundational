import java.util.Scanner;
public class Steer
{
String name;
int price;
Scanner s=new Scanner(System.in);
public void setDetails()
{
System.out.println("name of steer");
name=s.nextLine();
System.out.println("price");
price=s.nextInt();
}
public void printDetails()
{
System.out.println("steer name:"+name);
System.out.println("price:"+price);
}
}