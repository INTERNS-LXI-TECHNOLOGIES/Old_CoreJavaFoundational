import java.util.*;
public class Door
{
	String doorMfd;
	public void getDoor()
	{
		
		Scanner in=new Scanner(System.in);
			System.out.print("Enter the Manufacturing Date of Door : ");
			doorMfd=in.next();

		
	}
		public void printDoor()
		{
				
			System.out.println(doorMfd);
		
		}
	
}