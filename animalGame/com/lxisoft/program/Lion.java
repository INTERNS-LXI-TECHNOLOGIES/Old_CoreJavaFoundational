package com.lxisoft.program;

public class Lion extends Animal
{
	private int hungerLevel=90;
	private int energyLevel=90;

	//intialize values
	public void intialize()
	{
		setAnimalName("Lion");
		setAnimalType("Carnivore");
		setEnergyLevel(energyLevel);
		setHungerLevel(hungerLevel);
	}

}