package com.lxisoft.SnakeNLadder;
import java.util.*;
/**
*This class is used Dice with a method to generate random number
*
*@author AJAY .E.S
*
*@version 1.0

*/

class Dice{
	int diceValue;
	public int dice()
	{
		Random rand=new Random();
		diceValue=rand.nextInt(6)+1;
		
		return diceValue;
	}
	
}