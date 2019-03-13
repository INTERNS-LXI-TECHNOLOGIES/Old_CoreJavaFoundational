import java.util.*;
public class Tyre
{
	String tyreName;
	String tyreSize;
	public void getTyre()
	{
		int i;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter the Tyre Name: ");
		tyreName=in.next();
		System.out.print("Enter the Size of the Tyre: ");
		tyreSize=in.next();
		
	}
	public void printTyre()
	{
	
		
		System.out.println(tyreName+"  "+tyreSize);
			
	}
}