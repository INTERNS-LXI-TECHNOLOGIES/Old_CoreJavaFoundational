package com.lxisoft.animalgame.game.forest.animals.herbivores.elephant;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.herbivores.Herbivores;
public class Elephant extends Animals implements Herbivores
{
	int energyLevel,hungerLevel;
	String animalName;
	public void setElephantDetails()
	{
		energyLevel=(int)(Math.random()*100);
		setEnergyLevel(energyLevel);
		hungerLevel=100-energyLevel;
		setHungerLevel(hungerLevel);
		animalName="Elephant";
		setAnimalName(animalName);

	}
	
}