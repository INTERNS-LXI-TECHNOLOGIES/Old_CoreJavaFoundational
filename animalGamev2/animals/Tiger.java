package com.lxisoft.animalGamev2.animals;
 import com.lxisoft.animalGame.game.animal.Animal;
 import java.util.*;
public class Tiger extends Animal 
{
	
	    private String type;
	
		public void Tiger()
		{
	
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
        setanimaltype("Carnivorous");
		setAnimalName("Tiger");
	
		}
		public String getName()
		{
		String name=getAnimalName();
		return name;
		}
	

	
}
	
