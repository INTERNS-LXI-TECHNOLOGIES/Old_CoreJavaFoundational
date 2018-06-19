import java.io.*;
import java.util.Random;
public class Lion extends Animal
{
	public Lion(int id)
	
	{
		name="Lion"+String.valueOf(id);
		Random ran=new Random();
		strength=ran.nextInt(10);
		hunger=ran.nextInt(10);
		reach=ran.nextInt(5);
		//roamcheck();
		carnivorous=true;
		findloc();
	}
		public void roamcheck()
	{
		if((strength>5)&&(hunger>6))
		{
			fight();	
		}
	}
	
}