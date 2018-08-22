package com.lxisoft.animalgame.game.forest.animal;
public class Animal
{
private String animalName,animalType;
private int animalStrength;
private int animalHunger;
public Animal[][] location;

	public void setanimalName(String name)
	{
	this.animalName=name;
	}
	public String getanimalName()
	{
	return animalName;
	}
	public void setanimalType(String type)
	{
		this.animalType=type;
	}
	public String getanimalType()
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
	public int getanimalHunger()
	{
		return animalHunger;
	}
}