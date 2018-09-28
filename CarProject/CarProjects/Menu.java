
import java.util.Scanner;

public class Menu
{
	static Car a[] = new Car[20];
	
	static int i = 0;
	
	int opt;
	
	public void printMenu()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\n\t1.) Add Car Details");
		System.out.println("\n\t2.) View Car Details");
		System.out.println("\n\t3.) View All Car Details");
		System.out.println("\n\t4.) Exit");
		
		System.out.print("\n\tEnter your choice:");
		
		this.opt = scan.nextInt();
		
	}
	
	public void addCarDetails()
	{
		a[i] = new Car();
		a[i].setDetails(i+1);
		i++;
	}
	
	public int viewCarDetails(int serialNo)
	{
		int sno , j;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\tEnter car Serial No:");
		sno =	scan.nextInt();
		
		if(i == 0)
		{
			System.out.println("\n\tNo cars");
			return 0;
		}
		
		for(j = 0;j < i;j++)
		{
			if(sno == a[j].id)
			{
				a[j].printDetails();
	
			System.out.println("------------------------------------------------------------------"); 	
			}
		}
		
		if( j < (i-1))
		{
			System.out.print("\n\tCar Not Found");
		}
		
		return 1;
	}
	
	public int viewAllCarDetails()
	{	
		if(i == 0)
		{
			System.out.println("\n\tNo cars");
			return 0;
		}
		for(int j = 0;j < i;j++)
		{
			a[j].printDetails();
			System.out.println("------------------------------------------------------------------"); 	
		}
		
		return 1;
	}
	
}