package com.lxisoft.program;

public class Cow extends Animal
{
	private int hungerLevel=60;
	private int energyLevel=60;

	//intialize values
	public void intialize()
	{
		setAnimalName("Cow");
		setAnimalType("Herbivore");
		setEnergyLevel(energyLevel);
		setHungerLevel(hungerLevel);
	}

}