package com.lxisoft.animalGame.game.animal.herbivorous;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.animal.AnimalLevel;
public class Deer extends Animal implements Herbivorous
{
	

	AnimalLevel level=new AnimalLevel();
	
	public void eaten()
	{
	}
	
		public void create()
		{
		level.settingLevel();
		  System.out.print(level.getHungryLevel());
	
		}
	

}