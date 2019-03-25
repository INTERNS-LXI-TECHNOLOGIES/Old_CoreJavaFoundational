import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
public class Tdd{
public static void main(String[] args){
	Forest f=new Forest();
	f.Initialisation();
	//f.lion.setStrength(6);
	//f.fox.setStrength(5);
	Scanner scan=new Scanner(System.in);
	
		ArrayList<Animal> a=f.getAl();
		System.out.println("enter the strength of lion:");
		a.get(0).setStrength(scan.nextInt());
		System.out.println("enter the strength of fox:");
		a.get(1).setStrength(scan.nextInt());
		System.out.println("enter the strength of elephant:");
		a.get(2).setStrength(scan.nextInt());
		System.out.println("enter the strength of tiger:");
		a.get(3).setStrength(scan.nextInt());
		System.out.println("enter the strength of panther:");
		a.get(4).setStrength(scan.nextInt());
		f.Fight();
}
}