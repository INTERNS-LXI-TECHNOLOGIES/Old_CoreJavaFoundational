import java.util.Scanner;
import java.lang.Math;
public class Tdd{
public static void main(String[] args){
	Forest f=new Forest();
	//f.lion.setStrength(6);
	//f.fox.setStrength(5);
	Scanner scan=new Scanner(System.in);
	
	
		f.lion.setStrength((int)(Math.random() * 10));
		f.lion.setHunger((int)(Math.random() * 10));
		f.fox.setStrength((int)(Math.random() * 10));
		f.fox.setHunger((int)(Math.random() * 10));
		f.rabbit.setStrength((int)(Math.random() * 10));
		f.rabbit.setHunger((int)(Math.random() * 10));
		f.elephant.setStrength((int)(Math.random() * 10));
		f.elephant.setHunger((int)(Math.random() * 10));
		f.deer.setStrength((int)(Math.random() * 10));
		f.deer.setHunger((int)(Math.random() * 10));
		f.Fight();
}
}