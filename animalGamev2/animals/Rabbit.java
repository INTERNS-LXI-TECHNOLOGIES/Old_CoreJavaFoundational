package com.lxisoft.animalGamev2.animals;
import com.lxisoft.animalGamev2.animals.Animal;
public class Rabbit extends HerbivorousAnimal
{
	
	
	public String type;
	
		
		public void Rabbit()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Herbivorous");
	    setAnimalName("Rabbit");
		}
	

	

}