import java.io.*;
import java.util.*;
public class Zebra extends Animal{
	//setting all the values
	public Zebra(int id){
		   Random r=new Random();
		   setName("Zebra "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHungry(r.nextInt(10));
		   setCarnivorus(0);
		   }
	}