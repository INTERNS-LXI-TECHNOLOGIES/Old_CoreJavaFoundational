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
	//board.display();
    board.setBoard(players);
	
	int res=0;
	int pos;
	do{
	
	for(int i=0;i<players.size();i++)
		{ 
		int random=dice.getDiceValue();
		System.out.print("Player"+(i+1)+", press any key to shuffle the die... :");
		String str=scan.next(); 
		System.out.println("The number on the die is : "+random);
		if((players.get(i).getPosition()+random)>100)
		{
			System.out.println("you will have to wait for the next turn , you have exeeded 100 ");
		}
		else
		{
        pos=players.get(i).getPosition()+random;
		players.get(i).setPosition(pos);
		System.out.println("You have progressed by "+random+" and your new position is "+players.get(i).getPosition());
		board.createBoard(players);
		if(players.get(i).getPosition()==100)
		{
			System.out.println("congratulations player"+(i+1)+" you have won the game");
			break;
		}
		//System.out.println(players.get(i).getName()+" : "+random);
		//System.out.println("dicevalue :"+random);
		}
		}
		for(int i=0;i<players.size();i++){
		if(players.get(i).getPosition()==100)
		{
		
			res=1;
			//System.out.println("congratulations player"+(i+1)+" you have won the hame");
		}
			}
	}while(res==0);
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
			players.get(i).setPosition(1);
		}
	
}

}