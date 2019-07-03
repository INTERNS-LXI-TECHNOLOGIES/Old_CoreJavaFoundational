package com.lxisoft.game.view;
import java.util.logging.*;
import java.util.*;
import com.lxisoft.game.model.*;
import com.lxisoft.game.control.*;
/**
*This class is used as a view class for SnakeNLadder
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:03/07/2019
*/
public class SnakeNLadderView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(SnakeNLadderView.class.getName());
	
	SnakeNLadder game;
	SnakeNLadderControl gameControl;
	
	
	public void showBoard(Board board)
	{
		Cell[][] cellArray=board.getCells();
		
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<10;j++)
				{
					System.out.print(" ");
					System.out.print("\t"+cellArray[i][j].getCellNumber());
					
				}
				System.out.println(" ");
				System.out.println(" ");
			}
			else
			{
				for(int j=0;j<10;j++)
				{
					System.out.print(" ");
					System.out.print("\t"+cellArray[i][j].getCellNumber());
				}
				System.out.println(" ");
				System.out.println(" ");
			}
		}
	}
	
	public void displayBoard(Board board)
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
					int flag=0;
					for(int k=0;k<5;k++)
					{
						int snakeHead=snakeList.get(k).getHeadPosition();
						int snakeTail=snakeList.get(k).getTailPosition();
						int ladderBottom=ladderList.get(k).getStartingPoint();
						int ladderTop=ladderList.get(k).getEndPoint();
						if(cellNum==snakeHead)
						{
							System.out.print(" ");
							System.out.print("\t{SH"+(k+1)+"}");
							flag=1;
							//break;
						}
						else if(cellNum==snakeTail)
						{
							System.out.print(" ");
							System.out.print("\t{ST"+(k+1)+"}");
							flag=1;
							//break;
						}
						else if(cellNum==ladderBottom)
						{
							System.out.print(" ");
							System.out.print("\t|LB"+(k+1)+"|");
							flag=1;
							//break;
						}
						else if(cellNum==ladderTop)
						{
							System.out.print(" ");
							System.out.print("\t|LT"+(k+1)+"|");
							flag=1;
							//break;
						}
						// else
						// {
							
						// }
						
						
					}
					if(flag!=1)
					{
						System.out.print(" ");
					System.out.print("\t"+cellArray[i][j].getCellNumber());
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
					int flag=0;
					for(int k=0;k<5;k++)
					{
						int snakeHead=snakeList.get(k).getHeadPosition();
						int snakeTail=snakeList.get(k).getTailPosition();
						int ladderBottom=ladderList.get(k).getStartingPoint();
						int ladderTop=ladderList.get(k).getEndPoint();
						if(cellNum==snakeHead)
						{
							System.out.print(" ");
						System.out.print("\t{SH"+(k+1)+"}");
							flag=1;
							//break;
						}
						else if(cellNum==snakeTail)
						{
							System.out.print(" ");
							System.out.print("\t{ST"+(k+1)+"}");
							flag=1;
							//break;
						}
						else if(cellNum==ladderBottom)
						{
							System.out.print(" ");
							System.out.print("\t|LB"+(k+1)+"|");
							flag=1;
							//break;
						}
						else if(cellNum==ladderTop)
						{
							System.out.print(" ");
							System.out.print("\t|LT"+(k+1)+"|");
							flag=1;
							//break;
						}
						// else
						// {
							
						// }
						
						
					}
					if(flag!=1)
					{
						System.out.print(" ");
						System.out.print("\t"+cellArray[i][j].getCellNumber());
					}
					
				}
				System.out.println(" ");
				System.out.println(" ");
			}
		}
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
		showBoard(board);
		displayBoard(board);
		gameControl.playGame(game);
	}
}