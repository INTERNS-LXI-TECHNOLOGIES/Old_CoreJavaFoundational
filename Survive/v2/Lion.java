import java.io.*;
import java.util.*;
public class Lion extends CarnivorousAnimal
{
	Random ran=new Random();
	public Lion(int id)
	{
		name="Lion"+String.valueOf(id);
		strength=ran.nextInt(10);
		reach=ran.nextInt(2);
		hunger=ran.nextInt(10);
		findloc();
		
		
	}
	
	
}