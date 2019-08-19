import java.util.Scanner;
public class school

{
	int i;
	String schoolname;
	String place;
	classroom classes[]=new classroom[2];
	
	public void setdetails()
{
	
	Scanner sc=new Scanner(System.in);
	System.out.println("enter school name");
	schoolname=sc.nextLine();
	
	System.out.println("enter school place");
	place=sc.nextLine();
	for(i=0;i<2;i++)
	{
	classes[i]=new classroom();
	classes[i].setdetails();
	}
}
public void printdetails()
{
	System.out.println(" name of the school is "+schoolname);
	System.out.println("situated in "+place);
	
	for(i=0;i<2;i++)
	{
	classes[i].printdetails();
    }

}
}
