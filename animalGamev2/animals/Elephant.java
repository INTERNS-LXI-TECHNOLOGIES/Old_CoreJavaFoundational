package com.lxisoft.animalGamev2.animals;
import com.lxisoft.animalGamev2.animals.Animal;
public class Elephant extends HerbivorousAnimal 
{
	

	
	public void Elephant()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Herbivorous");
	    setAnimalName("Elephant");
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