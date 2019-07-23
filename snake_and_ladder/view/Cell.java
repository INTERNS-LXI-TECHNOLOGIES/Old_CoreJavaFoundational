package com.lxisoft.snake_and_ladder.view;
import java.util.*;
public class Cell
{
	private int num;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}            
	public Cell()
	{
	}	
	public Cell(int num)
	{
		this.num=num;
	}
	public void setSnakesAndLadders(ArrayList <Snake> snakes,ArrayList <Ladder> ladders,ArrayList<Integer> cellNos)
	{
		Set <Integer> cellNums=new HashSet<Integer>();
		int f=0;
		while(cellNums.size()<12)
		{
			int cellNo=(int)(Math.random()*99+1);
			cellNums.add(cellNo);	
		}
		Iterator<Integer> itr=cellNums.iterator();
		while(itr.hasNext())
		{
		cellNos.add(itr.next());
		}
		System.out.println(cellNos);
		setSnakes(snakes,cellNos);
		setLadders(ladders,cellNos);	
	}
	public void setSnakes(ArrayList <Snake> snakes,ArrayList<Integer> cellNos)
	{
			for(int j=0;j<6;j=j+2)
			{
				int k=j+1;
				if(cellNos.get(j)>cellNos.get(k))
				{
					Snake snake=new Snake();
					snake.setHead(cellNos.get(j));
					snake.setTail(cellNos.get(k));
					snakes.add(snake);
				}
				else
				{
					Snake snake=new Snake();
					snake.setTail(cellNos.get(j));
					snake.setHead(cellNos.get(k));
					snakes.add(snake);
				}
			}
			for(int j=0;j<snakes.size();j++)
			{
			System.out.println(snakes.get(j).getHead());
			System.out.println(snakes.get(j).getTail());
			}
	}
	public void setLadders(ArrayList <Ladder> ladders,ArrayList<Integer> cellNos)
	{
			for(int j=6;j<12;j=j+2)
			{
				int k=j+1;
				if(cellNos.get(j)>cellNos.get(k))
				{
					Ladder ladder =new Ladder();
					ladder.setTop(cellNos.get(j));
					ladder.setBottom(cellNos.get(k));
					ladders.add(ladder);
				}
				else
				{
					Ladder ladder =new Ladder();
					ladder.setBottom(cellNos.get(j));
					ladder.setTop(cellNos.get(k));
					ladders.add(ladder);
				}
			}
			for(int j=0;j<ladders.size();j++)
			{
			System.out.println(ladders.get(j).getTop());
			System.out.println(ladders.get(j).getBottom());
			}
	}

}
	