package com.snakeandladder;

import java.util.ArrayList;
public class Snake
{
	private int start;
	private int end;	
	public boolean equals(Snake snake)
	{

		if(snake.getStart() == this.getEnd()) return true;

		return false;
	}

	public int getStart()
	{
		return start;
	}

	public void setStart(int start)
	{
		this.start = start;
	}

	public int getEnd() 
	{
		return end;
	}

	public void setEnd(int end)
	{
		this.end = end;
	}

	
	//BoardModel board=new BoardModel();

}
