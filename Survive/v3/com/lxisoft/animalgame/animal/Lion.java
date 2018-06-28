package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animaltype.*;


import java.io.*;
import java.util.*;
public class Lion extends CarnivorousAnimal
{
	Random ran=new Random();
	public Lion(int id)
	{
		setName("Lion"+String.valueOf(id));
		setStrength(ran.nextInt(10));
		setReach(ran.nextInt(2));
		setHunger(ran.nextInt(10));
		setCarnivorous(1);
		findloc();
		
		
	}
	public void sleep()
	{
		if(getHunger()<3)
		{
			System.out.println("\n"+this.getName()+" is Sleeping");
		}
	}
	
	
}