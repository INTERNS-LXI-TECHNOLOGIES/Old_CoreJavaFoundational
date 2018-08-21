package com.lxisoft.animalGame.game.animal;
public class Animal
{
	private String animalType,animalName;
	private int hungerLevel,energyLevel;
	
	public void setAnimalType(String animalType)
	{
		this.animalType=animalType;
	}
	public String getAnimalType()
	{
		return animalType;
	}

	
	public void setAnimalName(String animalName)
	{
		this.animalName=animalName;
	}
	public String getAnimalName()
	{
		return animalName;
	}

	
	
		public void setHungerLevel(int hungerLevel)
	{
		this.hungerLevel=hungerLevel;
	}
	public int getHungerLevel()
	{
		return hungerLevel;
	}
	
	public void setEnergyLevel(int energyLevel)
	{
		this.energyLevel= energyLevel;
	}
	public int getEnergyLevel()
	{
		return energyLevel;
	}
}