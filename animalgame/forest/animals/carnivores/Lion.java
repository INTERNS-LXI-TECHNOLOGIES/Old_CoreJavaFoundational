package com.lxisoft.animalgame.forest.animals.carnivores;

import com.lxisoft.animalgame.forest.animals.Animal;
public class Lion extends Animal 
{
	public void create()
	{
		int hungerLevel,energyLevel;
		energyLevel=(int)(Math.random()*50)+50;
		setenergyLevel(energyLevel);
		hungerLevel=(int)(Math.random()*50)+50;
		sethungerLevel(hungerLevel);
		
		System.out.println("Current Energy level of Lion::" + getenergyLevel());
		setanimalType("It's Carnivore");
		setanimalName("Lion");
		
	}
	
	public String getName()
	{
		String name=getanimalName();
		return name;
	}
	
}