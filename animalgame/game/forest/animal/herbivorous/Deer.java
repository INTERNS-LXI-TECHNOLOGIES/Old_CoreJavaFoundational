package com.lxisoft.animalgame.game.forest.animal.herbivorous;
import com.lxisoft.animalgame.game.forest.animal.Animal;

public class Deer extends Animal
{
	public void create()
	{
		int animalStrength,animalHunger;
		animalStrength=(int)(Math.random()*50)+90;
		setanimalStrength(animalStrength);
		//System.out.println("energy level of deer is:"+getanimalStrength());
		animalHunger=(int)(Math.random()*50)+60;
		setanimalHunger(animalHunger);
		//System.out.println("hunger level of deer is:"+getanimalHunger());
		setanimalType("herbivorous");
	}

		
	
	
}

