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
	System.out.println("\n"+"There are snakes and ladders on squares...Tread with care...Good Luck....!!!"+"\n");
	System.out.print("Press any key to start the game... : ");
	String key=scan.next();
	System.out.println("\n"+"==================================================================================="+"\n"+ "                            SNAKE AND LADDER                            " +"\n"+"==================================================================================="+"\n"+"\n");
    board.displayBoard(players);
	
	int res=0;
	int pos;
	do{
	
	for(int i=0;i<players.size();i++)
		{ 
		System.out.print("\n"+"Player"+(i+1)+", press any key to shuffle the die... :");
		String str=scan.next();
        int random=dice.getDiceValue();		
		System.out.println("The number on the die is : "+random);
		if((players.get(i).getPosition()+random)>100)
		{
			System.out.println("you will have to wait for the next turn , you have exeeded 100 ");
		}
		else
		{
        pos=players.get(i).getPosition()+random;
		
		for(int j=0;j<5;j++)
		{
			if(pos==board.snakes.get(j).getHead())
			{
				System.out.println("oops...U got bit by a snake...,GO DOWN....");
				pos=board.snakes.get(j).getTail();
				players.get(i).setPosition(pos);
			}
			else if(pos==board.ladders.get(j).getBottom())
			{
				System.out.println("yay...U got a ladder...,GO UP....");
				pos=board.ladders.get(j).getTop();
				players.get(i).setPosition(pos);
			}
			else
			{					
	    players.get(i).setPosition(pos);
			}
		}
		System.out.println("You have progressed by "+random+" and your new position is "+players.get(i).getPosition());
		System.out.println("\n"+"==================================================================================="+"\n"+ "                            SNAKE AND LADDER                            " +"\n"+"==================================================================================="+"\n"+"\n");
		board.createBoard(players);
		if(players.get(i).getPosition()==100)
		{
			System.out.println("congratulations player"+(i+1)+" you have won the game");
			break;
		}
	
		}
		}
		for(int i=0;i<players.size();i++){
		if(players.get(i).getPosition()==100)
		{
			res=1;
		}
			}
	}while(res==0);
	
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
			players.get(i).setPosition(1);
		}	
}

}