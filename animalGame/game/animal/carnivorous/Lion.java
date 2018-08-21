package com.lxisoft.animalGame.game.animal.carnivorous;
import com.lxisoft.animalGame.game.animal.Animal;
public class Lion extends Animal implements Carnivorous
{
	public  void eat()
	{
	}
	
	
	public void create()
	{
	int energyLevel,hungerLevel;
   
	setAnimalType("CARNIVOROUS");
	setAnimalName("LION");
	energyLevel=(int)(Math.random()*50)+50;
	setEnergyLevel(energyLevel);
	hungerLevel=(int)(Math.random()*50)+50;
	setHungerLevel(hungerLevel);
	System.out.println("\n"+getAnimalName()+"\t"+ getHungerLevel()+"\t" +getEnergyLevel());
	}
}