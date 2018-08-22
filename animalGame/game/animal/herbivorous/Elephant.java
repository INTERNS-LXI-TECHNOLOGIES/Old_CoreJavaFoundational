package com.lxisoft.animalGame.game.animal.herbivorous;
import com.lxisoft.animalGame.game.animal.Animal;
public class Elephant extends Animal 
{
	
	
	public String type;
	
	public void eaten()
	{
	}
	
	public void create()
		{
		int Energylevel,Hungrylevel;
		Energylevel=(int)(Math.random()*50)+80;
		setEnergyLevel(Energylevel);
		Hungrylevel=(int)(Math.random()*50)+50;
		setHungryLevel(Hungrylevel);
		// System.out.println(getEnergyLevel());
		 setanimaltype("Herbivorous");
	
		}
	

}