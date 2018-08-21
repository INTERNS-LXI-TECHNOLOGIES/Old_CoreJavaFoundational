package com.lxisoft.animalgame.game.forest.animals;
import com.lxisoft.animalgame.game.forest.animals.carnivores.lion.Lion;
import com.lxisoft.animalgame.game.forest.animals.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.game.forest.animals.herbivores.elephant.Elephant;
import com.lxisoft.animalgame.game.forest.animals.herbivores.deer.Deer;

public class Animals
{
	private String animalName,animalType;
	private int animalEnergyLevel;
	private int animalHungryLevel;
	
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

	public void setEnergyLevel(int energyLevel)
	{
		this.animalEnergyLevel=energyLevel;
	}

	public int getEnergyLevel()
	{
		return animalEnergyLevel;
	}
	public void setHungryLevel(int hungryLevel)
	{
		this.animalHungryLevel=hungryLevel;
	}

	public int getHungryLevel()
	{
		return animalHungryLevel;
	}
}