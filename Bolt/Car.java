import java.util.Scanner;
public class Car
{
	String name;
	int price;

	Scanner scan=new Scanner(System.in);
	Tyre tyre1=new Tyre();
	Tyre tyre2=new Tyre();
	Tyre tyre3=new Tyre();
	Tyre tyre4=new Tyre();
	
	Door door1=new Door();
	Door door2=new Door();
	Door door3=new Door();
	Door door4=new Door();
	
	public void enterCarDetails()
		{
            System.out.println("enter the name of the Car");
			name=scan.next();
			System.out.println("enter the price of the Car");
			price=scan.nextInt();
			
	
	
	
	tyre1.enterTyreDetails();
	tyre2.enterTyreDetails();
	tyre3.enterTyreDetails();
	tyre4.enterTyreDetails();
	
	door1.enterDoorDetails();
	door2.enterDoorDetails();
	door3.enterDoorDetails();
	door4.enterDoorDetails();
	
	
		}
		
  
  
    public void printCarDetails()
		{
		    System.out.println("car Details");
			System.out.println(".............");
			System.out.println("name of the car="+name);
			System.out.println("price of the car="+price);
			
			
			
			
	tyre1.printTyreDetails();
	tyre2.printTyreDetails();
	tyre3.printTyreDetails();
	tyre4.printTyreDetails();
	
	door1.printDoorDetails();
	door2.printDoorDetails();
	door3.printDoorDetails();
	door4.printDoorDetails();
	
		}
		
		
		
	
	

		
}