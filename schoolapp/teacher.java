import java.util.Scanner;
public class teacher {

  String trname;

Scanner sc=new Scanner(System.in);
   public void setdetails()
{
    System.out.println("Enter the name of teacher: ");
	 trname=sc.nextLine();		
  }
public void printdetails()
{	
	System.out.println("name of teacher is: "+trname);
}}  
   
 