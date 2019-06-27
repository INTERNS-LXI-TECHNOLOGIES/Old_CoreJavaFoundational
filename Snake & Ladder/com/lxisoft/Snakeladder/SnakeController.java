package com.lxisoft.Snakeladder;
import java.util.*;

public class SnakeController
{
	public static ArrayList<Snake> snakes=new ArrayList<Snake>();
	private ArrayList<Integer> snakeTemp=new ArrayList<Integer>();
	//BoardModel board=new BoardModel();
		
	public void createSnake()
	{
		int noOfSnakes = (int)(Math.random()*3)+2;
		
		for(int i=1;i<=noOfSnakes;i++)
		{
			Snake s=new Snake();
			boolean check=false;
			do
			{
				int snakeStartPosition=(int)(Math.random()*46)+40;
				//System.out.println("Start Position: "+snakeStartPosition);
				snakeTemp.add(snakeStartPosition);
				int snakeEndPosition=(int)(Math.random()*20)+15;
				//System.out.println("End Position: "+snakeEndPosition);
				snakeTemp.add(snakeEndPosition);
				check=checking(snakeStartPosition,snakeEndPosition);
				if(check==false)
				{
					s.setSnakeStartPosition(snakeStartPosition);
					s.setSnakeEndPosition(snakeEndPosition);
				}
			}while(check);
			snakes.add(s);
			System.out.println("Snake Created : "+s.getSnakeStartPosition()+":"+s.getSnakeEndPosition());
		}

	}
	public boolean checking(int snakeStartPosition,int snakeEndPosition)
	{
		for(Integer a : snakeTemp)
				{
					if(a==snakeStartPosition||a==snakeEndPosition)
					{
						return true;
					}
					else
					{
						return false;
					}
				}
				return false;
	}
}


/*for(Integer a : snakeTemp)
				{
					if(a==snakeStartPosition||a==snakeEndPosition)
					{
						check = true;
						break;
					}
					else
					{
						check = false;
						s.setSnakeStartPosition(snakeStartPosition);
						s.setSnakeEndPosition(snakeEndPosition);
					}
				}*/
				//check =checking(s.snakeStartPosition,s.snakeEndPosition);
				
				// s.setSnakeStartPosition((int)(Math.random()*90)+40);
				// s.setSnakeEndPosition((int)(Math.random()*50)+15);
				// //check=checking(s.snakeStartPosition,s.snakeEndPosition);
				// check=checking(s);