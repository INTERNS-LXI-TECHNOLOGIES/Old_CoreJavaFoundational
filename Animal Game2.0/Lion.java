import java.io.*;
import java.util.Random;
	public class Lion extends Carnivorousanimal
{
	public Lion(int id)
	
	{
		name="Lion"+String.valueOf(id);
		Random ran=new Random();
		
		
		reach=ran.nextInt(5);
		roamcheck();
		//carnivorous=true;
		findloc();
	}
		public void roamcheck()
	{
		for(strength=ran.nextInt(10);(strength>5);strength--)
		{
			
			fight();	
	}
	}
	
}
