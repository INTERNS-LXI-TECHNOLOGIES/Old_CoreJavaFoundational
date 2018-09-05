package com.lxisoft.program;

public class Deer extends Animal
{
	private int hungerLevel=50;
	private int energyLevel=50;

	//intialize values
	public void intialize()
	{
		setAnimalName("Deer");
		setAnimalType("Herbivore");
		setEnergyLevel(energyLevel);
		setHungerLevel(hungerLevel);
	}

}