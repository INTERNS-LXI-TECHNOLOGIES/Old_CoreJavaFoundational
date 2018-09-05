package com.lxisoft.animalGamev2.animals;
import com.lxisoft.animalGame.game.animal.Animal;
import java.util.*;
public class Lion extends Animal 
{
	
	
	
	
	
		public void Lion()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Carnivorous");
		setAnimalName("Lion");
	
		}
		public String getName()
		{
		String name=getAnimalName();
		return name;
		}


}