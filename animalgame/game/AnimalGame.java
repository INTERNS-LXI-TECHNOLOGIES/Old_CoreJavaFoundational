package com.lxisoft.animalgame.game;
import java.util.*;
import com.lxisoft.animalgame.game.forest.animals.carnivores.lion.Lion;
import com.lxisoft.animalgame.game.forest.animals.carnivores.tiger.Tiger;
import com.lxisoft.animalgame.game.forest.animals.herbivores.elephant.Elephant;
import com.lxisoft.animalgame.game.forest.animals.herbivores.deer.Deer;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.ForestSettings;
import com.lxisoft.animalgame.game.forest.animals.Animals;
public class AnimalGame
{
	Animals animal;
	public Lion lion=new Lion();
	Tiger tiger=new Tiger();
	Elephant elephant=new Elephant();
	Deer deer=new Deer();
	ForestSettings forestDetail=new ForestSettings();
	Scanner scan=new Scanner(System.in);
	public void gameDetails()
	{
		forestDetail.setForest();
		forestDetail.setAnimalLocation(lion);
		forestDetail.setAnimalLocation(tiger);
		forestDetail.setAnimalLocation(elephant);
		forestDetail.setAnimalLocation(deer);
		forestDetail.setForestStatus();
		forestDetail.locateAnimal();
	}

	
}