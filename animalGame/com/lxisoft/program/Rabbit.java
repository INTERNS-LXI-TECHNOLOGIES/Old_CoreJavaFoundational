package com.lxisoft.program;

public class Rabbit extends Animal
{


	private int hungerLevel=30;
	private int energyLevel=30;

	//intialize values
	public void intialize()
	{
		setAnimalName("Rabbit");
		setAnimalType("Herbivore");
		setEnergyLevel(energyLevel);
		setHungerLevel(hungerLevel);
	}

}
