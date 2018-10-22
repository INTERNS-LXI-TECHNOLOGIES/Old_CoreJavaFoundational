package com.lxisoft.animalGamev2.animals;
import com.lxisoft.animalGamev2.animals.Animal;
public class Elephant extends HerbivorousAnimal 
{
	

	
	public  Elephant()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Herbivorous");
	    setAnimalName("Elephant");
		
		//System.out.println("Elephant");
		}
	
	

}