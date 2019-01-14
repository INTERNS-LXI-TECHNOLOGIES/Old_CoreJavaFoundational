import java.util.Scanner;
public class Door
{
String name;
int price;
Scanner s=new Scanner(System.in);
public void setDetails()
{
System.out.println("name of doors:");
name=s.nextLine();
System.out.println("price of doors:");
price=s.nextInt();
}
public void printDetails()
{
System.out.println("door name:"+name);
System.out.println("price:"+price);
}
}
