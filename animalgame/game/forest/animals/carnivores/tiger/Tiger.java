package com.lxisoft.animalgame.game.forest.animals.carnivores.tiger;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.Animals;
import com.lxisoft.animalgame.game.forest.animals.carnivores.Carnivores;
public class Tiger extends Animals implements Carnivores
{
	int energyLevel;
	int hungerLevel;

	public void setTigerDetails()
	{
		energyLevel=(int)(Math.random()*50)+40;
		hungerLevel=(int)(Math.random()*100);
	}
	
	public void getTigerDetails()
	{
		System.out.println(energyLevel);
		System.out.println(hungerLevel);
	}
}
