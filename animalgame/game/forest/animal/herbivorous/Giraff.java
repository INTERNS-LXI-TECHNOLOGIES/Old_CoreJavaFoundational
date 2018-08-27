package com.lxisoft.animalgame.game.forest.animal.herbivorous;
import com.lxisoft.animalgame.game.forest.animal.Animal;

public class Giraff extends Animal
{
	public void create()
	{
		int animalStrength,animalHunger;
		animalStrength=(int)(Math.random()*50)+55;
		setanimalStrength(animalStrength);
		System.out.println("energy level of giraff is:"+getanimalStrength());
		animalHunger=(int)(Math.random()*50)+77;
		setanimalHunger(animalHunger);
		System.out.println("hunger level of giraff is:"+getanimalHunger());
		setanimalType("Herbivorous");
	}
		
	
	
}


