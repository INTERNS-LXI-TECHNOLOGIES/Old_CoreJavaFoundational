import java.util.Scanner;
public class school
{
String schoolname;
String place;
classroom class1 =new classroom();
classroom class2 =new classroom();
Scanner sc=new Scanner(System.in);
public void setdetails()
{
	System.out.println("Enter the school name: ");
	schoolname=sc.nextLine();
    System.out.println("Enter the school place: ");
	place=sc.nextLine();
 class1.setdetails();
 class2.setdetails();
}
public void printdetails()
	{
System.out.println("school name is: "+schoolname);
System.out.println("school place  is: "+place);

 class1.printdetails();
 class2.printdetails();
}

}