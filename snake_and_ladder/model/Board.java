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
		setSnakesNLadders();
	}
	public void setSnakesNLadders()
	{
		cellV.setSnakes(snakes);
		cellV.setLadders(ladders);
		int l=0,k=0,h=1,t=1,u=1,b=1;
		for(int p=0;p<cells.size();p++)
		{

				for(int i=0;i<3;i++)
				{
					if(cells.get(p).getNum()==snakes.get(i).getHead())
					{
						k=1;
						break;
					}
					else if(cells.get(p).getNum()==snakes.get(i).getTail())
					{
						k=2;
						break;
					}
					else if(cells.get(p).getNum()==ladders.get(i).getTop())
					{
						k=3;
						break;
					}
					else if(cells.get(p).getNum()==ladders.get(i).getBottom())
					{
						k=4;
						break;
					}
					else
					{
						k=5;
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
						System.out.print(cells.get(p).getNum()+"U"+u+"\t");
						l++;
						u++;
					}
					else if(k==4)
					{
						System.out.print(cells.get(p).getNum()+"B"+b+"\t");
						l++;
						b++;
					}
					else if(k==5)
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
