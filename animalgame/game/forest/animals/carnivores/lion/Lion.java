package com.lxisoft.animalgame.game.forest.animals.carnivores.lion;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.carnivores.Carnivores;
public class Lion extends Animals implements Carnivores
{

	int energyLevel;
	int hungerLevel;

	public void setLionDetails()
	{
		energyLevel=(int)(Math.random()*60)+30;
		hungerLevel=(int)(Math.random()*100);
	}

	public void getLionDetails()
	{
		System.out.println(energyLevel);
		System.out.println(hungerLevel);
	}
	
}

