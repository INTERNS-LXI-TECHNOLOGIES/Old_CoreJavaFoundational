package com.lxisoft.animalgame.game.forest.animal;
public class Animal
{
private String animalName,animalType;
private int animalStrength;
private int animalHunger;
public Animal[][] location;

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
	public void setanimalStrength(int strength)
	{
		this.animalStrength=strength;
	}
	public int getanimalStrength()
	{
		return animalStrength;
	}
	public void setanimalHunger(int hunger)
	{
		this.animalHunger=hunger;
	}
	public int getAnimalHunger()
	{
		return animalHunger;
	}
}