import java.io.*;
import java.util.Random;
class Tiger extends Animal{
	
	public Tiger(int id)
	{
		
	 setName("Tiger"+String.valueOf(id));
	 Random ran=new Random();
	 setStrength(ran.nextInt(10));
	 setReach(ran.nextInt(10));
	 setHunger(ran.nextInt(10));
	
	
	}
		

}