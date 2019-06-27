package com.lxisoft.Snakeladder;
//import com.lxisoft.Snakeladder.view.*;
import java.util.*;

/*public class Diece
{
	enum DieceSide{1,2,3,4,5,6}
}*/
public class DieceController
{  
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
	int rnd;
	Random random=new Random();
	//Board board=new Board();
	public void rollDiece() 
	{
		for(int i=1;i<=6;i++)
		{
    		int rnd = new Random().nextInt(6)+1;
    		System.out.print(rnd);
    	}
    	//return rnd;
    	System.out.print(rnd);
    }
}


/*	DieceController dieceController=new DieceController();
	public void posMov()
	{
		for(int i=0;i<100;i++)
		{
		int rnd=dieceController.rollDiece();
		System.out.println("Diece value:"+rnd);
		if(rnd==6)

		{
		pos=pos+rnd;
		for(int j=0;j<10;j++)
		{
			int rnd1=dieceController.rollDiece();
			pos=pos+rnd1;
		System.out.println("Position "+pos);
		}}
		else{}
		}
	}*/
	