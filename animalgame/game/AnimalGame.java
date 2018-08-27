package com.lxisoft.animalgame.game;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Lion;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Tiger;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Deer;
import com.lxisoft.animalgame.game.forest.animal.herbivorous.Zebra;

import com.lxisoft.animalgame.game.forest.ForestSettings;
import java.util.*;

public class AnimalGame
{
	Animal animal;
	Lion lion=new Lion();
	Tiger tiger=new Tiger();
	Deer deer=new Deer();
	Zebra zebra=new Zebra();
	ForestSettings forestdetail=new ForestSettings();
	Scanner scan=new Scanner(System.in);
	
	public void gameDetails()
	{
		forestdetail.setForest();
		lion.create();
		tiger.create();
		deer.create();
		zebra.create();
		System.out.println("\n");
        System.out.println("\t\t\t\t FOREST GRID");
		System.out.println("\n");
		
		forestdetail.setAnimalLocation(lion);
		forestdetail.setAnimalLocation(tiger);
		forestdetail.setAnimalLocation(deer);
		forestdetail.setAnimalLocation(zebra);
		
		forestdetail.setForestStatus();
	}
		
}