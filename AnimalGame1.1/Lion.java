import java.io.*;
import java.util.*;
public class Lion extends Animal{
	//setting all the values
	public Lion(int id){
	       Random r=new Random();
		   setName("Lion "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHungry(r.nextInt(10));
		   setCarnivorus(1);
    }
}