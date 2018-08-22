package com.lxisoft.animalgame.game;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.animal.Animal;
import  com.lxisoft.animalgame.game.forest.animal.carnivorous.Lion;
import com.lxisoft.animalgame.game.forest.ForestSettings;
import java.util.*;

public class AnimalGame
{
	Animal animal;
	Lion lion=new Lion();
	ForestSettings forestdetail=new ForestSettings();
	Scanner scan=new Scanner(System.in);
	
	public void gameDetails()
	{
		forestdetail.setForest();
		forestdetail.setAnimalLocation(lion);
		forestdetail.setForestStatus();
	}
		
}