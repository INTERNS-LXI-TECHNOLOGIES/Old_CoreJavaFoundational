package com.lxisoft.animalgame.game.forest.animals.carnivores.lion;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.carnivores.Carnivores;
public class Lion extends Animals implements Carnivores
{
	int energyLevel,hungerLevel;
	String animalName;
	public void setLionDetails()
	{
		energyLevel=(int)(Math.random()*100);
		setEnergyLevel(energyLevel);
		hungerLevel=100-energyLevel;
		setHungerLevel(hungerLevel);
		animalName="Lion";
		setAnimalName(animalName);
	}
	
}

