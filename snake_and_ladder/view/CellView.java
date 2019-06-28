package com.lxisoft.snake_and_ladder.view;
import com.lxisoft.snake_and_ladder.controller.*;
import com.lxisoft.snake_and_ladder.model.*;
import java.util.*;
public class CellView
{
	CellController cellC;
	ArrayList <Integer> cellNos;
	ArrayList <Integer> c;
	ArrayList <Integer> cellNs;
	ArrayList <Integer> c1;
	public CellView()
	{
		cellC=new CellController();
		cellNos=new ArrayList<Integer>();
		c=new ArrayList<Integer>();
		cellNs=new ArrayList<Integer>();
		c1=new ArrayList<Integer>();
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
				System.out.print(k+"\t");
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
				System.out.print(j+"\t");
				Cell cell=new Cell(j);
				cells.add(cell);
				m=j-1;
				}
				n=n-1;
			}
			System.out.println("\n");
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
	public void setSnake(ArrayList <Snake> snakes)
	{
		int f=0;
		while(cellNos.size()<6)
		{

			int cellNo=(int)(Math.random()*100);
			
			for(int j=0;j<c.size();j++)
			{
			if(c.get(j)!=cellNo&&cellNo!=0)
			{
			f=1;
			}
			}
			if(f==1)
			cellNos.add(cellNo);
			c.add(cellNo);
			
		}
		System.out.println(cellNos);
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
	public void setLadder(ArrayList <Ladder> ladders)
	{
		int f=0;
		while(cellNs.size()<6)
		{

			int cellN=(int)(Math.random()*100);
			
			for(int j=0;j<c.size();j++)
			{
			if(c.get(j)!=cellN&&cellN!=0)
			{
			for(int k=0;k<cellNos.size();k++)
			{
			if(cellN!=cellNos.get(k))
			f=1;
			}
			}
			}
			if(f==1)
			cellNs.add(cellN);
			c1.add(cellN);
			
		}
		System.out.println(cellNs);
		for(int j=0;j<6;j=j+2)
		{
			int k=j+1;
			
			if(cellNs.get(j)>cellNs.get(k))
			{
				Ladder ladder =new Ladder();
				ladder.setTop(cellNs.get(j));
				ladder.setBottom(cellNs.get(k));
				ladders.add(ladder);
			}
			else
			{
				Ladder ladder =new Ladder();
				ladder.setBottom(cellNs.get(j));
				ladder.setTop(cellNs.get(k));
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
	