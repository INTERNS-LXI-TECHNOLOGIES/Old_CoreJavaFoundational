package com.lxisoft.animalgame.forest.animal;
import  com.lxisoft.animalgame.forest.animal.carnivore.Carnivores;
import  com.lxisoft.animalgame.forest.animal.herbivore.Herbivores;

abstract public class Animal
{
	
	private String name;
	private int energyLevel;
	private int hungryLevel;
	
	/**
	*@param name
	*to set name of the animal
	**/
	public void setName(String name)
	{
		this.name=name;
	}
	
	
	/**
	*@param energyLevel
	*to set the energyLevel of animal
	**/
	public void setEnergyLevel(int energyLevel)
	{
		this.energyLevel=energyLevel;
	}
	
	/**
	*@param hungryLevel
	*to set the hungryLevel of animal
	**/
	public void setHungryLevel(int hungryLevel)
	{
		this.hungryLevel=hungryLevel;
	}
	
	/**
	*@return name
	*return the name of animal
	**/
	public String toString()
	{
		return name;	
	}
	
	/**
	*@return energyLevel
	*return energyLevel of animal
	**/
	public int getEnergyLevel()
	{
		return energyLevel;
	}
	
	/**
	*@return hungryLevel
	*return hungryLevel of animal
	**/
	public int getHungryLevel()
	{
		return hungryLevel;
	}
	

}
