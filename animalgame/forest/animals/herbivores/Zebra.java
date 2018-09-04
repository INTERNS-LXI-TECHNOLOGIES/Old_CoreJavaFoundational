package com.lxisoft.animalgame.forest.animals.herbivores;

import com.lxisoft.animalgame.forest.animals.Animal;

public class Zebra extends Animal
{
	public void create()
	{
		int hungerLevel,energyLevel;
		energyLevel=(int)(Math.random()*70)+30;
		setenergyLevel(energyLevel);
		hungerLevel=(int)(Math.random()*40)+60;
		sethungerLevel(hungerLevel);
		
		System.out.println("Current Energy level of Zebra::" + getenergyLevel());
		setanimalType("Herbivores");
		setanimalName("Zebra");
		
	}
	public String getName()
	{
		String name=getanimalName();
		return name;
	}
	
}