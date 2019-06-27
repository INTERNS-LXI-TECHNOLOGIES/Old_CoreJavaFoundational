package com.lxisoft.Snakeladder;
//import com.lxisoft.Snakeladder.view.*;
import java.util.*;
import java.lang.*;

public class Snake
/*{
	public int snakeStartPosition;
	public int snakeEndPosition;
}*/
{
	private int snakeStartPosition;
	private int snakeEndPosition;
	//private String snakeName;
	
	public void setSnakeStartPosition(int snakeStart)
	{
		this.snakeStartPosition=snakeStart;
	}
	public int getSnakeStartPosition()
	{
		return this.snakeStartPosition;
	}
	
	public void setSnakeEndPosition(int snakeEnd)
	{
		this.snakeEndPosition=snakeEnd;
	}
	public int getSnakeEndPosition()
	{
		return this.snakeEndPosition;
	}
	
	// public void setSnakeName(String nam)
	// {
	// 	this.snakeName=nam;
	// }
	// public String getSnakeName()
	// {
	// 	return this.snakeName;
	// }
}
/*{
	Random random=new Random();
	//Board board=new Board();
	public int getRandomSnake(int[] array) 
	{
		for(int i=0;i<random.nextInt(2)+1;i++)
		{
    		int rnd = new Random().nextInt(brd.length);
    		return brd[rnd];
    	}
	}
}*/
