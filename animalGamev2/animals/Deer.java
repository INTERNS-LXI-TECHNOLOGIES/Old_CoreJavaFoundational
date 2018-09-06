package com.lxisoft.animalGame.game.animal.herbivorous;
import com.lxisoft.animalGame.game.animal.Animal;

public class Deer extends Animal 
{
	

	
	
		
		public void Deer()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Herbivorous");
	    setAnimalName("Deer");
		}
		public String getName()
		{
		String name=getAnimalName();
		return name;
		}

	

}
