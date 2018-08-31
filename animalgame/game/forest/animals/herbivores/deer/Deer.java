package com.lxisoft.animalgame.game.forest.animals.herbivores.deer;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.herbivores.Herbivores;
public class Deer extends Animals implements Herbivores
{
	int energyLevel,hungerLevel;
	String animalName;
	public void setDeerDetails()
	{
		energyLevel=(int)(Math.random()*100);
		setEnergyLevel(energyLevel);
		hungerLevel=100-energyLevel;
		setHungerLevel(hungerLevel);
		animalName="Deer";
		setAnimalName(animalName);

	}

}