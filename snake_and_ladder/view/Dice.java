package com.lxisoft.snake_and_ladder.view;
public class Dice
{
	public int diceThrow()
	{
		int diceSide=(int)(Math.random()*6+1);
		return diceSide;
	}
}
