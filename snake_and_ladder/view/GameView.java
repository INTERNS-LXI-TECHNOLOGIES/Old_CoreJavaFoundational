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
	Player player;
	Board board;
	Dice dice;
	public GameView()
	{
		player=new Player();
		gameC=new GameController();
		players=new ArrayList <Player>();
		dice=new Dice();
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
			System.out.println("SnakeNLadder game");
			System.out.print("Number of players maximum 3 and minimum 2:");
			gameC.getGame().setNoOfPlayers(scan.nextInt());
			if(gameC.getGame().getNoOfPlayers()>1&&gameC.getGame().getNoOfPlayers()<4)
			{
			int i=1;
			while(i<=gameC.getGame().getNoOfPlayers())
			{
				Player player=new Player();
				System.out.print("Player"+i+" name:");
				player.setName(br.readLine());
				players.add(player);
				i++;
			}
			System.out.println("Choose your coin:");
			for(int j=0;j<players.size();j++)
			{
				System.out.print(players.get(j).getName()+"'s coin:");
				players.get(j).setCoin(br.readLine());
				//System.out.println(players.get(j).getCoin());
			}
			System.out.println("****Start game****");
			player.playGame(dice,players,board);
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}