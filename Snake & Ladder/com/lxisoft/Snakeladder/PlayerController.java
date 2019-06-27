package com.lxisoft.Snakeladder;
import java.util.*;

public class PlayerController
{
	public ArrayList<Player> players=new ArrayList<Player>();

	int noOfPlayers;
	public void createPlayer()
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Players:");
		noOfPlayers=scan.nextInt();

		for(int i=0;i<noOfPlayers;i++)
		{
			Player player=new Player();

			System.out.print("Player "+(i+1)+"Name :");
			player.setName(scan.next());

			System.out.print("Select an alphabet for coin:");
			player.setCoin(scan.next());

			players.add(player);

		}
	
		/*System.out.println("SIZE:"+players.size());

		for(int t=0;t<players.size();t++)
		{
			System.out.println(players.get(t).getName()+":"+players.get(t).getCoin());
		}*/
		setPlayer();
	}


}

