package com.lxisoft.animalGame.game.animal.carnivorous;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.animal.AnimalLevel;
import java.util.*;
public class Lion extends Animal implements Carnivorous
{
	
	private String type;
	
	public void eat()
	{
	}
	
		public void create()
		{
		int Energylevel,Hungrylevel;
		Energylevel=(int)(Math.random()*50)+50;
		setEnergyLevel(Energylevel);
		Hungrylevel=(int)(Math.random()*50)+50;
		setHungryLevel(Hungrylevel);
		 System.out.println(getEnergyLevel());
		 setanimaltype("Carnivorous");
	
		}
	


}