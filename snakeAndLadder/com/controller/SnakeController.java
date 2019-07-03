package com.controller;
import java.util.ArrayList;
import com.model.*;

public class SnakeController
{
	public ArrayList<SnakeModel> snakes=new ArrayList<SnakeModel>();
	public ArrayList<Integer> snake=new ArrayList<Integer>();
	//BoardModel board=new BoardModel();
	
	public void setSnake()
	{
		int numberOfSnakes=(int)(Math.random()*3)+2;

		for(int i=0;i<numberOfSnakes;i++)
		{
			SnakeModel s=new SnakeModel();
			int check=0;
			do
			{
				int snakeStart=(int)(Math.random()*15)+30;
				//System.out.println("snkae ##:"+snakeStart);
				int snakeEnd=(int)(Math.random()*35)+55;
				//System.out.println("snake ** :"+snakeEnd);
				for(int k=0;k<snake.size();k++)
				{
			
					if(snake.get(k)==snakeStart||snake.get(k)==snakeEnd)
					{
						check= 1;
						break;
					}
					
				}
				if(check==0)
				{
					snake.add(snakeStart);
					snake.add(snakeEnd);
					s.setStart(snakeStart);
					s.setEnd(snakeEnd);
				}
			}while(check==1);
			snakes.add(s);
			System.out.println("snake is on : "+s.getStart()+":"+s.getEnd());
		}
	} 	
	}

