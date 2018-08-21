package com.lxisoft.animalGame.game.animal.carnivorous;
import com.lxisoft.animalGame.game.animal.Animal;
public class Tiger extends Animal implements Carnivorous
{
public  void eat()
	{
	}
	
	public void create()
	{
	int energyLevel,hungerLevel;
   
	setAnimalType("CARNIVOROUS");
	setAnimalName("TIGER");
	energyLevel=(int)(Math.random()*40)+50;
	setEnergyLevel(energyLevel);
	hungerLevel=(int)(Math.random()*40)+50;
	setHungerLevel(hungerLevel);
	System.out.println("\n"+getAnimalName()+"\t" +getHungerLevel()+"\t" +getEnergyLevel());
	}
}