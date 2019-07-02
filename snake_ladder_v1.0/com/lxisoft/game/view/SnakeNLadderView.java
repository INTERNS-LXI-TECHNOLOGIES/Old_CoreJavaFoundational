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
*Date Modified:02/07/2019
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
		gameControl.playGame(game);
	}
}