import java.io.*;
import java.util.Random;
class Rabbit extends Animal{
	public Rabbit(int id)
	{
		
		setName("Rabbit"+String.valueOf(id));
	 Random ran=new Random();
	 setStrength(ran.nextInt(10));
	 setReach(ran.nextInt(10));
	 setHunger(ran.nextInt(10));
	 
	
	}
	
}