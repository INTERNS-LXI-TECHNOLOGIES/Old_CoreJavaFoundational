import java.util.Scanner;
public class Tdd{
public static void main(String[] args){
	Forest f=new Forest();
	//f.lion.setStrength(6);
	//f.fox.setStrength(5);
	Scanner scan=new Scanner(System.in);
	f.Initialisation();
	for(int i=0;i<4;i++)
	{
		System.out.println("enter the strength of animal:" +i);
		f.l[i].setStrength(scan.nextInt());
	}
		f.Fight();
}
}