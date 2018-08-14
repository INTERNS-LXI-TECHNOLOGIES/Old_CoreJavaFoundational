package com.lxisoft.animalGame.game.animal;
public class AnimalLevel
{
	 Animal animal=new  Animal();
	public void settingLevel()
	{   int Energylevel,Hungrylevel;
		Energylevel=(int)(Math.random()*50)+50;
		animal.setEnergyLevel(Energylevel);
		
		Hungrylevel=(int)(Math.random()*50)+50;
		animal.setHungryLevel(Hungrylevel);
		
	}
	public int getEnergyLevel()
	{
		int i=animal.getEnergyLevel();
		return i;
	}
	public int getHungryLevel()
	{
		int i=animal.getHungryLevel();
		return i;
	}
}