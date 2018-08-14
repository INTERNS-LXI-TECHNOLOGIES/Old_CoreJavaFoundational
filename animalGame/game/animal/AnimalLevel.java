package com.lxisoft.animalGame.game.animal;
public class AnimalLevel
{
	 Animal animal=new  Animal();
	public void settingLevel()
	{   int Energylevel,Hungrylevel;
		Energylevel=(int)(Math.random()*50)+50;
		animal.setEnergyLevel(Energylevel);
		System.out.println(animal.getEnergyLevel());
		Hungrylevel=(int)(Math.random()*50)+50;
		animal.setHungryLevel(Hungrylevel);
		System.out.println(animal.getHungryLevel());
	}
}