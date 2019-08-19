import java.util.Scanner;
public class student {
String studname;
Scanner sc=new Scanner(System.in);
public void setdetails()
{
    System.out.println("Enter the name of student: ");
     studname=sc.nextLine();
	
	}
public void printdetails()
{
	System.out.println("name is: "+studname);
	
}}