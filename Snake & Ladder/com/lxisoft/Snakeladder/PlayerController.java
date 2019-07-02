package com.lxisoft.Snakeladder;
import java.util.*;

public class PlayerController
{
	public ArrayList<Player> players=new ArrayList<Player>();

	int noOfPlayers;
	public void createPlayer()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Players: ");
		noOfPlayers=scan.nextInt();

		for(int i=0;i<noOfPlayers;i++)
		{
			Player player=new Player();
			int pos=0;

			System.out.print("Player"+(i+1)+" Name : ");
			player.setName(scan.next());

			System.out.print("Select an alphabet for coin: ");
			player.setCoin(scan.next());
			player.setPos(pos);

			players.add(player);

		}
	}
}

