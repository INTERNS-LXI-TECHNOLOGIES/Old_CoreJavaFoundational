import java.util.Scanner;
public class Door
{
String technology;

Scanner scan=new Scanner(System.in);

public void setDoorDetails()
{

System.out.println("Which technology is used in the door");
technology=scan.next();

}

public void printDoorDetails()
{

System.out.println("The technology used in the door :"+technology);

}
}