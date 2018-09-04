package com.lxisoft.animalgame.forest.animals.carnivores;

import com.lxisoft.animalgame.forest.animals.Animal;

public class Tiger extends Animal 
{
	public void create()
	{
		int hungerLevel,energyLevel;
		energyLevel=(int)(Math.random()*50)+50;
		setenergyLevel(energyLevel);
		hungerLevel=(int)(Math.random()*50)+50;
		sethungerLevel(hungerLevel);
		
		System.out.println("Current Energy level of Tiger::" + getenergyLevel());
		setanimalType("Carnivores");
		setanimalName("Tiger");
		
	}
	
	public String getName()
	{
		String name=getanimalName();
		return name;
	}
	
}
	
	
	


	