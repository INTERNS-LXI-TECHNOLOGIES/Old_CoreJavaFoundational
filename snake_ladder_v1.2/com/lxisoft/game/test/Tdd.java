package com.lxisoft.game.test;
import com.lxisoft.game.*;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a main class for Tdd
*
*@author AryaVineesh
*
*@version 1.2
*
*Date Modified:18/07/2019
*/
public class Tdd
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	
	public Tdd()
	{
		startNewGame();
	}
	
	public void startNewGame()
	{
		SnakeNLadder game=new SnakeNLadder();
		Board board=new Board();
		board.createBoard(game,board);
		Scanner sc=new Scanner(System.in);
		ArrayList<Player> players=new ArrayList<Player>();
		ArrayList<Piece> pieces=new ArrayList<Piece>();
		System.out.println("Enter the no.of players:\n");
		int noOfPlayers=sc.nextInt();
		Player player;
		for(int i=0;i<noOfPlayers;i++)
		{
			player=new Player();
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
		player=new Player();
		player.playGame(game);
	}
	
	
	
	/**
	*This is the main method 
	*
	*@param arg - the arguments to be passed
	*/
	public static void main(String[] arg)
	{
		Tdd view=new Tdd();
	}
}