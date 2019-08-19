import java.util.Scanner; 
public class teacher{

String trname;

public void setdetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter teachers name"); 
	trname=sc.nextLine();
} 
	
public void printdetails()
{
	System.out.println(" name of the teacher is "+trname);
}	
	
}