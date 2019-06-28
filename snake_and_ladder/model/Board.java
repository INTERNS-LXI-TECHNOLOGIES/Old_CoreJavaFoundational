package com.lxisoft.snake_and_ladder.model;
import com.lxisoft.snake_and_ladder.view.*;
import java.util.*;
public class Board
{
	CellView cellV;
	ArrayList <Cell> cells;
	ArrayList<Snake> snakes;
	ArrayList <Ladder> ladders;
	public Board()
	{
		cells=new ArrayList<Cell>();
		snakes=new ArrayList<Snake>();
		ladders=new ArrayList<Ladder>();
	}
	public void setBoard()
	{
		cellV=new CellView();
		cellV.setCell(cells);
		//System.out.println(cells.size());
		/*for(int p=0;p<cells.size();p++)
		{
		System.out.println(cells.get(p).getNum());
		}*/
		setSnakes();
		setLadders();
	}
	
	public void setSnakes()
	{
		cellV.setSnake(snakes);
		int l=0,k=0,h=1,t=1;
				for(int p=0;p<cells.size();p++)
				{

					for(int i=0;i<snakes.size();i++)
					{
					if(cells.get(p).getNum()==snakes.get(i).getHead())
					{
						//System.out.print(cells.get(p).getNum()+"H"+(i+1)+"\t");
						//l++;
						k=1;
						break;
					}
					else if(cells.get(p).getNum()==snakes.get(i).getTail())
					{
						//System.out.print(cells.get(p).getNum()+"T"+(i+1)+"\t");
						//l++;
						k=2;
						break;
					}
					else
					{
						//System.out.print(cells.get(p).getNum()+"\t");
						//l++;
						k=3;
					}
					}
					if(k==1)
					{
						System.out.print(cells.get(p).getNum()+"H"+h+"\t");
						l++;
						h++;
					}
					else if(k==2)
					{
						System.out.print(cells.get(p).getNum()+"T"+t+"\t");
						l++;
						t++;
					}
					else if(k==3)
					{
						System.out.print(cells.get(p).getNum()+"\t");
						l++;
					}
					if(l==10)
					{
						System.out.println("\n");
						l=0;
					}
	
				}
					
	}
	public void setLadders()
	{
		cellV.setLadder(ladders);
		int l=0,k=0,h=1,t=1;
				for(int p=0;p<cells.size();p++)
				{

					for(int i=0;i<ladders.size();i++)
					{
					if(cells.get(p).getNum()==ladders.get(i).getTop())
					{
						k=1;
						break;
					}
					else if(cells.get(p).getNum()==ladders.get(i).getBottom())
					{
						k=2;
						break;
					}
					else
					{
						k=3;
					}
					}
					if(k==1)
					{
						System.out.print(cells.get(p).getNum()+"U"+h+"\t");
						l++;
						h++;
					}
					else if(k==2)
					{
						System.out.print(cells.get(p).getNum()+"B"+t+"\t");
						l++;
						t++;
					}
					else if(k==3)
					{
						System.out.print(cells.get(p).getNum()+"\t");
						l++;
					}
					if(l==10)
					{
						System.out.println("\n");
						l=0;
					}
	
				}
	}
}
