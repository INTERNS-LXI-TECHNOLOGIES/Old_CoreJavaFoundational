package com.lxisoft.snake_and_ladder.view;
import java.util.*;
public class Board
{
	public ArrayList <Cell> cells;
	public ArrayList<Snake> snakes;
	public ArrayList <Ladder> ladders;
	public ArrayList<Integer> cellNos;
	public Board()
	{
		cells=new ArrayList<Cell>();
		snakes=new ArrayList<Snake>();
		ladders=new ArrayList<Ladder>();
		cellNos=new ArrayList<Integer>();
	}
	public void setCell()
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
		//System.out.println(cells.size());
		/*for(int p=0;p<cells.size();p++)
		{
		System.out.println(cells.get(p).getNum());
		}*/
		setSnakesNLadders();
	}
	public void setSnakesNLadders()
	{
		Cell cell=new Cell();
		cell.setSnakesAndLadders(snakes,ladders,cellNos);
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
