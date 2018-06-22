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
		findloc();
	}
	
	
}