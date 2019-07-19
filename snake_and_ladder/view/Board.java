package com.lxisoft.snake_and_ladder.view;
import java.util.*;
public class Board
{
	Cell cell;
	public ArrayList <Cell> cells;
	public ArrayList<Snake> snakes;
	public ArrayList <Ladder> ladders;
	public Board()
	{
		cells=new ArrayList<Cell>();
		snakes=new ArrayList<Snake>();
		ladders=new ArrayList<Ladder>();
	}
	public void setBoard()
	{
		cell=new Cell();
		cell.setCell(cells);
		//System.out.println(cells.size());
		/*for(int p=0;p<cells.size();p++)
		{
		System.out.println(cells.get(p).getNum());
		}*/
		setSnakesNLadders();
	}
	public void setSnakesNLadders()
	{
		cell.setSnakesAndLadders(snakes,ladders);
		int l=0,k=0,h=0,t=0,u=0,b=0;
		for(int p=0;p<cells.size();p++)
		{
				for(int i=0;i<3;i++)
				{
					if(cells.get(p).getNum()==snakes.get(i).getHead())
					{
						k=1;
						h++;
						break;
					}
					else if(cells.get(p).getNum()==snakes.get(i).getTail())
					{
						k=2;
						t++;
						break;
					}
					else if(cells.get(p).getNum()==ladders.get(i).getTop())
					{
						k=3;
						u++;
						break;
					}
					else if(cells.get(p).getNum()==ladders.get(i).getBottom())
					{
						k=4;
						b++;
						break;
					}
					else
					{
						k=5;
					}
				}
				int num=cells.get(p).getNum();
				displayBoard(k,num,h,t,u,b);
					l++;
					if(l==10)
					{
						System.out.println("\n");
						l=0;
					}
		}
	}
	public void displayBoard(int k,int num,int h,int t,int u,int b)
	{
					if(k==1)
					{
						System.out.print(num+"H"+h+"\t");
					}
					else if(k==2)
					{
						System.out.print(num+"T"+t+"\t");
					}
					else if(k==3)
					{
						System.out.print(num+"U"+u+"\t");
					}
					else if(k==4)
					{
						System.out.print(num+"B"+b+"\t");
					}
					else if(k==5)
					{
						System.out.print(num+"\t");
					}
	}
}
