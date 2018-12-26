import java.util.Scanner;
public class Tyre
{
	String name,colour;
    int size;
	Scanner scan=new Scanner(System.in);
	
	     Bolt bolt1=new Bolt();
		 Bolt bolt2=new Bolt();
		 Bolt bolt3=new Bolt();
		 Bolt bolt4=new Bolt();
	public void enterTyreDetails()
		{
		System.out.println("enter the tyre name");
		name=scan.next();
		System.out.println("enter the tyre colour");
		colour=scan.next();
		System.out.println("enter the Tyre size");
		size=scan.nextInt();
		
		bolt1.enterBoltDetails();
		bolt2.enterBoltDetails();
		bolt3.enterBoltDetails();
		bolt4.enterBoltDetails();
		
		
		}
		
	public void printTyreDetails()
	    {
		System.out.println("Tyre details");
		System.out.println("..............");
		System.out.println("name of the tyre="+name);
		System.out.println("colour of the tyre="+colour);
		System.out.println("size of the tyre="+size);

		bolt1.printBoltDetails();
		bolt2.printBoltDetails();
		bolt3.printBoltDetails();
		bolt4.printBoltDetails();
		}

}