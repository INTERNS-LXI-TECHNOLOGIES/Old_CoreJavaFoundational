package com.lxisoft.snake_and_ladder.view;
import java.util.*;
public class Cell
{
	private int num;
	ArrayList<Integer> cellNos;
	Set <Integer> c;
	public void setNum(int num)
	{
		this.num=num;
	}
	public int getNum()
	{
		return num;
	}
	public Cell(int num)
	{
		this.num=num;
	}
	public Cell()
	{
		cellNos=new ArrayList<Integer>();
		c=new HashSet<Integer>();
	}
	public void setCell(ArrayList <Cell> cells)
	{
		int n=100;
		for(int i=1;i<=10;i++)
		{ 
			int m=n;
			if(n%2==0)
			{
				for(int k=m;k>=n-9;k=k-1)
				{
				//System.out.print(k+"\t");
				Cell cell=new Cell(k);
				cells.add(cell);
				m=k-1;
				}
				n=n-19;
			}
			else
			{
				for(int j=n;j<=n+9;j=j+1)
				{
				//System.out.print(j+"\t");
				Cell cell=new Cell(j);
				cells.add(cell);
				m=j-1;
				}
				n=n-1;
			}
			//System.out.println("\n");
		}
		//System.out.println(cells.size());
		/*int l=0;
		for(int p=0;p<cells.size();p++)
		{	
		System.out.print(cells.get(p).getNum()+"\t");
		l++;
		if(l==10){
		System.out.println("\n");
		l=0;
		}
		}*/
	}
	public void setSnakesAndLadders(ArrayList <Snake> snakes,ArrayList <Ladder> ladders)
	{
		int f=0;
		while(c.size()<12)
		{
			int cellNo=(int)(Math.random()*99+1);
			c.add(cellNo);	
		}
		Iterator<Integer> itr=c.iterator();
		while(itr.hasNext())
		{
		cellNos.add(itr.next());
		}
		System.out.println(cellNos);
		setSnakes(snakes);
		setLadders(ladders);	
	}
	public void setSnakes(ArrayList <Snake> snakes)
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
	public void setLadders(ArrayList <Ladder> ladders)
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
	