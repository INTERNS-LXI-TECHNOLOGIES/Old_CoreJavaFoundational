package com.lxisoft.files;
import java.util.ArrayList;
import com.lxisoft.files.*;
import java.util.*;
public class Board
{
	private ArrayList<Integer> cells = new ArrayList<Integer>();
	ArrayList<Snake> snakes=new  ArrayList<Snake>();
	ArrayList<Ladder> ladders=new  ArrayList<Ladder>();
	ArrayList<Player> players = new ArrayList<Player>();
	
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
	public void getPlayers(ArrayList<Player> players)
	{
		this.players=players;
		
	}
	public void setSnakesAndLaddersOnTheBoard()
		{ 
		for(int i=0;i<players.size();i++)
	    {
	       System.out.println("kkkkkkkk"+players.get(i).getName()+""+players.get(i).getPosition());
        }
           ArrayList<Integer> value=new ArrayList<Integer>();
	       for(int i=0;i<4;i++)
		   {
			   boolean checking = false;
			   int a,b,c,d;
			  do{
			   a =(int)(Math.random() *100);
			   b =(int)(Math.random() *100);
			   c =(int)(Math.random() *100);
			   d =(int)(Math.random() *100);
			 for(Integer x : value)
				{
					if(x==a||x==b||x==c||x==d)
					{
						checking=true;
						break;
					} 
					else{
						value.add(a);
						value.add(b);
						value.add(c);
						value.add(d);
						checking = false;
						}
				if(b>a)
				{
					int s=a;
					    b=s;
				}
				if(d>c)
				{
					int l=c;
					d=l;
				}
				}
			  }while(checking); 
			 Snake snake=new Snake();
			 snake.setHead(a);
			 snake.setTail(b);
			 snakes.add(snake);
			 Ladder ladder=new Ladder();
			 ladder.setStartPosition(c);
			 ladder.setEndPosition(d);
			 ladders.add(ladder);
            }
				createBoard();
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
					
					else if(a==players.get(k).getPosition())
					{
						System.out.println(a+""+players.get(k).getName());
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