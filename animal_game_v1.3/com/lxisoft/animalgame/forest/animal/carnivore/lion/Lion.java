package com.lxisoft.animalgame.forest.animal.carnivore.lion;
import  com.lxisoft.animalgame.forest.animal.carnivore.Carnivores;
import com.lxisoft.animalgame.forest.animal.Animal;
public class Lion extends Animal implements Carnivores
{
	public Lion()
	{
		
		setEnergyLevel(50);
		setHungryLevel(10);
	}
}
