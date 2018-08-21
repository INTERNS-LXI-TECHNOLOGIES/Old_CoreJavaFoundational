package com.lxisoft.animalGame.game.animal.herbivores;
import com.lxisoft.animalGame.game.animal.Animal;
public class Rabbit extends Animal implements Herbivores
{
	public  void eaten()
	{
	}
	
	public void create()
	{
	int energyLevel,hungerLevel;
   
	setAnimalType("HERBIVORES");
	setAnimalName("RABBIT");
	energyLevel=(int)(Math.random()*10)+50;
	setEnergyLevel(energyLevel);
	hungerLevel=(int)(Math.random()*10)+50;
	setHungerLevel(hungerLevel);
	System.out.println("\n"+getAnimalName()+"\t" +getHungerLevel()+"\t" +getEnergyLevel());
	}
}
