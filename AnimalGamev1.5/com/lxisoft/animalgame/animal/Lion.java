package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.interfaces.*;
import com.lxisoft.animalgame.forest.*;
import java.io.*;
import java.util.*;
public class Lion extends Animal implements Carnivorus{
	//setting all the values
	public Lion(int id){
	       Random r=new Random();
		   setName("Lion "+String.valueOf(id));
		   setStrength(r.nextInt(10));
		   setReach(r.nextInt(10));
		   setHungry(r.nextInt(10));
		   setCarnivorus(1);
	}
	public void fight(Animal f,Animal c){
			System.out.println(c.getName()+" figths with  "+f.getName());  
		   }
    public void eats(Animal f,Animal c){
		System.out.println(c.getName()+" eats  "+f.getName());
	}	   
	public void killed(Animal f,Animal c){
		System.out.println(c.getName()+" has been killed by  "+f.getName());
	}

}