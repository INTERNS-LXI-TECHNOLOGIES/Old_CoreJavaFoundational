package com.lxisoft.animalGame.game.animal.carnivorous;
import com.lxisoft.animalGame.game.animal.Animal;
import java.util.*;
public class Lion extends Animal 
{
	
	
	
	
	
		public void create()
		{
		int Energylevel,Hungrylevel;
		Energylevel=(int)(Math.random()*50)+50;
		setEnergyLevel(Energylevel);
		Hungrylevel=(int)(Math.random()*50)+50;
		setHungryLevel(Hungrylevel);
		System.out.println(getEnergyLevel());
		setanimaltype("Carnivorous");
		setAnimalName("lion");
	
		}
		public String getName()
		{
		String name=getAnimalName();
		return name;
		}


}