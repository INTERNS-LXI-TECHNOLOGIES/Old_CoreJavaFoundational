
import java.util.Scanner;

public class Tyre
{
	int id;
	
	double size;
	String company;
	
	String mfd;
	String expd;
	
	Tyre(){}
	
	Tyre(int sno , double sz , String company , String mfd , String expd)
	{
		this.id = sno;
		this.size = size;
		this.company = company;
		this.mfd = mfd;
		this.expd = expd;
	}
	
	public void printDetails()
	{
			System.out.print(" Tyre Sno : " + this.id);
			System.out.print(" Size : " + this.size);
			System.out.print(" Company : " + this.company);
			System.out.print(" MFD : " + this.mfd);
			System.out.println(" Expire Date : " + this.expd);
	}
	
	public void getDetails(int id)
	{
		this.id = id;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n\tEnter Tyre " + id + " Details");
		System.out.print("\tCompany Name:");
		this.company = scan.next();
		System.out.print("\n\tSize:");
		this.size = scan.nextInt();
		System.out.print("\n\tManufacturing Date:");
		this.mfd = scan.next();
		System.out.print("\n\tExpiring Date:");
		this.expd = scan.next();
		
		
	}
}
