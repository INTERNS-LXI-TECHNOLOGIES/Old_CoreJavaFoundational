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
			   int a,b,c,d,g =0;
		  do{	
			   a =(int)(Math.random() *100);
			   b =(int)(Math.random() *100);
			   c =(int)(Math.random() *100);
			   d =(int)(Math.random() *100);
			   System.out.println("a:"+a);  
			   System.out.println("b:"+b);  
			   System.out.println("c:"+c);  
			   System.out.println("d:"+d); 
			   System.out.println("                 "); 
               if(b>a)
				{
					int s=a;
					int n=b;
					    b=s;
						a=n;
						System.out.println("AAAAAAAAAAAAAAAAAAA  a="+a);
						System.out.println("BBBBBBBBBBBBBBBBBBB  b="+b);
				}
				else
				{
			        System.out.println("aaaaaaaaaaaaaaaa  a="+a);
			        System.out.println("bbbbbbbbbbbbbbbb  b="+b);
				} 
                if(c>d)
				{
					int l=c;
					int m=d;
					    d=l;
						c=m;
					System.out.println("CCCCCCCCCCCCCCCCCCCC c="+c);
					System.out.println("DDDDDDDDDDDDDDDDDDDD d="+d);
				}
				else
				{
					System.out.println("ccccccccccc="+c);
					System.out.println("ddddddddddddddd="+d);
				}
				if(value.size()<=0){
						value.add(a);
						value.add(b);
						value.add(c);
						value.add(d);
				}
			   for(int v=0;v<value.size();v++)
				{					
					if(value.get(v)==a||value.get(v)==b||value.get(v)==c||value.get(v)==d)
					{
						checking=true;
						break;
					} 
					else
					{
						checking = false;
				    }
				}
				if(checking== false)
				{
						value.add(a);
						value.add(b);
						value.add(c);
						value.add(d);
						checking = false;
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
			 g++;
            }
			//System.out.println("");
				createBoard();
				for(int j=0;j<snakes.size();j++)
			{
			     System.out.println("\n\nladder S"+ladders.get(j).getStartPosition()+"  ladder E"+ladders.get(j).getEndPosition()+"\n");
			     System.out.println("\n\nsnake H"+snakes.get(j).getHead()+"  snake T"+snakes.get(j).getTail()+"\n");
			}
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
						for(int m=0;m<players.size();m++)
						{
							if(snakes.get(k).getHead()==players.get(m).getPosition())
							{
								players.get(m).setPosition(snakes.get(k).getTail());
								//System.out.println(snakes.get(k).getTail()+""+players.get(m).getName());
							}
						}
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
					for(int m=0;m<players.size();m++)
						{
							if(ladders.get(k).getStartPosition()==players.get(m).getPosition())
							{
							   players.get(m).setPosition(ladders.get(k).getEndPosition());
							   if(a==players.get(m).getPosition())
							   {
							    System.out.print(a+""+players.get(m).getName());
							   }
							}
						}
				    }
				    else if(a==ladders.get(k).getEndPosition())
					{
						z=a;
						System.out.print(a+"|e"+(k+1)+"|"+"\t");
					}
					
					else if(a==players.get(k).getPosition())
					{
						System.out.print(players.get(k).getName());
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
						for(int m=0;m<players.size();m++)
						{
							if(snakes.get(k).getHead()==players.get(m).getPosition())
							{
								players.get(m).setPosition(snakes.get(k).getTail());
								//System.out.println(snakes.get(k).getTail()+""+players.get(m).getName());
							}
						}
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
					for(int m=0;m<players.size();m++)
						{
							if(ladders.get(k).getStartPosition()==players.get(m).getPosition())
							{
								 players.get(m).setPosition(ladders.get(k).getEndPosition());
							  if(a==players.get(m).getPosition())
							   {
								  System.out.print(a+""+players.get(m).getName());
							   }
							}
						}
				     }
					else if(a==ladders.get(k).getEndPosition())
					{
						System.out.print(a+"|e"+(k+1)+"|"+"\t");
						z=a;
					}
					else if(a==players.get(k).getPosition())
					{
						System.out.print(players.get(k).getName());
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
	}
}