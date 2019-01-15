import java.util.Scanner;
public class Passenger{
	Scanner scan = new Scanner(System.in);
	String name;
	String gender;
	String age;
	String adhaarNo;

public void passDetails(){
		System.out.print("Enter Name : ");
		name = scan.nextLine();
		System.out.print("Enter Age  : ");
		age = scan.nextLine();
		System.out.print("Enter Gender :");
		gender = scan.nextLine();
		System.out.print("Enter Adhaar No : ");
		adhaarNo = scan.nextLine();
}
public void passDisplay(){
		System.out.print("\nName      : "+name);
		System.out.print("\nAge       : "+age);
		System.out.print("\ngender    : "+gender);
		System.out.print("\nAdhaar No : "+adhaarNo);
		System.out.println("\n   Happy Journey!!!\n");
	
}

}