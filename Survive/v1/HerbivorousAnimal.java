import java.io.*;
import java.util.Random;
public class Lion extends Animal
{
	public Lion(int id)
	{
		name="Lion"+String.valueOf(id);
		Random ran=new Random();
		strength=ran.nextInt(10);
		reach=ran.nextInt(2);
		hunger=ran.nextInt(10);
		carnivorous=true;
		findloc();
		
	
	}
	public void roamCheck()
	{
		
		if((strength>5)&&(hunger>6))
		{
			fight();
		}			
		
	}
	
	
}