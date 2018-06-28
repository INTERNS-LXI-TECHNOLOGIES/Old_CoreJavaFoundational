package com.lxisoft.animalgame.animal;
import com.lxisoft.animalgame.animal.*;
import com.lxisoft.animalgame.animaltype.*;
import java.io.*;
import java.util.*;
public class Rabbit extends HerbivorousAnimal
{
	public Rabbit(int id)
	{
		setName("Rabbit"+String.valueOf(id));
		Random ran=new Random();
		setHunger(ran.nextInt(10));
		setStrength(0);
		setLuck(ran.nextInt(10));
		setCarnivorous(0);
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