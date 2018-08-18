package com.lxisoft.animalgame.game;
import java.util.*;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.ForestSettings;
import com.lxisoft.animalgame.game.forest.animals.Animals;
public class AnimalGame
{
	Animals animal;
	ForestSettings forestDetail=new ForestSettings();
	Scanner scan=new Scanner(System.in);
	public void gameDetails()
	{
		forestDetail.setForest();
		forestDetail.setAnimalLocation(animal);
		forestDetail.setForestStatus();
	}
}