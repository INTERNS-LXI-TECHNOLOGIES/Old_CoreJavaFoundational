import java.util.Scanner;
public class Door{
	String name;
	String price;
		Scanner scan = new Scanner(System.in);
		public void setDetails()
		{
		System.out.println("Enter Door  Name");
		name = scan.nextLine();
		System.out.println("Enter Door Price");
		price = scan.nextLine();
		}
		public void display()
		{
		System.out.println(name+"  = "+price);
		}

}