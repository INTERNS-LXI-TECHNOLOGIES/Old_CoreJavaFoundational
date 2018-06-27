package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animaltype.*;
import java.io.*;
import java.util.*;
public class Deer extends HerbivorousAnimal
{
	public Deer(int id)
	{
		setName("Deer"+String.valueOf(id));
		Random ran=new Random();
		setHunger(ran.nextInt(10));
		setStrength(0);
		setLuck(ran.nextInt(10));
		findloc();
	}
	public void sleep()
	{
		if(getHunger()<2)
		{
			System.out.println("\n"+this.getName()+" is Sleeping");
		}
	}
	
	
}