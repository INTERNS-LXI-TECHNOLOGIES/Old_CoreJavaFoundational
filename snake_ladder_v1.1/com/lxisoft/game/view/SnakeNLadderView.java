package com.lxisoft.game.view;
import java.util.logging.*;
import java.util.*;
import com.lxisoft.game.model.*;
import com.lxisoft.game.control.*;
import java.io.*;
/**
*This class is used as a view class for SnakeNLadder
*
*@author AryaVineesh
*
*@version 1.1
*
*Date Modified:15/07/2019
*/
public class SnakeNLadderView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(SnakeNLadderView.class.getName());
	
	SnakeNLadder game;
	SnakeNLadderControl gameControl;
	
	
	public void showBoard(Board board,ArrayList<Player> playerList)
	{
		Cell[][] cellArray=board.getCells();
		ArrayList<Snake> snakeList=board.getSnakes();
		ArrayList<Ladder> ladderList=board.getLadders();
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<10;j++)
				{
					int cellNum=cellArray[i][j].getCellNumber();
					int p=checkPlayer(board,cellNum,playerList);
					int st=checkSnakeTail(board,cellNum);
					int sh=checkSnakeHead(board,cellNum);
					int lb=checkLadderBottom(board,cellNum);
					int lt=checkLadderTop(board,cellNum);
					if(p!=0)
					{
						
						System.out.print(" ");
						System.out.print("\t@P"+p);
					}
					
					else if(sh!=0)
					{
						System.out.print(" ");
						System.out.print("\t{SH"+sh+"}");
					}
					
					else if(st!=0)
					{
						System.out.print(" ");
						System.out.print("\t{ST"+st+"}");
					}
					
					else if(lb!=0)
					{
						System.out.print(" ");
						System.out.print("\t|LB"+lb+"|");
					}
					
					else if(lt!=0)
					{
						System.out.print(" ");
						System.out.print("\t|LT"+lt+"|");
					}
					else
					{
						System.out.print(" ");
						System.out.print("\t"+cellNum);
					}
				}
				System.out.println(" ");
				System.out.println(" ");
			}
			else
			{
				for(int j=0;j<10;j++)
				{
					int cellNum=cellArray[i][j].getCellNumber();
					int p=checkPlayer(board,cellNum,playerList);
					int sh=checkSnakeHead(board,cellNum);
					int st=checkSnakeTail(board,cellNum);
					int lb=checkLadderBottom(board,cellNum);
					int lt=checkLadderTop(board,cellNum);
					if(p!=0)
					{
						System.out.print(" ");
						System.out.print("\t@P"+p);
					}
					
					else if(sh!=0)
					{
						System.out.print(" ");
						System.out.print("\t{SH"+sh+"}");
					}
					
					else if(st!=0)
					{
						System.out.print(" ");
						System.out.print("\t{ST"+st+"}");
					}
					
					else if(lb!=0)
					{
						System.out.print(" ");
						System.out.print("\t|LB"+lb+"|");
					}
					
					else if(lt!=0)
					{
						System.out.print(" ");
						System.out.print("\t|LT"+lt+"|");
					}
					else
					{
						System.out.print(" ");
						System.out.print("\t"+cellNum);
					}
				}
				System.out.println(" ");
				System.out.println(" ");
			}
		}
	}
	
	public int checkPlayer(Board board,int cellNum,ArrayList<Player> playerList)
	{
		for(int n=0;n<playerList.size();n++)
		{
			int position=playerList.get(n).getPlayerPosition();						
			if(cellNum==position)
			{
				return (n+1);	
			}		
		}
		return 0;
	}
	
	public int checkSnakeHead(Board board,int cellNum)
	{
		ArrayList<Snake> snakeList=board.getSnakes();
		for(int a=0;a<snakeList.size();a++)
		{
			int snakeHead=snakeList.get(a).getHeadPosition();
			if(cellNum==snakeHead)
			{
				return (a+1);	
			}
		}
		return 0;
	}
	
	public int checkSnakeTail(Board board,int cellNum)
	{
		ArrayList<Snake> snakeList=board.getSnakes();
		for(int a=0;a<snakeList.size();a++)
		{
			int snakeTail=snakeList.get(a).getTailPosition();
			if(cellNum==snakeTail)
			{
				return (a+1);	
			}
		}
		return 0;
	}
	
	public int checkLadderTop(Board board,int cellNum)
	{
		ArrayList<Ladder> ladderList=board.getLadders();
		for(int d=0;d<ladderList.size();d++)
		{
			int ladderTop=ladderList.get(d).getEndPoint();
			if(cellNum==ladderTop)
			{
				return (d+1);		
			}
		}
		return 0;
	}
	
	public int checkLadderBottom(Board board,int cellNum)
	{
		ArrayList<Ladder> ladderList=board.getLadders();
		for(int d=0;d<ladderList.size();d++)
		{
			int ladderBottom=ladderList.get(d).getStartingPoint();
			if(cellNum==ladderBottom)
			{
				return (d+1);
			}
		}
		return 0;
	}
	
	public void startNewGame()
	{
		game=new SnakeNLadder();
		gameControl=new SnakeNLadderControl();
		gameControl.createBoard(game);
		Scanner sc=new Scanner(System.in);
		ArrayList<Player> players=new ArrayList<Player>();
		ArrayList<Piece> pieces=new ArrayList<Piece>();
		System.out.println("Enter the no.of players:\n");
		int noOfPlayers=sc.nextInt();
		for(int i=0;i<noOfPlayers;i++)
		{
			Player player=new Player();
			Piece piece=new Piece();
			Scanner input=new Scanner(System.in);
			System.out.println("Enter the name of player "+(i+1)+":");
			player.setPlayerName(input.nextLine());
			players.add(player);
			pieces.add(piece);
		}
		Dice dice=new Dice();
		game.setPlayers(players);
		game.setPieces(pieces);
		game.setDice(dice);
		Board board=game.getBoard();
		gameControl.playGame(game);
	}
	
	//Clears Screen in java
	public static void clrscr()
	{
		try
		{
			if(System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
			else
            Runtime.getRuntime().exec("clear");
		}
		catch (IOException | InterruptedException ex)
		{
			
		}
	}
}