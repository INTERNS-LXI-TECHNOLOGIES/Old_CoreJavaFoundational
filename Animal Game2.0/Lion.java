import java.io.*;
import java.util.Random;
	public class Lion extends Carnivorousanimal
{
	public Lion(int id)
	
	{
		name="Lion"+String.valueOf(id);
		Random ran=new Random();
		hunger=ran.nextInt(10);
		strength=ran.nextInt(10);
		reach=ran.nextInt(2);
		//roamcheck();
		//carnivorous=true;
		findloc();
	}
		
	
}
