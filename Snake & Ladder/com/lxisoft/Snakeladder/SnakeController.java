package com.lxisoft.Snakeladder;
import java.util.*;

public class SnakeController
{
	public static ArrayList<Snake> snakes=new ArrayList<Snake>();
	public ArrayList<Integer> snakeTemp=new ArrayList<Integer>();
	public void createSnake()
	{
		int noOfSnakes=(int)(Math.random()*3)+2;

		for(int i=0;i<noOfSnakes;i++)
		{
			Snake s=new Snake();
			int check=0;
			do
			{
				int snakeStartPosition=(int)(Math.random()*15)+30;
				int snakeEndPosition=(int)(Math.random()*35)+55;
				for(int k=0;k<snakeTemp.size();k++)
				{
					if(snakeTemp.get(k)==snakeStartPosition||snakeTemp.get(k)==snakeEndPosition)
					{
						check= 1;
						break;
					}
					else
					{
						check= 0;
					}
				}
				if(check==0)
				{
					snakeTemp.add(snakeStartPosition);
					snakeTemp.add(snakeEndPosition);
					s.setSnakeStartPosition(snakeStartPosition);
					s.setSnakeEndPosition(snakeEndPosition);
				}
			}while(check==1);
			snakes.add(s);
			System.out.println("Snake Created : "+s.getSnakeStartPosition()+":"+s.getSnakeEndPosition());
		}
	} 	
}
