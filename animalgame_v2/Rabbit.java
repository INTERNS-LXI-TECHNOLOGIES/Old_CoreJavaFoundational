import java.io.*;
import java.util.Random;
class Rabbit extends HerbiAnimal{
	public Rabbit(int id)
	{
		
		   setName("Rabbit"+String.valueOf(id));
	       Random r=new Random();
		   setName("Rabbit "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHunger(r.nextInt(10));
		   
          
}


}