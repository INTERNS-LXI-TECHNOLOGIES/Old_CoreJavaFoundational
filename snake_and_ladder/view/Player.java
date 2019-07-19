package com.lxisoft.snake_and_ladder.view;
import java.util.*;
public class Player
{
	private String name;
	private String coin;
	private int position;
	String c=null,d=null;
	int posn=0,posn1=0;
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
	public void playGame(Dice dice,ArrayList <Player> players,Board board )
	{
		int postn=0;
		String coin=null;
		do{
			for(int i=0;i<players.size();i++)
			{
			System.out.print("Choose whose turn?");
			if((i+1)==scan.nextInt())
			{
			System.out.print(players.get(i).name+"'s turn:");
			int diceSide=dice.diceThrow();
			System.out.println(diceSide);
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
						if(p2>100){}
						else if(p2==100)
						{
							System.out.println(players.get(i).name+" Wins");
							System.out.println("Game Over");
							System.exit(0);
						}
						else{
						players.get(i).setPosition(p2);
						System.out.println(players.get(i).getPosition());
						}
						for(int k=0;k<3;k++)
						{
						if(players.get(i).getPosition()==board.ladders.get(k).getBottom())
						{
							int pos1=board.ladders.get(k).getTop();
							players.get(i).setPosition(pos1);
							System.out.println(players.get(i).getPosition());
						}
						}
						for(int k=0;k<3;k++)
						{
						if(players.get(i).getPosition()==board.snakes.get(k).getHead())
						{
							int pos2=board.snakes.get(k).getTail();
							players.get(i).setPosition(pos2);
							System.out.println(players.get(i).getPosition());
						}
						}
				}				
				postn=players.get(i).getPosition();
				coin=players.get(i).coin;
				checkSnakeNLadder(players,board,postn,coin);
			}
			}
			System.out.print("Press 0 to continue:");	
			}while(scan.nextInt()==0);	
		}
		public void checkSnakeNLadder(ArrayList <Player> players,Board board,int postn,String coin )
		{
			int l=0,k=0,h=0,t=0,u=0,b=0;
				for(int p=0;p<board.cells.size();p++)
				{
						for(int q=0;q<3;q++)
						{
							if(board.cells.get(p).getNum()==board.snakes.get(q).getHead())
							{
								k=1;
								h++;
								break;
							}
							else if(board.cells.get(p).getNum()==board.snakes.get(q).getTail())
							{
								if(postn==board.snakes.get(q).getTail())
								{
								k=22;
								t++;
								}
								else{
								k=2;
								t++;
								}
								break;
							}
							 if(board.cells.get(p).getNum()==board.ladders.get(q).getTop())
							{
								if(postn==board.ladders.get(q).getTop())
								{
								k=33;
								u++;
								}
								else{
								k=3;
								u++;
								}
								break;
							}
							else if(board.cells.get(p).getNum()==board.ladders.get(q).getBottom())
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
						int num=board.cells.get(p).getNum();
						displayBoard(num,k,d,c,coin,posn1,posn,postn,u,b,h,t);
							l++;
							if(l==10)
							{
								System.out.println("\n");
								l=0;
							}
				}
			if(players.size()==3)
			{
			d=c;
			posn1=posn;
			}
			if(posn<=100)
			{
			c=coin;
			posn=postn;
			}
	}
	public void displayBoard(int num,int k,String d,String c,String coin,int posn1,int posn,int postn,int u,int b,int h,int t)
	{
					if(posn1==num)
					System.out.print(d);
					if(posn==num)
					System.out.print(c);
						if(k==1)
						{
							System.out.print(num+"H"+h+"\t");
						}
						else if(k==2)
						{
							System.out.print(num+"T"+t+"\t");
						}
						else if(k==22)
						{
							System.out.print(coin+num+"T"+t+"\t");
						}
						else if(k==3)
						{
							System.out.print(num+"U"+u+"\t");
						}
						else if(k==33)
						{
							System.out.print(coin+num+"U"+u+"\t");
						}
						else if(k==4)
						{
							System.out.print(num+"B"+b+"\t");
						}
						else if(k==5)
						{
							if(postn==num)
							{
							System.out.print(coin+num+"\t");
							}
							else{
							System.out.print(num+"\t");
							}
						}
						
	}
	
}