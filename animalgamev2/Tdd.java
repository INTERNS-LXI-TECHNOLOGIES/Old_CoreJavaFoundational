import java.util.Scanner;
public class Tdd
{
	public static void main(String args[])
	{
		Forest f = new Forest();
		Scanner Scan=new Scanner(System.in);
		f.Initialisation();
		f.Init();
		for(int i=0;i<4;i++)
		{
		System.out.println("Enter the Strength of Animal:" +i);
		f.l[i].setStrength(Scan.nextInt());
		f.t[i].setStrength(Scan.nextInt());
	    }
		f.Fight();
	}
}