package com.controller;
import java.util.HashMap;
import java.util.Map;

import com.model.SnakeModel;
import com.view.BoardView;
public class BoardController
{
	PlayerController pc=new PlayerController(); 
	GameController gc=new GameController();
	SnakeController sc=new SnakeController();
	LadderController lc= new LadderController();
	BoardView bview=new BoardView();
	public void setSnakeAndLadder()
	{
	int a=100;
	int b = 0;
	int c=0;
	
	sc.setSnake();
	lc.setLadder();
	System.out.print("@@@@@"+sc.snake.size());
			for(int i=0;i<10;i++)
			{
				System.out.println("\n");
				for(int k=0;k<sc.snakes.size();k++)
				{
					if(a==sc.snakes.get(k).getStart())
					{
					c=a;
					System.out.print(a+"{"+(k+1)+"}"+"\t");
					}
					else if(a==sc.snakes.get(k).getEnd())
					{
						System.out.print(a+"{"+(k+1)+"}"+"\t");
						c=a;
					}
					else if(a==lc.ladders.get(k).getStart())
				    {
					c=a;
					System.out.print(a+"|s"+(k+1)+"|"+"\t");
				    }
				    else if(a==lc.ladders.get(k).getEnd())
					{
						c=a;
						System.out.print(a+"|e"+(k+1)+"|"+"\t");
					}
				}
			   if(a!=c)
				{
				System.out.print(a+"\t");
				}
				
				
				for(int j=0;j<9;j++)
				{
					if(b%10==1)
					{
						a++;
					}
					
					else
					{
						a--;
					}
				
				
				
				for(int k=0;k<sc.snakes.size();k++)
				{
					if(a==sc.snakes.get(k).getStart())
					{
						System.out.print(a+"{h"+(k+1)+"}"+"\t");
						c=a;
					}
					else if(a==sc.snakes.get(k).getEnd())
					{
						c=a;
						System.out.print(a+"{t"+(k+1)+"}"+"\t");
					}
					else if(a==lc.ladders.get(k).getStart())
				     {
				    System.out.print(a+"|s"+(k+1)+"|"+"\t");
					c=a;
				     }
					else if(a==lc.ladders.get(k).getEnd())
					{
						System.out.print(a+"|e"+(k+1)+"|"+"\t");
						c=a;
					}
					}
					if(a!=c)
					{
					System.out.print(a+"\t");
					}
			}
		a=a-10;
		b=a;
		}
		}
}