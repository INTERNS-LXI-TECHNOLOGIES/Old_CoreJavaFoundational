import java.io.*;
import java.util.*;
public class Tiger extends Animal{
	//setting all the values
	public Tiger(int id){
	       Random r=new Random();
		   setName("Tiger"+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHungry(r.nextInt(10));
		   setCarnivorus(1);
    }
	
}