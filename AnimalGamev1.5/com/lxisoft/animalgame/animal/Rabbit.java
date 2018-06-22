package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.interfaces.*;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.*;
public class Rabbit extends Animal implements Herbivorus{
	//setting all the values
	public Rabbit(int id){
		  
	       Random r=new Random();
		   setName("Rabbit "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHungry(r.nextInt(10));
		   setLuck(r.nextInt(10));
		   setCarnivorus(0);
          
}
public void runaway(Animal b){
	System.out.println(b.getName()+" Runsaway dueto its Luck");
}

}