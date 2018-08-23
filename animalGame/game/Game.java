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
	Lion lion=new Lion();
	
	Tiger tiger=new Tiger();
	Rabbit rabbit=new Rabbit();
	Deer deer=new Deer();

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
	
		
	
}