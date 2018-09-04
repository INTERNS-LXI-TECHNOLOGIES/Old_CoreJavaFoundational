package com.lxisoft.animalgame.forest.animals.herbivores;

import com.lxisoft.animalgame.forest.animals.Animal;

public class Deer extends Animal
{
	public void create()
	{
		int hungerLevel,energyLevel;
		energyLevel=(int)(Math.random()*70)+30;
		setenergyLevel(energyLevel);
		hungerLevel=(int)(Math.random()*40)+60;
		sethungerLevel(hungerLevel);
		
		System.out.println("Current Energy level of Deer::" + getenergyLevel());
		setanimalType("Herbivores");
		setanimalName("Deer");
		
	}
	public String getName()
	{
		String name=getanimalName();
		return name;
	}
	
}