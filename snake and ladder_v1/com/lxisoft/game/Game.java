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
	System.out.println("\n"+"\n"+"                            SNAKE AND LADDER                            "+"\n"+"\n");
	setPlayers();
	System.out.println("\n");
    board.createBoard();
	for(int i=0;i<4;i++)
		{
		int random=dice.getDiceValue();
		System.out.println("dicevalue :"+random);
		}
	System.out.println(players);
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