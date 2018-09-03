package com.lxisoft.animalGamev2.game.animals;
public class Animal
{
	
	private int energyLevel,hungryLevel;
	private String animaltype;
	private String animalName;
   public void setEnergyLevel(int level)
    {
    this.energyLevel=level;
    }
	
	public int getEnergyLevel()
	{
	return energyLevel;
	}

      public void setHungryLevel(int level)
    {
    this.hungryLevel=level;
    }
    
	
      public int getHungryLevel()
    {
    return hungryLevel;
    }
	 public void setanimaltype(String animaltype)
    {
    this.animaltype=animaltype;
    }
	
	public String getanimaltype()
	{
	return animaltype;
	}
	 public void setAnimalName(String name)
    {
    this.animalName=name;
    }
	
	public String getAnimalName()
	{
	return animalName;
	}
	
	
}