
import java.util.Scanner;

public class Car
{
	
	int id;
	
	String company;
	String brand;
	String model;
	String color;
	
	Tyre[] tyre = new Tyre[4];
	Door[] door = new Door[4];
	Stearing stearing;
	
	String mfd;
	
	Car(){}
	
	Car(int sno , String company , String brand , String model , String color)
	{
		this.id = sno;
		this.company = company;
		this.brand = brand;
		this.model = model;
		this.color = color;
	}
	
	public void setMFD(String mfd)
	{
		this.mfd = mfd;
	}
	
	public void fixDoor(Door[] d)
	{
		int i = 0;
		
		while(i < 4)
		{
			this.door[i] = d[i];
			i++;
		}		
	}
	
	public void fixTyre(Tyre[] t)
	{
		int i = 0;
		
		while(i < 4)
		{
			this.tyre[i] = t[i];
			i++;
		}
	}  
	
	public void fixStearing(Stearing s)
	{
		this.stearing = s;
	}              
	
	public void setDetails(int id)
	{
		this.id = id;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("\n\tEnter Car " + id + " Details");
		System.out.print("\tCompany Name:");
		this.company = scan.next();
		System.out.print("\n\tBrand Name:");
		this.brand = scan.next();
		System.out.print("\n\tModel No:");
		this.model = scan.next();
		System.out.print("\n\tColor:");
		this.color = scan.next();
		
		
		for(int i = 0; i < 4;i++)
		{
			this.door[i] = new Door();
			this.door[i].getDetails(i+1);
		}
		
		for(int i = 0; i < 4;i++)
		{
			this.tyre[i] = new Tyre();
			this.tyre[i].getDetails(i+1);
		}
		
		this.stearing = new Stearing();
		this.stearing.getDetails(1);
		
		
		
	}
	
	public void printDetails()
	{
		System.out.println("\n---------------------------Car Details-------------------------");
		System.out.println(" Car serial no : " + this.id);
		System.out.println(" Company : " + this.company);
		System.out.println(" Brand : " + this.brand);
		System.out.println(" Model : " + this.model);
		System.out.println(" Color : " + this.color);
		
	
		for(int i = 0;i<4;i++) this.door[i].printDetails();
		for(int i = 0;i<4;i++) this.tyre[i].printDetails();
	}
}
