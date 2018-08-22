package com.lxisoft.animalgame.game.forest.animal.carnivorous;
import com.lxisoft.animalgame.game.forest.animal.Animal;

public class Lion extends Animal
{
	public void create()
	{
		int animalStrength,animalHunger;
		animalStrength=(int)(Math.random()*50)+70;
		setanimalStrength(animalStrength);
		System.out.println("energy level of lion is :"+getanimalStrength());
		animalHunger=(int)(Math.random()*50)+50;
		setanimalHunger(animalHunger);
		System.out.println("hunger level of lion is:"+getanimalHunger());
		
		setanimalType("carnivorous");
		
	}
		

}

	

