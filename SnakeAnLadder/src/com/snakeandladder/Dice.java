package com.snakeandladder;

import java.util.Random;

public class Dice
{
	private int side;
	private int number;
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public enum DiceThrow
	{ 
		
		ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);
		
		private int side;
		DiceThrow(int side)
		{
			this.side = side;
		}
		public int setDiceValue() {
			// TODO Auto-generated method stub
			return side;
		}
		
	}
	
	private static final DiceThrow[] dices = DiceThrow.values();
	public static int roll(){
		Random r = new Random();
		int v=dices[r.nextInt(dices.length)].setDiceValue();
		//System.out.print(v);
		return v;
		
	}
	
}
