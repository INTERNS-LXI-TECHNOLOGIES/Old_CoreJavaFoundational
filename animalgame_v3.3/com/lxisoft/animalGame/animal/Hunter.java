package com.lxisoft.animalGame.animal;
import com.lxisoft.animalGame.supporting_class.*;
import com.lxisoft.animalGame.animal.*;
import java.io.*;
import java.util.Random;
public class Hunter extends OmniAnimal{
	public Hunter(int id)
	{
		
	 setName("Hunter"+String.valueOf(id));
	 Random r=new Random();
	 setStrength(r.nextInt(10));
	 setReach(r.nextInt(10));
	 setAccuracy(r.nextInt(10));
	 setBullet(r.nextInt(10));
	}
}
