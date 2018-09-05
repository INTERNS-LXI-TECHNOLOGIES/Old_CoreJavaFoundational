package com.lxisoft.program;

public class Animal
{
	private String animalName;
	private String animalType;
	private int energyLevel;
	private int hungerLevel;

	//setters

	//set animal name
	public void setAnimalName(String animalName)
	{
		this.animalName=animalName;
	}

	//set the type of animal
	public void setAnimalType(String animalType)
	{
		this.animalType=animalType;
	}

	//set the energy level of animal
	public void setEnergyLevel(int energyLevel)
	{
		this.energyLevel=energyLevel;
	}

	//set the hunger level of animal
	public void setHungerLevel(int hungerLevel)
	{
		this.hungerLevel=hungerLevel;
	}

	//getters

	//return the animal name
	public String getAnimalName()
	{
		return animalName;
	}

	//return the type of animal
	public String getAnimalType()
	{
		return animalType;
	}

	//return the energy level
	public int getEnergyLevel()
	{
		return energyLevel;
	}

	//return the hunger level
	public int getHungerLevel()
	{
		return hungerLevel;
	}


	
}