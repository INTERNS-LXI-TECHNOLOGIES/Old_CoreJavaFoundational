package com.lxisoft.animalGame.animal;
import com.lxisoft.animalGame.supporting_class.*;
import com.lxisoft.animalGame.animal.*;
import java.io.*;
import java.util.Random;
public class Zebra extends HerbiAnimal{
	public Zebra(int id)
	{
		
	 setName("Zebra"+String.valueOf(id));
	 Random r=new Random();
	 setStrength(r.nextInt(10));
	 setReach(r.nextInt(10));
	 setHunger(r.nextInt(10));
	}
}
