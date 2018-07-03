package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.interfaces.*;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.*;
public class Zebra extends Animal implements Herbivorus{
	//setting all the values
	public Zebra(int id){
		   Random r=new Random();
		   setName("Zebra "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(2));
		   setHungry(r.nextInt(10));
		   setLuck(r.nextInt(10));
		   setCarnivorus(0);
		   }
	public boolean breathlevel(){
		if(getStrength()>2){
		return true;
		}
		return false;
		
	}
	public void runaway(Animal b){
	System.out.println(b.getName()+" Runsaway dueto its Luck");
}
	}