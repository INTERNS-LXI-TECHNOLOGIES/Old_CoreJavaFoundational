import java.io.*;
import java.util.Random;
public class Deer extends Animal
{
		public Deer(int id)
	
	{
		name="Deer"+String.valueOf(id);
		Random ran=new Random();
		strength=0;
		//reach=ran.nextInt(4);
		carnivorous=false;
		findloc();
	}
}