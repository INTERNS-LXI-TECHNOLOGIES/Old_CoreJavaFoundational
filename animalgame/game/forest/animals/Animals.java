package com.lxisoft.animalgame.game.forest.animals;
public class Animals
{
	private String animalName,animalType;
	private int animalEnergyLevel;
	private int animalHungryLevel;
	public 	Animals[][] location;
	public void setAnimalName(String name)
	{
		this.animalName=name;
	}

	public String getAnimalName()
	{
		return animalName;
	}
	public void setAnimalType(String type)
	{
		this.animalType=type;
	}

	public String getAnimalType()
	{
		return animalType;
	}

	public void setEnergyLevel(int energyLevel)
	{
		this.animalEnergyLevel=energyLevel;
	}

	public int getEnergyLevel()
	{
		return animalEnergyLevel;
	}
	public void setHungryLevel(int hungryLevel)
	{
		this.animalHungryLevel=hungryLevel;
	}

	public int getHungryLevel()
	{
		return animalHungryLevel;
	}
}