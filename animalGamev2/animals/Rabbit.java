package com.lxisoft.animalGame.game.animal.herbivorous;
import com.lxisoft.animalGame.game.animal.Animal;
public class Rabbit extends Animal
{
	
	
	public String type;
	
		
		public void Rabbit()
		{
		setEnergyLevel((int)(Math.random()*50)+50);
		setHungryLevel((int)(Math.random()*50)+50);
		setanimaltype("Herbivorous");
	    setAnimalName("Rabbit");
		}
		public String getName()
		{
		String name=getAnimalName();
		return name;
		}

	

}