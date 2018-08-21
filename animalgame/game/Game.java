package com.lxisoft.animalgame.game;

import com.lxisoft.animalgame.forest.Forest;
import com.lxisoft.animalgame.forest.SetForest;
import com.lxisoft.animalgame.forest.animals.Animal;
import com.lxisoft.animalgame.forest.animals.carnivores.Tiger;
import com.lxisoft.animalgame.forest.animals.herbivores.Rabbit;
import java.util.*;


public class Game
{
	Animal animal;
	Tiger tiger = new Tiger();
	Rabbit rabbit = new Rabbit();
	SetForest setforest = new SetForest();
	Scanner scan = new Scanner(System.in);
	
	
	public void gameDetail()
	{
		setforest.forestControl();
		setforest.animalLocation(tiger);
		setforest.animalLocation(rabbit);
		setforest.forestInfo();
		
		
	}
	
}