package com.lxisoft.animalgame.game.forest.animals.carnivores.tiger;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.carnivores.Carnivores;
public class Tiger extends Animals implements Carnivores
{
	int energyLevel,hungerLevel;
	String animalName;
	public void setTigerDetails()
	{
		energyLevel=(int)(Math.random()*100);
		setEnergyLevel(energyLevel);
		hungerLevel=100-energyLevel;
		setHungerLevel(hungerLevel);
		animalName="Tiger";
		setAnimalName(animalName);

	}
	
}
