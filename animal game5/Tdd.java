import java.util.Scanner;
import java.lang.Math;
public class Tdd{
public static void main(String[] args){
	Forest f=new Forest();
	f.Initialisation();
	//f.lion.setStrength(6);
	//f.fox.setStrength(5);
	Scanner scan=new Scanner(System.in);
	
	
		System.out.println("enter the strength of lion:");
		f.a[0].setStrength(scan.nextInt());
		System.out.println("enter the strength of fox:");
		f.a[1].setStrength(scan.nextInt());
		System.out.println("enter the strength of elephant:");
		f.a[2].setStrength(scan.nextInt());
		System.out.println("enter the strength of tiger:");
		f.a[3].setStrength(scan.nextInt());
		System.out.println("enter the strength of panther:");
		f.a[4].setStrength(scan.nextInt());
		f.Fight();
}
}