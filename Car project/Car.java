import java.util.*;
public class Car
{

	String brandName;
	String modelName;
	String regNo;
	string mfd;
	Tyre tyres[]= new Tyre[4];
	Door doors[]= new Door[4];
	
	public void getDetails()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Barand Name of the Car:");
		brandName=in.next();
		System.out.print("Enter the Model Name : ");
		modelName=in.next();
		System.out.print("Enter the Reg.No of the Vechile : ");
		regNo=in.next();
		System.out.print("Enter the Manufacture Date of the Vechile : ");
		mfd=in.next();
		for(int i=0;i<4;i++)
		{
			tyres[i]=new Tyre();
		}
		for(int i=0;i<4;i++)
		{
			doors[i]=new Door();
		}

	}

	public void printDetails() 
	{  
		for(int i=0;i<4;i++)
		{
			doors[i].getDoor();
		}
        for(int i=0;i<4;i++)
        {
        	tyres[i].getTyre();
        }
        System.out.println("\nDetails Of The Car");
		System.out.println("Brand Name:"+brandName+"\nModel Name:"+modelName+
			"\nRegistration No."+regNo+"\nManufacture Date of the Vehicle : "+mfd);
        for(int i=0;i<4;i++)
		{
			System.out.print("\nManufacturing date of door "+(i+1)+":");
			doors[i].printDoor();
		}
        for(int i=0;i<4;i++)
        {
        	System.out.print("\nDetails of the Tyre"+(i+1));
        	tyres[i].printTyre();
        }
      }

}
