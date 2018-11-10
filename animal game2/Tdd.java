import java.util.Scanner;
public class Tdd{
public static void main(String[] args){
	Forest f=new Forest();
	//f.lion.setStrength(6);
	//f.fox.setStrength(5);
	Scanner scan=new Scanner(System.in);
	
		System.out.println("enter the strength and huger of lion:");
		f.lion.setStrength(scan.nextInt());
		f.lion.setHunger(scan.nextInt());
		System.out.println("enter the strength and huger of fox:");
		f.fox.setStrength(scan.nextInt());
		f.fox.setHunger(scan.nextInt());
		System.out.println("enter the strength and huger of rabbit:");
		f.rabbit.setStrength(scan.nextInt());
		f.rabbit.setHunger(scan.nextInt());
		System.out.println("enter the strength and huger of elephant:");
		f.elephant.setStrength(scan.nextInt());
		f.elephant.setHunger(scan.nextInt());
		System.out.println("enter the strength and huger of deer:");
		f.deer.setStrength(scan.nextInt());
		f.deer.setHunger(scan.nextInt());
		f.Fight();
}
}