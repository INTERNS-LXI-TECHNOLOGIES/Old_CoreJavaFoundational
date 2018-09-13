package com.lxisoft.animalGamev2.animals;
//import com.lxisoft.animalGamev2.animals.CarnivorousAnimal;
import java.util.*;
public class Athulya extends CarnivorousAnimal
{
	
	    private String type;
	
		public void Athulya()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Carnivorous");
		setAnimalName("Athulya");
	
		}
		public int animalId(int id)
		{
		setAnimalId(id);
	    int animalId=getAnimalId();
		return animalId;
		}
		
		public String getName()
		{
		String name=getAnimalName();
		return name;
		}
	

	
}
	
