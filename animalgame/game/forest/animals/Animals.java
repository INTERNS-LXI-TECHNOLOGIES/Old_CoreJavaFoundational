package com.lxisoft.animalgame.game.forest.animals;
import com.lxisoft.animalgame.game.forest.animals.carnivores.lion.Lion;
import com.lxisoft.animalgame.game.forest.animals.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.game.forest.animals.herbivores.elephant.Elephant;
import com.lxisoft.animalgame.game.forest.animals.herbivores.deer.Deer;
import com.lxisoft.animalgame.game.forest.animals.herbivores.Herbivores;
import com.lxisoft.animalgame.game.forest.animals.carnivores.Carnivores;

public class Animals
{
	public String animalName;
	public int energyLevel;
	public int hungerLevel;
	
	public void setAnimalName(String name)
	{
		this.animalName=name;
	}

	public String getAnimalName()
	{
		return animalName;
	}

	public void setEnergyLevel(int energy)
	{
		this.energyLevel=energy;
	}

	public int getEnergyLevel()
	{
		return energyLevel;
	}
	public void setHungerLevel(int hunger)
	{
		
		this.hungerLevel=hunger;
	}

	public int getHungerLevel()
	{
		return hungerLevel;
	}
}