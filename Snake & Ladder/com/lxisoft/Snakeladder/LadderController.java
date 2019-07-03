package com.lxisoft.Snakeladder;
import java.util.*;
public class LadderController
{
	public ArrayList<Ladder> ladders=new ArrayList<Ladder>();
	private ArrayList<Integer> ladderTemp=new ArrayList<Integer>();
	SnakeController scr=new SnakeController();

	public LadderController(SnakeController snc) 
	{
		this.scr = snc;
	}
	public void createLadder()
	{
		//System.out.println("IN ladder controller "+scr.snakes.size());
		int noOfLadders=(int)(Math.random()*3)+2;
		System.out.println("Ladder Number : "+noOfLadders);

		for(int i=0;i<noOfLadders;i++)
		{
			Ladder l=new Ladder();
			//boolean check=false;
			int check=0;
			int ladderStartPosition=0;
			int ladderEndPosition=0;
			ladderTemp.add(ladderStartPosition);
			ladderTemp.add(ladderEndPosition);
			do
			{
				ladderStartPosition=(int)(Math.random()*15)+30;
				ladderEndPosition=(int)(Math.random()*35)+55;
				// System.out.println("ladderStartPosition :"+ladderStartPosition);
				// System.out.println("ladderEndPosition :"+ladderEndPosition);
				for(int k=0;k<ladderTemp.size();k++)
				{
					if(ladderTemp.get(k)==ladderStartPosition||ladderTemp.get(k)==ladderEndPosition)
					{
						check= 1;
						break;
					}
					else
					{
						//System.out.println("Enter ladder to snake for checking");
						for(int s=0;s<scr.snakes.size();s++)
						{
							// System.out.println("Enter ladder in SNAKE");
							// System.out.println("CHECK WITH "+ladderTemp.get(k));
							// System.out.println("Snake starting"+scr.snakes.get(s).getSnakeStartPosition());
							// System.out.println("Snake ending"+scr.snakes.get(s).getSnakeEndPosition());
							if(ladderStartPosition==scr.snakes.get(s).getSnakeStartPosition()||ladderStartPosition==scr.snakes.get(s).getSnakeEndPosition()||
								ladderEndPosition==scr.snakes.get(s).getSnakeStartPosition()||ladderEndPosition==scr.snakes.get(s).getSnakeEndPosition())
							{
								//System.out.println("Same number for both");
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
					ladderTemp.add(ladderStartPosition);
					ladderTemp.add(ladderEndPosition);
					l.setLadderStartPosition(ladderStartPosition);
					l.setLadderEndPosition(ladderEndPosition);
				}
			}while(check==1);
			ladders.add(l);
			System.out.println("Ladder Created : "+l.getLadderStartPosition()+":"+l.getLadderEndPosition());
		}
	} 
}