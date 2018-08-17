package com.lxisoft.animalGame.game.animal.carnivorous;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.animal.AnimalLevel;
import java.util.*;
public class Lion extends Animal implements Carnivorous
{
	AnimalLevel level=new AnimalLevel();
	public String type="Carnivorous";
	
	public void eat()
	{
	}
	
		public void create()
		{
		level.settingLevel();
		 System.out.println(level.getHungryLevel());
		 setanimaltype(type);
	
		}
	


}