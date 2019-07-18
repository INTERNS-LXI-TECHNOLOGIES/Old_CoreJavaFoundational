package com.lxisoft.game;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a class for Dice
*
*@author AryaVineesh
*
*@version 1.2
*
*Date Modified:18/07/2019
*/
public class Dice
{
	public Dice()
	{
		log.setLevel(Level.WARNING);
	}
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Dice.class.getName());
	
	/**
	*The number to be displayed on the dice
	*/
	private int randomDiceNumber;
	
	/**
	*This method will return a random dice number
	*
	*@return randomDiceNumber
	*/
	public int getRandomDiceNumber()
	{
		int MIN=1,MAX=7;
		randomDiceNumber=(int)(Math.random()*(MAX-MIN)+MIN);
		return randomDiceNumber;
	}
}