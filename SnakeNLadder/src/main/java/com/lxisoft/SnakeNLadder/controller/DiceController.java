package com.lxisoft.SnakeNLadder.controller;
import java.util.Random;
public class DiceController{
	public enum Dice{ 
		ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);
		private int side;
		private Dice(int side){
			this.side = side;
	}
	public int getDiceValue(){
		return side;
	}
	}
	private static final Dice[] dices = Dice.values();
	public static int rollDice(){
		Random r = new Random();
		return dices[r.nextInt(dices.length)].getDiceValue();
	}
}