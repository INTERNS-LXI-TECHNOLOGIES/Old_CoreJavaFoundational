package com.lxisoft.animalGamev2.animals;
import com.lxisoft.animalGamev2.animals.Animal;
import java.util.*;
public class Lion extends  CarnivorousAnimal
{
	
	int animalId;
	
	
	
		public void Lion()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Carnivorous");
		setAnimalName("Lion");
	
		}
		
	/*	public int animalId(int id)
		{
		setAnimalId(id);
	    int animalId=getAnimalId();
		return animalId;
		}
		
		public String getName()
		{
		String name=getAnimalName();
		return name;
		}*/


}