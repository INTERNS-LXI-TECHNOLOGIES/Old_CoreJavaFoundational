package com.lxisoft.animalgame.forest.animals.herbivores;

import com.lxisoft.animalgame.forest.animals.Animal;
public class Rabbit extends Animal 
{
	
	public void create()
	{
		int hungerLevel,energyLevel;
		energyLevel=(int)(Math.random()*60)+40;
		setenergyLevel(energyLevel);
		hungerLevel=(int)(Math.random()*40)+60;
		sethungerLevel(hungerLevel);
		
		
		System.out.println("Current Energy level of Rabbit::" + getenergyLevel());
		setanimalName("Rabbit");
		setanimalType("Herbivores");
		
		
	}
	
	public String getName()
	{
		String name=getanimalName();
		return name;
	}
}