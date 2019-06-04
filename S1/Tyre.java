import java.util.*;
import java.io.*;
class Tyre
{ 
  int a[]=new int[10];
  String b[]=new String[10];
  Scanner in = new Scanner (System.in);
  BufferedReader input = new BufferedReader(new InputStreamReader (System.in));
  public void displayTyre()
  {
 	System.out.println("PRICE & BRAND\n"+"Tyre1:\n\tRs."+a[0]+"\n\tBrand:"+b[1]+"\nTyre2:\n\tRs."+a[1]+"\n\tBrand:"+b[2]+"\nTyre3:\n\tRs."+a[2]+"\n\tBrand:"+b[3]+"\nTyre4:\n\tRs."+a[3]+"\n\tBrand:"+b[4]+"\n");
  }
  public void readBrand()
  { int j;
  	for(j=1;j<=4;j++)
  	{
  		System.out.println("Enter the "+(j)+"st tyre brand:");
		try{
			b[j]=input.readLine();
		}
		catch(IOException e)
		{}
  	}
  }
public void readPrice()
{  int i;
  for(i=0;i<4;i++)
   { 
   	 System.out.println("enter the tyre "+(i+1)+" price:");
   	  a[i] = in.nextInt();
   }
}
  public int totalPrice()
  {int b;
  	b=a[0]+a[1]+a[2]+a[3]+a[4];
  	return b;
  }

}