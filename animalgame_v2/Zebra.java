import java.io.*;
import java.util.Random;
class Zebra extends HerbiAnimal{
	public Zebra(int id)
	{
		
	 setName("Zebra"+String.valueOf(id));
	 Random r=new Random();
	 setStrength(r.nextInt(10));
	 setReach(r.nextInt(10));
	 setHunger(r.nextInt(10));
	}
}
