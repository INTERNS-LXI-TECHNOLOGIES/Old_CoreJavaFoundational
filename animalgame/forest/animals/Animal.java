package com.lxisoft.animalgame.forest.animals;

public class Animal
{
	private String animalName;
	private String animalType;
	private int energyLevel;
	private int hungerLevel;
	public Animal[][] locations;
	
	public void setanimalName(String animalName)
	{
		this.animalName=animalName;
	}
	
	public void setanimalType(String animalType)
	{
		this.animalType=animalType;
	}
	
	public void setenergyLevel(int energyLevel)
	{
		this.energyLevel=energyLevel;
	}
	
	public void sethungerLevel(int hungerLevel)
	{
		this.hungerLevel=hungerLevel;
	}
	
	public String getanimalName()
	{
		return animalName;
	}
	
	public String getanimalType()
	{
		return animalType;
	}
	
	public int getenergyLevel()
	{
		return energyLevel;
	}
	
	public int gethungerLevel()
	{
		return hungerLevel;
	}
}