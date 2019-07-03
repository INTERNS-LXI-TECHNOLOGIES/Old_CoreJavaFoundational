package com.lxisoft.Snakeladder;
import java.util.*;

public class DieceController
{  
	int rnd;
	Random random=new Random();
	public int rollDiece() 
	{
		for(int i=1;i<=6;i++)
		{
    		int rnd = new Random().nextInt(6)+1;
    		return rnd;
    	}
    	return rnd;
    }
}













/*public class Diece
{
	enum DieceSide{1,2,3,4,5,6}
}*/

	// int rnd;
	// public enum DieceSide
	// { ONE(1),TWO(2),THREE(3),FOUR(4),FIVE(5),SIX(6);
	// 	int side;
	// 	private DieceSide(int side)
	// 	{
	// 		this.side=side;
	// 	}
	// 	public int getDieceValue()
	// 	{
	// 		return side;
	// 	}
	// }
