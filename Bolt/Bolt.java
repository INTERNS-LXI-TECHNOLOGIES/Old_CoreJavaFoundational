import java.util.Scanner;
public class Bolt
{
	String colour;
	int size;
	Scanner scan=new Scanner(System.in);
	
	public void enterBoltDetails()
	{
	System.out.println("enter the colour of the bolt");
    colour=scan.next();
	System.out.println("enter the size of the bolt");
	size=scan.nextInt();
	}
	
	
	public void printBoltDetails()
	{
	System.out.println("BOLT DETAILS");
	System.out.println(".............");
	System.out.println("bolt colour="+colour);
	System.out.println("bolt size="+size);
	}
}