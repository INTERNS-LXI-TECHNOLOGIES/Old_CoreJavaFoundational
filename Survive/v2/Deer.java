import java.io.*;
import java.util.*;
public class Deer extends HerbivorousAnimal
{
	public Deer(int id)
	{
		name="Deer"+String.valueOf(id);
		Random ran=new Random();
		hunger=ran.nextInt(10);
		strength=0;
		findloc();
	}
	
	
}