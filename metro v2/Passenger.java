import java.util.Scanner;
public class Passenger
{
	String passname,gender;
	String aadharno,age,gen;
	int noOfTick;
	Scanner scan=new Scanner(System.in);
public void setDetails()
	{
	System.out.print("Passenger Name:");
	passname=scan.nextLine();
	System.out.print("Gender:");
	gender=scan.nextLine();
	System.out.print("Age:");
	age=scan.nextLine();

	System.out.print("Aaadhar Number:");
	aadharno=scan.nextLine();

	}
}