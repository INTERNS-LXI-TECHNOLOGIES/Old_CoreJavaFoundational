package com.lxisoft.Snakeladder;
//import com.lxisoft.Snakeladder.model.*;
import java.util.*;


public class BoardController
{
	SnakeController sController=new SnakeController();
	LadderController lController=new LadderController();
	PlayerController pController=new PlayerController();
	
	int [][] brd=new int[11][11];
	int pos=0;
	
	public void createBoard()
	{
		pController.createPlayer();
		
		sController.createSnake();
		lController.createLadder();
		System.out.println("Snake Count"+sController.snakes.size());
		System.out.println("Ladder Count"+lController.ladders.size());
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
								System.out.print(brd[i][j]+"\t");
							}
					}
				}
			System.out.print("\n\n");
		}
		
	}
	public boolean checkSnake(int gridNo)
	{
		for(int s=0;s<sController.snakes.size();s++)
			{
				//System.out.print("SARATH");
				if(gridNo==sController.snakes.get(s).getSnakeStartPosition()||gridNo==sController.snakes.get(s).getSnakeEndPosition())
					{
						//System.out.print("getSnake"+sController.snakes.get(s).getSnakeStartPosition());
						//System.out.print("{"+brd[i][j]+"}"+"\t");
						return true;
					}
			}
		return false;
	}
	public boolean checkLadder(int gridNo)
	{
		for(int s=0;s<lController.ladders.size();s++)
			{
				//System.out.print("SARATH");
				if(gridNo==lController.ladders.get(s).getLadderStartPosition()||gridNo==lController.ladders.get(s).getLadderEndPosition())
					{
						//System.out.print("getSnake"+sController.snakes.get(s).getSnakeStartPosition());
						//System.out.print("{"+brd[i][j]+"}"+"\t");
						return true;
					}
			}
		return false;
	}
	
		

}
	/*public void createBoard()
	{
		PlayerController pController=new PlayerController();
		pController.createPlayer();
	} */
	// public void setPlayer()
	// {
	// 	PlayerController pController=new PlayerController();
	// 	pController.createPlayer();
	// 	int pos=0;
	// 	System.out.println("Size:"+pController.players.size());
	// 	for(int i=0;i<pController.players.size();i++)
	// 	{
	// 		System.out.println("Enter to loop");
	// 		Player player=new Player();
	// 		player.setPos(pos);
	// 		System.out.println("Position:"+player.getPos());
	// 		//pController.players.add(player);
	// 		pController.players.add(player);
	// 	}
		
		// for(int p=0;p<pController.players.size();p++)
		// {
		// 	System.out.println("Player :"+pController.players.get(p).getName()+":"+pController.players.get(p).getCoin()+":"+pController.players.get(p).getPos());
		// }
	//}
