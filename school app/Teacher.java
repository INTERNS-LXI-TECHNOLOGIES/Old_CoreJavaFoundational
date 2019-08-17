import java.util.Scanner; 

public class Teacher{
	String trname;

public void scan()
{
	Scanner i=new Scanner(System.in);
	System.out.println("enter teachers name"); 
	trname=i.nextLine();
} 
	
	public void print()
{
	System.out.println(" name of the teacher is "+trname);
}	
	
}