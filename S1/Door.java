import java.util.Scanner;
class Door
{
  int a[]=new int[10];
  Scanner in = new Scanner (System.in);
  
   public void readPrice()

	{
		int i;
	    for(i=1;i<5;i++)
			{
			  System.out.println("enter "+i+"st Door price:");
			  a[i]=in.nextInt();
			}
	}
  
  public void displayDoor()
   {
    	 System.out.println("PRICE:\n"+"Door1:"+a[1]+"\nDoor2:"+a[2]+"\nDoor3:"+a[3]+"\nDoor4:"+a[4]);

    }
    public int doorPrice()
    {
    	int p; 
    	p=a[1]+a[2]+a[3]+a[4];
    	return p;
    }
  
}