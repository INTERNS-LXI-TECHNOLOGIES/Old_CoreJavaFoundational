package com.lxisoft.animalgame.test;
import com.lxisoft.animalgame.game.AnimalGame;
import com.lxisoft.animalgame.game.forest.Forest;
import com.lxisoft.animalgame.game.forest.ForestSettings;
import com.lxisoft.animalgame.game.forest.animals.Animals;

public class Tdd
{
	public static void main(String args[])
	{

		AnimalGame fetch=new AnimalGame();
		fetch.gameDetails();
		fetch.startGame();
	}

}