package com.lxisoft.game.model;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for Dice
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:01/07/2019
*/
public class Dice
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Dice.class.getName());
	
	private int diceNumber;
	
	public int getRandomDiceNumber()
	{
		diceNumber=(int)(Math.random()*6);
		return diceNumber;
	}
}