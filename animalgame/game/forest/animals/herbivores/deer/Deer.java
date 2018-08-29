package com.lxisoft.animalgame.game.forest.animals.herbivores.deer;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.herbivores.Herbivores;
public class Deer extends Animals implements Herbivores
{
	int energyLevel;
	int hungerLevel;
	public void setDeerDetails()
	{
		energyLevel=(int)(Math.random()*30)+40;
		hungerLevel=(int)(Math.random()*100);
	}

	public void getDeerDetails()
	{
		System.out.println(energyLevel);
		System.out.println(hungerLevel);
	}


}