package com.lxisoft.animalGamev2.animals;
 import com.lxisoft.animalGamev2.animals.Animal;
 import java.util.*;
public class Tiger extends  CarnivorousAnimal
{
	
	    private String type;
	
		public void Tiger()
		{
	
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
        setanimaltype("Carnivorous");
		setAnimalName("Tiger");
	
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
	
