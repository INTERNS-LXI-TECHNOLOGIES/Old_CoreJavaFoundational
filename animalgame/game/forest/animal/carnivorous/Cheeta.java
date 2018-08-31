package com.lxisoft.animalgame.game.forest.animal.carnivorous;
import com.lxisoft.animalgame.game.forest.animal.Animal;

public class Cheeta extends Animal
{
	public void create()
	{
		int animalStrength,animalHunger;
		animalStrength=(int)(Math.random()*50)+88;
		setanimalStrength(animalStrength);
		//System.out.println("energy level of cheeta is :"+getanimalStrength());
		animalHunger=(int)(Math.random()*50)+66;
		setanimalHunger(animalHunger);
		//System.out.println("hunger level of cheeta is:"+getanimalHunger());
		
		setanimalType("carnivorous");
		
	}

		

}

	

