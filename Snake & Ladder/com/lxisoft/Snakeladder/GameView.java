package com.lxisoft.Snakeladder;
//import com.lxisoft.Snakeladder.model.*;
import java.util.*;

public class GameView
{
	//PlayerModel playerModel=new PlayerModel();
	
	int noOfPlayers;
	public void setGame()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the Number of Players:");
		noOfPlayers=scan.nextInt();

		for(int i=1;i<=noOfPlayers;i++)
		{
			System.out.print("Player "+i+":");
			playerModel.setName(scan.next());
		}
		//System.out.println(playerModel.getName());
	}
}