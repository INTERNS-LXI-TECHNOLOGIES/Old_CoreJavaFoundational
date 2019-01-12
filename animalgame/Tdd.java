import java.util.Scanner;
import java.lang.math;
public class Tdd
{
	public static void main(String args[])
	{
		Forest f = new Forest();
		f.initialisation();
		Scanner Scan=new Scanner(System.in);
		for(int i=0;i<4;i++)
		{
			f.a[i].setStrength((int)(Math.random() *10));
		}
		f.fight();

	}
}