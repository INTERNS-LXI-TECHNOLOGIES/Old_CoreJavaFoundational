import java.io.*;
import java.util.Random;
public class Deer extends  Herbivorousanimal
{
		public Deer(int id)
	
	{
		name="Deer"+String.valueOf(id);
		Random ran=new Random();
		strength=0;
		hunger=ran.nextInt(10);
		//reach=ran.nextInt(4);
		//carnivorous=false;
		findloc();
	}
}