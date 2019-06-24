package com.lxisoft.snake_and_ladder.view;
import com.lxisoft.snake_and_ladder.controller.*;
import com.lxisoft.snake_and_ladder.model.*;
import java.util.*;
import java.io.*;
public class GameView
{
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);
	GameController gameC;
	ArrayList <Player> players;
	Board board;
	public GameView()
	{
		gameC=new GameController();
		players=new ArrayList <Player>();
	}
	public void setGame()
	{
		board=new Board();
		board.setBoard();
	}
	public void startGame()
	{
		try
		{
		System.out.println("Start game");
		System.out.print("Number of players:");
		gameC.getGame().setNoOfPlayers(scan.nextInt());
		int i=1;
		while(i<=gameC.getGame().getNoOfPlayers())
		{
			Player player=new Player();
			System.out.print("Player"+i+" name:\n");
			player.setName(br.readLine());
			players.add(player);
			i++;
		}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}