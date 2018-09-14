package com.lxisoft.animalGamev2.animals;
public class Animal
{
	
	private int energyLevel,hungryLevel,id;
	private String animaltype;
	private String animalName;
	 public void setAnimalId(int id)
    {
    this.id=id;
    }
	 public int getAnimalId()
    {
		return this.id;
	}
	 public void setAnimalName(String name)
    {
    this.animalName=name;
    }
	
	public String getAnimalName()
	{
	return animalName;
	}

    public void setEnergyLevel(int level)
    {
    this.energyLevel=level;
    }
	
	public int getEnergyLevel()
	{
	return this.energyLevel;
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

	
}