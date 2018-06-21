import java.io.*;
import java.util.Random;
class Tiger extends CarniAnimal{
	
	public Tiger(int id)
	{
		
	 setName("Tiger"+String.valueOf(id));
	       Random r=new Random();
		   setName("Tiger"+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHunger(r.nextInt(10));
	       
	}
   
}