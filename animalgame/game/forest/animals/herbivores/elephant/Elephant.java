package com.lxisoft.animalgame.game.forest.animals.herbivores.elephant;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.herbivores.Herbivores;
public class Elephant extends Animals implements Herbivores
{

	int energyLevel;
	int hungerLevel;
	public void setElephantDetails()
	{
		energyLevel=(int)(Math.random()*80)+20;
		hungerLevel=(int)(Math.random()*100);
	}

	public void getElephantDetails()
	{
		System.out.println(energyLevel);
		System.out.println(hungerLevel);
	}
	
}