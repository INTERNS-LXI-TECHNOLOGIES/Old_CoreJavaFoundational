package com.lxisoft.animalgame.game.forest.animal.herbivorous;
import com.lxisoft.animalgame.game.forest.animal.Animal;

public class Zebra extends Animal
{
	public void create()
	{
		int animalStrength,animalHunger;
		animalStrength=(int)(Math.random()*50)+85;
		setanimalStrength(animalStrength);
		System.out.println("energy level of zebra is:"+getanimalStrength());
		animalHunger=(int)(Math.random()*50)+66;
		setanimalHunger(animalHunger);
		System.out.println("hunger level of Zebra is:"+getanimalHunger());
		setanimalType("Herbivorous");
	}
		
	
	
}

