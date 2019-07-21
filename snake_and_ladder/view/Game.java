package com.lxisoft.snake_and_ladder.view;
import com.lxisoft.snake_and_ladder.test.NumberException;
import java.util.*;
import java.io.*;
public class Game
{
	private int noOfPlayers;
	Scanner scan=new Scanner(System.in);
	InputStreamReader r=new InputStreamReader(System.in);  
	BufferedReader br=new BufferedReader(r);
	ArrayList <Player> players;
	Player player;
	Board board;
	Dice dice;
	public void setNoOfPlayers(int noOfPlayers)
	{
		this.noOfPlayers=noOfPlayers;
	}
	public int getNoOfPlayers()
	{
		return noOfPlayers;
	}
	public Game()
	{
		player=new Player();
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
			noOfPlayers=scan.nextInt();
			if(noOfPlayers>1&&noOfPlayers<4)
			{
			int i=1;
			while(i<=noOfPlayers)
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
			else if(noOfPlayers>3)
			throw new NumberException("Number of players are exceed ");
			else if(noOfPlayers<2)
			throw new NumberException("Number of players are lesser");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}