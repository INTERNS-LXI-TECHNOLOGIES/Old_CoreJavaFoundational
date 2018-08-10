package com.lxisoft.animalgame.forest.animals;
public class Animal
{
	private String animalName;
	private int energyLevel;
	private int hungerLevel;
	
	public void setanimalName(String animalName)
	{
		this.animalName=animalName;
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
	
	public String getenergyLevel()
	{
		return energyLevel;
	}
	
	public String gethungerLevel()
	{
		return gethungerLevel;
	}
}