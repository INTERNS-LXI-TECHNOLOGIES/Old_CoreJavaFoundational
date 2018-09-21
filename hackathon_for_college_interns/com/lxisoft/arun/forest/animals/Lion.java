package com.lxisoft.arun.forest.animals;
public class Lion extends Animal implements Carnivorous
 {
	public Lion(String name,int strength)
	{
		super(name,strength);
	}
	
	public Animal fight(Animal a)
	{
		if(getEnergylevel()>6 && a.getEnergylevel()<4)
		{
			return a;
		}
		else
			return a;
		
	}

}