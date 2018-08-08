import java.io.*;
import java.util.*;
public class Tiger extends CarnivorousAnimal
{
	Random ran=new Random();
	public Tiger(int id)
	{
		name="Tiger"+String.valueOf(id);
		strength=ran.nextInt(10);
		reach=ran.nextInt(2);
		hunger=ran.nextInt(10);
		findloc();
		
		
	}
	
	
}