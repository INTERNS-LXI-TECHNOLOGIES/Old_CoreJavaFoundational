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
		


}