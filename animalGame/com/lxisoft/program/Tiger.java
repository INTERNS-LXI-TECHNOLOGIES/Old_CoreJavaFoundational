package com.lxisoft.program;

public class Lion extends Animal
{
	private int hungerLevel=80;
	private int energyLevel=100;

	//intialize values
	public void intialize()
	{
		setAnimalName("Tiger");
		setAnimalType("Carnivore");
		setEnergyLevel(energyLevel);
		setHungerLevel(hungerLevel);
	}

}