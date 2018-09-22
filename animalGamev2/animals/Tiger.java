package com.lxisoft.animalGamev2.animals;
 import com.lxisoft.animalGamev2.animals.Animal;
 import java.util.*;
public class Tiger extends  CarnivorousAnimal
{
	
	    private String type;
	
		public  Tiger()
		{
	
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
        setanimaltype("Carnivorous");
		setAnimalName("Tiger");
	
		}
	
	

	
}
	
