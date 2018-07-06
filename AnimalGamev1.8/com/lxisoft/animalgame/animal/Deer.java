package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.interfaces.*;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.*;
public class Deer extends Animal implements Herbivorus{
	//setting all the values
public Deer(int id){
	       Random r=new Random();
		   setName("Deer "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHungry(r.nextInt(10));
		   setLuck(r.nextInt(10));
		   setCarnivorus(0);
}
public boolean breathlevel(){
		if(getStrength()<5){
			return true;
		}
		return false;
	}
public void runaway(Animal b){
	System.out.println(b.getName()+"Runsaway dueto its Luck");
}
   
}