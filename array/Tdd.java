import java.util.Scanner;
public class Tdd
{
	
	public static void main(String args[])
	{
		
		int i;
          Scanner scan=new Scanner(System.in);
		  System.out.println("enter the limit of an array");
		  int limit=scan.nextInt();	  
		  
		  Car[] cars=new Car[limit];
		  
		  
		  for (i=0;i<limit;i++)
		  {
		  cars [i]= new Car();
		  }
		  
		  
		  for(i=0;i<limit;i++)
		  {
		  cars[i].setCarDetails(i);
		  }
		  
		  for(i=0;i<limit;i++)
		  {
		  cars[i].printCarDetails(i);
		  }
     }
}
