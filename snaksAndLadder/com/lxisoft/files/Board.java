package com.lxisoft.files;
import java.util.ArrayList;
import com.lxisoft.files.*;
import java.util.*;
public class Board
{
	private ArrayList<Integer> cells = new ArrayList<Integer>();
	ArrayList<Snake> snakes=new  ArrayList<Snake>();
	ArrayList<Ladder> ladders=new  ArrayList<Ladder>();
    public void setCells(ArrayList<Integer> cellls)
	{
		this.cells=cells;
	}
	public ArrayList<Integer> getCells()
	{
		return cells;
	}
	
    public void setSnakes(ArrayList<Snake> snakes)
	{
		this.snakes=snakes;
	}
	public ArrayList<Snake> getSnakes()
	{
		return snakes;
	}
    public void setLadders(ArrayList<Ladder> ladders)
	{
		this.ladders=ladders;
	}
	public ArrayList<Ladder> getLadders()
	{
		return ladders;
	}
	public void setSnakesAndLaddersOnTheBoard()
		{ 
           int x=0,y=0;		
	       for(int i=0;i<4;i++)
		   {
			 Snake snake=new Snake();
			 snake.setHead((int)(Math.random() *100));
			 snake.setTail((int)(Math.random() *100));
			 snakes.add(snake);
			 Ladder ladder=new Ladder();
			 ladder.setStartPosition((int)(Math.random() *100));
			 ladder.setEndPosition((int)(Math.random() *100));
			 ladders.add(ladder);
            }
				createBoard();
			/*for(int j=0;j<4;j++)
			{
	        if(snakes.get(j).getHead()!=snakes.get(j).getTail()&&ladders.get(j).getStartPosition()!=ladders.get(j).getEndPosition()&&snakes.get(j).getHead()!=ladders.get(j).getStartPosition()&&snakes.get(j).getTail()!=ladders.get(j).getEndPosition())
			{
				
			}
		
		    }*/
			
		}
	public void createBoard()
	{  
	int a=100;
	int t = 0;
	int z=0;
			for(int i=0;i<10;i++)
			{
				System.out.println("\n");
				for(int k=0;k<snakes.size();k++)
				{
					if(a==snakes.get(k).getHead())
					{
					z=a;
					System.out.print(a+"{h"+(k+1)+"}"+"\t");
					}
					else if(a==snakes.get(k).getTail())
					{
						System.out.print(a+"{t"+(k+1)+"}"+"\t");
						z=a;
					}
					else if(a==ladders.get(k).getStartPosition())
				    {
					z=a;
					System.out.print(a+"|s"+(k+1)+"|"+"\t");
				    }
				    else if(a==ladders.get(k).getEndPosition())
					{
						z=a;
						System.out.print(a+"|e"+(k+1)+"|"+"\t");
					}
				}
			   if(a!=z)
				{
				System.out.print(a+"\t");
				}
				
				
				for(int j=0;j<9;j++)
				{
					if(t%10==1)
					{
						a++;
					}
					
					else
					{
						a--;
					}
				
				
				
				for(int k=0;k<snakes.size();k++)
				{
					if(a==snakes.get(k).getHead())
					{
						System.out.print(a+"{h"+(k+1)+"}"+"\t");
						z=a;
					}
					else if(a==snakes.get(k).getTail())
					{
						z=a;
						System.out.print(a+"{t"+(k+1)+"}"+"\t");
					}
					else if(a==ladders.get(k).getStartPosition())
				     {
				    System.out.print(a+"|s"+(k+1)+"|"+"\t");
					z=a;
				     }
					else if(a==ladders.get(k).getEndPosition())
					{
						System.out.print(a+"|e"+(k+1)+"|"+"\t");
						z=a;
					}
					}
					if(a!=z)
					{
					System.out.print(a+"\t");
					}
			}
		a=a-10;
		t=a;
		}
			
			/*for(int j=0;j<ladders.size();j++)
			{
			     System.out.println("\n\nladder"+ladders.get(j).getStartPosition()+"ladder"+ladders.get(j).getEndPosition()+"\n");
			     System.out.println("\n\nsnake"+snakes.get(j).getHead()+"snakes."+snakes.get(j).getTail()+"\n");
			}*/	
	}
}