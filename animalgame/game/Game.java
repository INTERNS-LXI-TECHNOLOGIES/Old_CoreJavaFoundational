package com.lxisoft.animalgame.game;

import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.forest.SetForest;
import com.lxisoft.animalgame.forest.animals.Animal;
import com.lxisoft.animalgame.forest.animals.carnivores.Tiger;
import com.lxisoft.animalgame.forest.animals.carnivores.Fox;
import com.lxisoft.animalgame.forest.animals.herbivores.Zebra;
import com.lxisoft.animalgame.forest.animals.carnivores.Lion;
import com.lxisoft.animalgame.forest.animals.herbivores.Deer;
import com.lxisoft.animalgame.forest.animals.herbivores.Rabbit;
import java.util.*;


public class Game
{
	Animal animal;
	Tiger tiger = new Tiger();
	Rabbit rabbit = new Rabbit();
	Zebra zebra =new Zebra();
	Lion lion = new Lion();
	Fox fox = new Fox();
	Deer deer = new Deer();
	
	SetForest setforest = new SetForest();
	Scanner scan = new Scanner(System.in);
	
	
	public void gameDetail()
	{
		setforest.forestControl();
		lion.create();
		tiger.create();
		fox.create();
		rabbit.create();
		zebra.create();
		deer.create();
		
		setforest.animalLocation(tiger);
		setforest.animalLocation(rabbit);
		setforest.animalLocation(lion);
		setforest.animalLocation(zebra);
		setforest.animalLocation(fox);
		setforest.animalLocation(deer);
		setforest.forestInfo();
		
		System.out.println("--Animal Grid Created..--");
		System.out.println("Enter to play Game!!");
		
		
	}
	
}