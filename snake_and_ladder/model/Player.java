package com.lxisoft.snake_and_ladder.model;
import com.lxisoft.snake_and_ladder.view.*;
import java.util.*;
public class Player
{
	private String name;
	private String coin;
	private int position;
	String c=null;
	int posn=0;
	Scanner scan=new Scanner(System.in);
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setCoin(String coin)
	{
		this.coin=coin;
	}
	public String getCoin()
	{
		return coin;
	}
	public void setPosition(int position)
	{
		this.position=position;
	}
	public int getPosition()
	{
		return position;
	}
	/*public Player()
	{
		currentPos=new int[10];
	}*/
	public void playGame(Dice dice,ArrayList <Player> players,Board board )
	{
		for(int i=0;i<players.size();i++)
		{
			int v=0;
		players.get(i).setPosition(v);
		}
	do{
		for(int i=0;i<players.size();i++)
		{
		System.out.print("Choose whose turn?");
		if((i+1)==scan.nextInt())
		{
		System.out.print(players.get(i).name+"'s turn:");
		int diceSide=dice.diceThrow();
		System.out.println(diceSide);
		if(players.get(i).getPosition()<=100)
		{
			if(players.get(i).getPosition()==0)
			{
				if(diceSide==1)
				{
				int p1=1;
				players.get(i).setPosition(p1);
				System.out.println(players.get(i).getPosition());
				for(int j=0;j<3;j++)
				{
					if(players.get(i).getPosition()==board.ladders.get(j).getBottom())
					{
						int pos=board.ladders.get(j).getTop();
						players.get(i).setPosition(pos);
						System.out.println(players.get(i).getPosition());
					}
				}
				}
			}
			else if(players.get(i).getPosition()>0)
			{
					int p2=players.get(i).getPosition()+diceSide;
					players.get(i).setPosition(p2);
					System.out.println(players.get(i).getPosition());
					
					for(int k=0;k<3;k++)
					{
					if(players.get(i).getPosition()==board.ladders.get(k).getBottom())
					{
						int pos1=board.ladders.get(k).getTop();
						players.get(i).setPosition(pos1);
						System.out.println(players.get(i).getPosition());
					}
					else if(players.get(i).getPosition()==board.snakes.get(k).getHead())
					{
						int pos2=board.snakes.get(k).getTail();
						players.get(i).setPosition(pos2);
						System.out.println(players.get(i).getPosition());
					}
					}
					if(players.get(i).getPosition()==100)
					{
						System.out.println(players.get(i).name+" Wins");
						System.out.println("Game Over");
						System.exit(0);
					}
					
					
					
			}
			int l=0,k=0,h=1,t=1,u=1,b=1;
			for(int p=0;p<board.cells.size();p++)
			{

					for(int q=0;q<3;q++)
					{
						if(board.cells.get(p).getNum()==board.snakes.get(q).getHead())
						{
							k=1;
							break;
						}
						else if(board.cells.get(p).getNum()==board.snakes.get(q).getTail())
						{
							if(players.get(i).getPosition()==board.snakes.get(q).getTail())
							{
							k=22;
							}
							else{
							k=2;
							}
							break;
						}
						else if(board.cells.get(p).getNum()==board.ladders.get(q).getTop())
						{
							if(players.get(i).getPosition()==board.ladders.get(q).getTop())
							{
							k=33;
							}
							else{
							k=3;
							}
							break;
						}
						else if(board.cells.get(p).getNum()==board.ladders.get(q).getBottom())
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
							if(posn==board.cells.get(p).getNum())
								System.out.print(c);
							System.out.print(board.cells.get(p).getNum()+"H"+h+"\t");
							l++;
							h++;
						}
						else if(k==2)
						{
							if(posn==board.cells.get(p).getNum())
								System.out.print(c);
							System.out.print(board.cells.get(p).getNum()+"T"+t+"\t");
							l++;
							t++;
						}
						else if(k==22)
						{
							if(posn==board.cells.get(p).getNum())
								System.out.print(c);
							System.out.print(players.get(i).coin+board.cells.get(p).getNum()+"T"+t+"\t");
							l++;
							t++;
						}
						else if(k==3)
						{
							if(posn==board.cells.get(p).getNum())
								System.out.print(c);
							System.out.print(board.cells.get(p).getNum()+"U"+u+"\t");
							l++;
							u++;
						}
						else if(k==33)
						{
							if(posn==board.cells.get(p).getNum())
								System.out.print(c);
							System.out.print(players.get(i).coin+board.cells.get(p).getNum()+"U"+u+"\t");
							l++;
							u++;
						}
						else if(k==4)
						{
							if(posn==board.cells.get(p).getNum())
								System.out.print(c);
							System.out.print(board.cells.get(p).getNum()+"B"+b+"\t");
							l++;
							b++;
						}
						else if(k==5)
						{
							if(players.get(i).getPosition()==board.cells.get(p).getNum())
							{
								if(posn==board.cells.get(p).getNum())
								System.out.print(c);
							System.out.print(players.get(i).coin+board.cells.get(p).getNum()+"\t");
							}
							else{
								if(posn==board.cells.get(p).getNum())
								System.out.print(c);
							System.out.print(board.cells.get(p).getNum()+"\t");
							}
							l++;
						}
						if(l==10)
						{
							System.out.println("\n");
							l=0;
						}
		
			}
		c=players.get(i).coin;
		posn=players.get(i).getPosition();
		}
		}
		
		}
		System.out.print("Press 0 to continue:");	
		}while(scan.nextInt()==0);
		
		
		
	}
}