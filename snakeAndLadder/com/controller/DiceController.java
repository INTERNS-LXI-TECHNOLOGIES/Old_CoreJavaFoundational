package com.controller;

import java.util.Random;

public class DiceController 
{
	
	public enum Dice
	{ 
		
		ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);
		
		private int side;
		private Dice(int side)
		{
			this.side = side;
		}
		public int setDiceValue()
		{
			// TODO Auto-generated method stub
			return side;
			
		}
		
	}
	private static final Dice[] dices = Dice.values();
	public static int roll(){
		Random r = new Random();
		int v=dices[r.nextInt(dices.length)].setDiceValue();
		System.out.print(v);
		return v;
		
	}
	}
	

