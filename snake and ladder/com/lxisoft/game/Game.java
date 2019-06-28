package com.lxisoft.game;
import com.lxisoft.requirements.*;
import java.util.*;
public class Game
{
public ArrayList<Player> players=new ArrayList<Player>();
Board board=new Board();
Dice dice=new Dice();
Scanner scan=new Scanner(System.in);

public void playGame()
{
	System.out.println("\n");
	setPlayers();
	System.out.println("\n");
	System.out.print("Press any key to start the game... : ");
	String key=scan.next();
	System.out.println("\n"+"==================================================================================="+"\n"+"There are snakes on squares 17, 54, 62, 64, 87, 93, 95 and 98. Tread with care....!"+"\n"+"There are ladders on squares 4, 16, 35, 50, 57, 67, 68 and 86. Good Luck....!"+"\n"+"===================================================================================");
	System.out.println("\n"+"\n"+"                            SNAKE AND LADDER                            "+"\n"+"\n");
	
    board.createBoard();
	
	for(int i=0;i<players.size();i++)
		{ 
		int random=dice.getDiceValue();
		System.out.print("Player"+(i+1)+", press any key to shuffle the die... :");
		String str=scan.next();
		System.out.println("The number on the die is : "+random);

		//System.out.println(players.get(i).getName()+" : "+random);
		//System.out.println("dicevalue :"+random);
		}
	//System.out.println(players);
}

public void setPlayers()
{
	int num;
	
	System.out.print("  No.of Players...? :  ");
	num=scan.nextInt();
	System.out.println("\n");
	for(int i=0;i<num;i++)
		{
			players.add(new Player());
			System.out.print("  Name of player"+(i+1)+" : ");
			players.get(i).setName(scan.next());
		}
	
}

}