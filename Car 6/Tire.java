import java.util.Scanner;
public class Tire{
	String name;
	String price;
		Scanner scan = new Scanner(System.in);
		public void setDetails()
		{
		System.out.println("Enter Tire  Name");
		name = scan.nextLine();
		System.out.println("Enter Tire Price");
		price = scan.nextLine();
		}
		public void display()
		{
		System.out.println(name+"  = "+price);
		}
}