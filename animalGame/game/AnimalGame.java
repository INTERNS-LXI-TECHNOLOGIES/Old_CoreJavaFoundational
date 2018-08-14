package com.lxisoft.animalGame.game;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.forest.ForestControl;
import com.lxisoft.animalGame.game.animal.carnivorous.Lion;
import com.lxisoft.animalGame.game.animal.carnivorous.Tiger;
import com.lxisoft.animalGame.game.animal.herbivorous.Rabbit;
public class AnimalGame
{   Lion lion=new Lion();
	Tiger tiger=new Tiger();
	Rabbit rabbit=new Rabbit();
	ForestControl forest=new ForestControl();
	public void gaming()
	{
		forest.setForest();
	
		tiger.create();
		lion.create();
		rabbit.create();
		forest.setAnimalLocation(lion);
		forest.getForeststatus();
		forest.setAnimalLocation(tiger);
		forest.getForeststatus();
		forest.setAnimalLocation(rabbit);
		forest.getForeststatus();
		
	}
	
	
}