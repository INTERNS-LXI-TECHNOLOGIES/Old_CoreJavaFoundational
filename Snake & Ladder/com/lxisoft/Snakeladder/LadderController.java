package com.lxisoft.Snakeladder;
import java.util.*;
public class LadderController
{
	public ArrayList<Ladder> ladders=new ArrayList<Ladder>();
	private ArrayList<Integer> ladderTemp=new ArrayList<Integer>();
	SnakeController scr=new SnakeController();

	public void createLadder()
	{
		int noOfLadders=(int)(Math.random()*3)+2;

		for(int i=0;i<noOfLadders;i++)
		{
			Ladder l=new Ladder();
			//boolean check=false;
			int check=0;
			do
			{
				int ladderStartPosition=(int)(Math.random()*15)+30;
				//ladderTemp.add(ladderStartPosition);
				//System.out.println("ladderStartPosition:"+ladderStartPosition);
				int ladderEndPosition=(int)(Math.random()*35)+55;
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
				for(int k=0;k<ladderTemp.size();k++)
				{
					//System.out.println("LT :"+ladderTemp.get(k));
					if(ladderTemp.get(k)==ladderStartPosition||ladderTemp.get(k)==ladderEndPosition)
					{
						check= 1;
						break;
					}
					else
					{
						for(int s=0;s<scr.snakeTemp.size();s++)
						{
							System.out.println("Snake starting"+scr.snakes.get(s).getSnakeStartPosition());
							System.out.println("Snake ending"+scr.snakes.get(s).getSnakeEndPosition());
							if(ladderTemp.get(k)==scr.snakes.get(s).getSnakeStartPosition()||ladderTemp.get(k)==scr.snakes.get(s).getSnakeEndPosition())
							{
								check=1;
								break;
							}
							else
							{
								check=0;
							}
						}
						//check= 0;
					}

				}

				//ladderTemp.get(k)==scr.snakes.get(k).getSnakeStartPosition()||ladderTemp.get(k)==scr.snakes.get(k).getSnakeEndPosition()
				//System.out.println("CHECK: "+check);
				if(check==0)
				{
					ladderTemp.add(ladderStartPosition);
					ladderTemp.add(ladderEndPosition);
					l.setLadderStartPosition(ladderStartPosition);
					//System.out.println("Ladder Created(Start): "+l.getLadderStartPosition());
					l.setLadderEndPosition(ladderEndPosition);
					//System.out.println("Ladder Created (End) : "+l.getLadderEndPosition());
				}
			}while(check==1);
			ladders.add(l);
			System.out.println("Ladder Created : "+l.getLadderStartPosition()+":"+l.getLadderEndPosition());
		}
	} 
	

	/*public int checking(int ladderStartPosition,int ladderEndPosition)
	{
		System.out.println(ladderTemp);
		for(Integer a:ladderTemp)
		{
			System.out.println("AAA : "+a);
			if(a==ladderStartPosition||a==ladderEndPosition)
			{
				return 1;
			}
			else
			{
				return 0;
			}
		}
		return 0;
	}*/
}