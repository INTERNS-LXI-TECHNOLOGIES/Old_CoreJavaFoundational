import java.io.*;
import java.util.Random;
class Zebra extends Animal{
	public Zebra(int id)
	{
		
	 setName("Zebra"+String.valueOf(id));
	 Random ran=new Random();
	 setStrength(ran.nextInt(10));
	 setReach(ran.nextInt(10));
	 setHunger(ran.nextInt(10));
		
	}
	
}