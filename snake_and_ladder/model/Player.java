package com.lxisoft.snake_and_ladder.model;
import com.lxisoft.snake_and_ladder.view.*;
import java.util.*;
public class Player
{
	private String name;
	private String coin;
	private int position;
	Scanner scan=new Scanner(System.in);
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCoin(String coin)
	{
		this.coin=coin;
	}
	public String getCoin()
	{
		return coin;
	}
	public void setPosition(int position)
	{
		this.position=position;
	}
	public int getPosition()
	{
		return position;
	}
	/*public Player()
	{
		currentPos=new int[10];
	}*/
	public void playGame(Dice dice,ArrayList <Player> players,Board board )
	{	
		for(int i=0;i<players.size();i++)
		{
			int v=0;
		players.get(i).setPosition(v);
		}
	
		
		for(int i=0;i<players.size();i++)
		{
		System.out.println(players.get(i).name+"'s turn");
		System.out.println(dice.diceThrow());
		
			if((players.get(i).getPosition()==0)&&(dice.diceThrow()==1))
			{
				int p1=1;
				players.get(i).setPosition(p1);
				System.out.println(players.get(i).getPosition());
			}
			else if((players.get(i).getPosition()>0)&&(dice.diceThrow()>0))
			{
					int p2=players.get(i).getPosition()+dice.diceThrow();
					players.get(i).setPosition(p2);
					System.out.println(players.get(i).getPosition());
					/*for(int k=0;k<board.cells.size();k++)
					{
					board.cells.get(k).setNum(position);
					}*/
			}
	
		}
		
		
		
	}
}