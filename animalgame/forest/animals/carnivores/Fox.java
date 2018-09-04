package com.lxisoft.animalgame.forest.animals.carnivores;

import com.lxisoft.animalgame.forest.animals.Animal;

public class Fox extends Animal 
{
	public void create()
	{
		int hungerLevel,energyLevel;
		energyLevel=(int)(Math.random()*40)+60;
		setenergyLevel(energyLevel);
		hungerLevel=(int)(Math.random()*30)+70;
		sethungerLevel(hungerLevel);
		
		System.out.println("Current Energy level of Fox::" + getenergyLevel());
		setanimalType("Carnivores");
		setanimalName("Fox");
		
	}
	
	public String getName()
	{
		String name=getanimalName();
		return name;
	}
	
}	