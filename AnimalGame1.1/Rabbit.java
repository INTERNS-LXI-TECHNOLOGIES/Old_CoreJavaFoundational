import java.io.*;
import java.util.*;
public class Rabbit extends Animal{
	//setting all the values
	public Rabbit(int id){
		  
	       Random r=new Random();
		   setName("Rabbit "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHungry(r.nextInt(10));
		   setCarnivorus(0);
          
}

}