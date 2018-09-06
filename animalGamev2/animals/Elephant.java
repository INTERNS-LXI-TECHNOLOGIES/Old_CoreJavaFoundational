package com.lxisoft.animalGame.game.animal.herbivorous;
import com.lxisoft.animalGame.game.animal.Animal;
public class Elephant extends Animal 
{
	

	
	public void Elephant()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Herbivorous");
	    setAnimalName("Elephant");
		}
		public String getName()
		{
		String name=getAnimalName();
		return name;
		}

	

}