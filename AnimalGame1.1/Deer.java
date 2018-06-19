import java.io.*;
import java.util.*;
public class Deer extends Animal{
	//setting all the values
public Deer(int id){
	       Random r=new Random();
		   setName("Deer "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHungry(r.nextInt(10));
		   setCarnivorus(0);
}
   
}