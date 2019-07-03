package com.controller;
import java.util.ArrayList;
import com.model.*;
public class LadderController
{

	public ArrayList<Ladder> ladders=new ArrayList<Ladder>();
	public ArrayList<Integer> lader=new ArrayList<Integer>();
	SnakeController sc=new SnakeController();

	public void setLadder()
	{
		int numberOfLadders=(int)(Math.random()*4)+2;

		for(int i=0;i<numberOfLadders;i++)
		{
			Ladder l=new Ladder();
			int check=0;
			do
			{
				int ladderStart=(int)(Math.random()*10)+20;
				//System.out.println("ladder##:"+ladderStart);
				int ladderEnd=(int)(Math.random()*25)+50;
				//System.out.println("ladder** :"+ladderEnd);
				//System.out.print("&&&&&&&&&&"+lader.size());
				for(int j=0;j<lader.size();j++)
				{
					if(lader.get(j)==ladderStart||lader.get(j)==ladderEnd)
					{
						check= 1;
						break;
					}
					else
					{
						for(int s=0;s<sc.snake.size();s++)
						{
							/*
							 * System.out.println("Snake starting"+sc.snakes.get(s).getStart());
							 * System.out.println("Snake ending"+sc.snakes.get(s).getEnd());
							 */
							if(lader.get(i)==sc.snakes.get(s).getStart()||lader.get(i)==sc.snakes.get(s).getEnd())
							{
								check=1;
								break;
							}
							else
							{
								check=0;
							}
						}
					}

				}

				if(check==0)
				{
					lader.add(ladderStart);
					lader.add(ladderEnd);
					l.setStart(ladderStart);
					l.setEnd(ladderEnd);
				}
			}while(check==1);
			ladders.add(l);
			System.out.println("Lader is in : "+l.getStart()+":"+l.getEnd());
		}
	} 
}


