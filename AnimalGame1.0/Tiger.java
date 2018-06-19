import java.io.*;
import java.util.Random;
public class Tiger extends Animal
{
	public Tiger(int id)
	
	{
		name="Tiger"+String.valueOf(id);
		Random ran=new Random();
		strength=ran.nextInt(10);
		hunger=ran.nextInt(10);
		reach=ran.nextInt(4);
		carnivorous=true;
		//roamcheck();
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