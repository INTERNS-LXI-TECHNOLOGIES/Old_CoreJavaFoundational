import java.util.Scanner;
public class Door
{
String colour;
int size;
Scanner scan=new Scanner(System.in);

public void enterDoorDetails()
{
System.out.println("enter the colour of the door");
colour=scan.next();
System.out.println("enter the size of the door");
size=scan.nextInt();
}

public void printDoorDetails()
{
System.out.println(" DOOR DETAILS ");
System.out.println("................");
System.out.println("colour of the door="+colour);
System.out.println("size of the door="+size);
}
}