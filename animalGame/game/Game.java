package com.lxisoft.animalGame.game;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.forest.Forest;
import com.lxisoft.animalGame.game.forest.SetForest;
import com.lxisoft.animalGame.game.animal.carnivorous.Lion;
import com.lxisoft.animalGame.game.animal.carnivorous.Tiger;
import com.lxisoft.animalGame.game.animal.herbivores.Rabbit;
import com.lxisoft.animalGame.game.animal.herbivores.Deer;
public class Game
{
	SetForest setForest=new SetForest();
	public Lion lion=new Lion();
	public Tiger tiger=new Tiger();
	public Rabbit rabbit=new Rabbit();
	public Deer deer=new Deer();

	public void animalGame()
	{
		setForest.ForestControl();
		setForest.AnimalLocation(lion);
		setForest.AnimalLocation(tiger);
		setForest.AnimalLocation(rabbit);
		setForest.AnimalLocation(deer);
		//setForest.ForestStatus();
		setForest.displayForest(); 
	}
	
	public void animalCreation()
	{
		lion.create();
		tiger.create();
		rabbit.create();
		deer.create();
		
	}
	
	public void fight(Animal animal1,Animal animal2)
	{
		if(animal1.getAnimalType()=="CARNIVOROUS")
		{
			if(animal2.getAnimalType()=="CARNIVOROUS")
			{
				System.out.print("NO FIGHT!!");
			}
			
			if(animal2.getAnimalType()=="HERBIVORES")
			{
				int energyLevel1=animal1.getEnergyLevel();
				//int hungerLevel1=animal1.getHungerLevel();
				int energyLevel2=animal2.getEnergyLevel();
				//int hungerLevel2=animal2.getHungerLevel();
				if(energyLevel1 > energyLevel2)
				{
					System.out.print("ANIMAL1 WON!!");
				}
				else
				{
						System.out.print("ANIMAL2 WON!!");
				}
			}
		}
		
		if(animal1.getAnimalType()=="HERBIVORES")
		{
			if(animal2.getAnimalType()=="HERBIVORES")
			{
				System.out.print("NO FIGHT!!");
			}
			
			if(animal2.getAnimalType()=="CARNIVOROUS")
			{
				int energyLevel1=animal1.getEnergyLevel();
				//hungerLevel1=animal1.getHungerLevel();
				int energyLevel2=animal2.getEnergyLevel();
				//hungerLevel2=animal2.getHungerLevel();
				if(energyLevel1 > energyLevel2)
				{
					System.out.print("ANIMAL1 WON!!");
				}
				else
				{
						System.out.print("ANIMAL2 WON!!");
				}
			}
		}
	}
		
	
}