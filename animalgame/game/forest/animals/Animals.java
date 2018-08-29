package com.lxisoft.animalgame.game.forest.animals;
import com.lxisoft.animalgame.game.forest.animals.carnivores.lion.Lion;
import com.lxisoft.animalgame.game.forest.animals.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.game.forest.animals.herbivores.elephant.Elephant;
import com.lxisoft.animalgame.game.forest.animals.herbivores.deer.Deer;

public class Animals
{
	private String name,type;
	private int energyLevel;
	private int hungryLevel;
	
	public void setAnimalName(String name)
	{
		this.name=name;
	}

	public String getAnimalName()
	{
		return name;
	}
	public void setAnimalType(String type)
	{
		this.type=type;
	}

	public String getAnimalType()
	{
		return type;
	}

	public void setEnergyLevel(int energyLevel)
	{
		this.energyLevel=energyLevel;
	}

	public int getEnergyLevel()
	{
		return energyLevel;
	}
	public void setHungryLevel(int hungryLevel)
	{
		
		this.hungryLevel=hungryLevel;
	}

	public int getHungryLevel()
	{
		return hungryLevel;
	}
}