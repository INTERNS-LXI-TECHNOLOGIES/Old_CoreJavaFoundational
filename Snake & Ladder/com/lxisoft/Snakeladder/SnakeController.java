package com.lxisoft.Snakeladder;
import java.util.*;

public class SnakeController
{
	public static ArrayList<Snake> snakes=new ArrayList<Snake>();
	public ArrayList<Integer> snakeTemp=new ArrayList<Integer>();
	//BoardModel board=new BoardModel();
	
	public void createSnake()
	{
		int noOfSnakes=(int)(Math.random()*3)+2;

		for(int i=0;i<noOfSnakes;i++)
		{
			Snake s=new Snake();
			//boolean check=false;
			int check=0;
			do
			{
				int snakeStartPosition=(int)(Math.random()*15)+30;
				//ladderTemp.add(ladderStartPosition);
				//System.out.println("ladderStartPosition:"+ladderStartPosition);
				int snakeEndPosition=(int)(Math.random()*35)+55;
				//ladderTemp.add(ladderEndPosition);
				//System.out.println("ladderEndPosition :"+ladderEndPosition);
				/*for(Integer a:ladderTemp)
				{
					if(a==ladderStartPosition||a==ladderEndPosition)
					{
						check= true;
						break;
					}
					else
					{
						check= false;
					}
				}*/
				//check=checking(ladderStartPosition,ladderEndPosition);
				for(int k=0;k<snakeTemp.size();k++)
				{
					//System.out.println("LT :"+ladderTemp.get(k));
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
				//System.out.println("CHECK: "+check);
				if(check==0)
				{
					snakeTemp.add(snakeStartPosition);
					snakeTemp.add(snakeEndPosition);
					s.setSnakeStartPosition(snakeStartPosition);
					//System.out.println("Ladder Created(Start): "+l.getLadderStartPosition());
					s.setSnakeEndPosition(snakeEndPosition);
					//System.out.println("Ladder Created (End) : "+l.getLadderEndPosition());
				}
			}while(check==1);
			snakes.add(s);
			System.out.println("Snake Created : "+s.getSnakeStartPosition()+":"+s.getSnakeEndPosition());
		}
	} 	
}
/*	public void createSnake()
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
*/

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