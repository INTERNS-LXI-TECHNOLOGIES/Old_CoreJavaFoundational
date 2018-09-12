import java.util.Scanner;
public class Tyre
 {
	
	String brandName;
	String mfd;
	String position;
	
	Tyre(){}
	Tyre(String brandName,String mfd,String position)
	{
	 this.position=position;
	 this.brandName=brandName;
	 this.mfd=mfd;
	}
	public void printDetails()
	{
	System.out.println("Tyre Position:" + this.position);
	System.out.println("Brand Name:" + this.brandName);
	System.out.println("mfd:" + this.mfd);
	System.out.println(" ");
	}	
	public void getDetails()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Tyre Position");
		this.position = scan.next();
		System.out.println("Type the Brandname:");
		this.brandName = scan.next();
		System.out.println("Type the MFD:");
		this.mfd = scan.next();
		
	}

 }
