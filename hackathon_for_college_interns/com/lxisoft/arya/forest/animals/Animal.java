package com.lxisoft.arya.forest.animals;
abstract public class Animal 
{
	private String name;
	private int energyLevel;
	
	/**
	*@return name
	*return the name of the animals
	**/
	public String getName() 
	{
		return name;
	}
	
	/**
	*@param name
	*for setting the name of animals
	**/
	public void setName(String name) 
	{
		this.name=name;
	}
	
	/**
	*@param energyLevel
	*for setting the energyLevel of animals
	**/
	public void setEnergyLevel(int energyLevel)
	{
		this.energyLevel=energyLevel;
	}
	
	/**
	*@return energyLevel
	*return the energyLevel of animals
	**/
	public int getEnergyLevel()
	{
		return energyLevel;
	}
	
	/**
	*@override
	*method for fighting animals
	**/
	public Animal fight(Animal a)
	{
		return a;
	}
	
	/**
	*@override
	*method to print the reaction of animal during fight
	**/
	public void runAway()
	{
		
	}

}