package com.lxisoft.animalGame.game;
import com.lxisoft.animalGame.game.animal.Animal;
import com.lxisoft.animalGame.game.forest.ForestControl;
import com.lxisoft.animalGame.game.animal.carnivorous.Lion;
import com.lxisoft.animalGame.game.animal.carnivorous.Tiger;
public class AnimalGame
{   Lion lion=new Lion();
	Tiger tiger=new Tiger();
	ForestControl forest=new ForestControl();
	public void gaming()
	{
		forest.setForest();
		forest.setAnimalLocation(lion);
		forest.getForeststatus();
		tiger.eat();
		lion.eat();
		
	}
	
	
}