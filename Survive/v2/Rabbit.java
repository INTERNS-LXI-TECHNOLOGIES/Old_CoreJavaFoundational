import java.io.*;
import java.util.*;
public class Rabbit extends HerbivorousAnimal
{
	public Rabbit(int id)
	{
		name="Rabbit"+String.valueOf(id);
		Random ran=new Random();
		hunger=ran.nextInt(10);
		strength=0;
		findloc();
	} 
	
}