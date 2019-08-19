import java.util.Scanner; 

public class student{
	String studname;
	

public void setdetails()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter student name");
	studname=sc.nextLine();
	}

public void printdetails()
{
	System.out.println(" student name is "+studname);
}
}