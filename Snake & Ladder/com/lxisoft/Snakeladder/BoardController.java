package com.lxisoft.Snakeladder;
//import com.lxisoft.Snakeladder.model.*;
import java.util.*;
import java.io.IOException;


public class BoardController
{
	SnakeController scr=new SnakeController();
	LadderController lcr=new LadderController();
	PlayerController pcr=new PlayerController();
	
	int [][] brd=new int[11][11];
	int pos=0;
	
	public void initiateBoard()
	{
		pcr.createPlayer();
		scr.createSnake();
		lcr.createLadder();
	}
	public void refreshBoard()
	{
		// try{
		// 	clearScreen();
		// 		}
		// 		catch(Exception e){}
		
		System.out.println("Snake Count"+scr.snakes.size());
		System.out.println("Ladder Count"+lcr.ladders.size());
		for(int i=10;i>0;i--)
		{
			if((i%2)==0)
				{
					for(int j=10;j>0;j--)
					{
						brd[i][j]=(10*(i-1))+j;
						if(checkSnake(brd[i][j])==true)
							{
								System.out.print("{"+brd[i][j]+"}"+"\t");
							}
							else if(checkLadder(brd[i][j])==true)
							{
								System.out.print("["+brd[i][j]+"]"+"\t");
							}
							else
							{
								for(int p=0;p<pcr.players.size();p++)
								{
								if(checkPlayer(brd[i][j],p)==true)
									{
										System.out.print(pcr.players.get(p).getCoin());
									}
								}
								System.out.print(brd[i][j]+"\t");
							}
					}
				}
			
				else
				{
					for(int j=0;j<10;j++)
					{
						brd[i][j]=((10*(i-1))+j)+1;
						if(checkSnake(brd[i][j])==true)
							{
								System.out.print("{"+brd[i][j]+"}"+"\t");
							}
							else if(checkLadder(brd[i][j])==true)
							{
								System.out.print("["+brd[i][j]+"]"+"\t");
							}
							else
							{
								for(int p=0;p<pcr.players.size();p++)
								{	
									if(checkPlayer(brd[i][j],p)==true)
									{
										System.out.print(pcr.players.get(p).getCoin());
									}
								}
								System.out.print(brd[i][j]+"\t");
							}
							
					}
				}
			System.out.print("\n\n");
		}

		
	}
	public boolean checkSnake(int gridNo)
	{
		for(int s=0;s<scr.snakes.size();s++)
			{
				//System.out.print("SARATH");
				if(gridNo==scr.snakes.get(s).getSnakeStartPosition()||gridNo==scr.snakes.get(s).getSnakeEndPosition())
					{
						//System.out.print("getSnake"+scr.snakes.get(s).getSnakeStartPosition());
						//System.out.print("{"+brd[i][j]+"}"+"\t");
						return true;
					}
			}
		return false;
	}
	public boolean checkLadder(int gridNo)
	{
		for(int l=0;l<lcr.ladders.size();l++)
			{
				//System.out.print("SARATH");
				if(gridNo==lcr.ladders.get(l).getLadderStartPosition()||gridNo==lcr.ladders.get(l).getLadderEndPosition())
					{
						//System.out.print("getSnake"+scr.snakes.get(s).getSnakeStartPosition());
						//System.out.print("{"+brd[i][j]+"}"+"\t");
						checkSnake_Ladder();
						return true;
					}
			}
		return false;
	}
	public void checkSnake_Ladder()
	{
		for(int l=0;l<lcr.ladders.size();l++)
		{
					//System.out.print("X");

			int check=lcr.ladders.get(l).getLadderStartPosition();
			for(int s=0;s<scr.snakes.size();s++)

			{
				if(check==scr.snakes.get(s).getSnakeStartPosition()||check==scr.snakes.get(s).getSnakeEndPosition())
				{
					lcr.ladders.get(l).setLadderStartPosition(check+1);
				}
			}
		}
	}

	public void moovePlayer(int index,int diceValue)
	{
		int z=pcr.players.get(index).getPos();
		int tempPos=pcr.players.get(index).getPos()+diceValue;
		//System.out.println("Current Position :"+tempPos);
		//System.out.println("Diece Value is : "+diceValue);

		for(int s=0;s<scr.snakes.size();s++)
		{
			if(tempPos==scr.snakes.get(s).getSnakeStartPosition())
			{
				System.out.println("player at snake start");
				tempPos=scr.snakes.get(s).getSnakeEndPosition();
				System.out.println("POS:"+tempPos);
				pcr.players.get(index).setPos(tempPos);
			}
			else
			{
				pcr.players.get(index).setPos(tempPos);
			}
		}
		for(int l=0;l<lcr.ladders.size();l++)
		{
			if(tempPos==lcr.ladders.get(l).getLadderStartPosition())
			{
				System.out.println("Player at ladder start");
				tempPos=lcr.ladders.get(l).getLadderEndPosition();
				System.out.println("POS:"+tempPos);
				pcr.players.get(index).setPos(tempPos);
			}
			else
			{
				pcr.players.get(index).setPos(tempPos);
			}
		}
		
		System.out.println("Current position of "+pcr.players.get(index).getName()+"is "+pcr.players.get(index).getPos());
		refreshBoard();
	}
	public boolean checkPlayer(int gridNo,int playerNo)
	{
		// for(int p=0;p<pcr.players.size();p++)
		// 	{
				//System.out.print("SARATH");
				if(gridNo==pcr.players.get(playerNo).getPos())
					{
						return true;
					}
			//}
		return false;
	}
	
	public static void clearScreen() throws IOException, InterruptedException
	{  
    	new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	}  

}
	
		


	/*public void createBoard()
	{
		PlayerController pcr=new PlayerController();
		pcr.createPlayer();
	} */
	// public void setPlayer()
	// {
	// 	PlayerController pcr=new PlayerController();
	// 	pcr.createPlayer();
	// 	int pos=0;
	// 	System.out.println("Size:"+pcr.players.size());
	// 	for(int i=0;i<pcr.players.size();i++)
	// 	{
	// 		System.out.println("Enter to loop");
	// 		Player player=new Player();
	// 		player.setPos(pos);
	// 		System.out.println("Position:"+player.getPos());
	// 		//pcr.players.add(player);
	// 		pcr.players.add(player);
	// 	}
		
		// for(int p=0;p<pcr.players.size();p++)
		// {
		// 	System.out.println("Player :"+pcr.players.get(p).getName()+":"+pcr.players.get(p).getCoin()+":"+pcr.players.get(p).getPos());
		// }
	//}
