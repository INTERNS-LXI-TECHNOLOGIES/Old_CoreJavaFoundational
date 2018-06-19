import java.io.*;
import java.util.Random;
public class Rabbit extends Animal
{
		public Rabbit(int id)
	
	{
		name="Rabbit"+String.valueOf(id);
		Random ran=new Random();
		strength=0;
		//reach=ran.nextInt(4);
		carnivorous=false;
		findloc();
	}
}