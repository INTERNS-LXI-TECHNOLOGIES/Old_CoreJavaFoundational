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
	int number=setPlayers();
	if(number==2 || number==3)
	{
	System.out.println("\n"+"There are snakes and ladders on squares...Tread with care...Good Luck....!!!"+"\n");
	System.out.print("Press any key to start the game... : ");
	String key=scan.next();
	System.out.println("\n"+"==================================================================================="+"\n"+ "                            SNAKE AND LADDER                            " +"\n"+"==================================================================================="+"\n"+"\n");
    board.displaySnakeAndLadderNumberBoard(players);
	
	int res=0;
	int pos;
	do{
	
	for(int i=0;i<players.size();i++)
		{ 
		System.out.print("\n"+"Player"+(i+1)+", press any key to shuffle the die... :");
		String str=scan.next();
        int random=dice.getDiceValue();		
		System.out.println("The number on the die is : "+random);
		if(players.get(i).getPosition()==0)
		{
			if(random==1)
			{
				players.get(i).setPosition(random);
				System.out.println("Wow...You have progressed by "+random+" and your new position is "+players.get(i).getPosition());
		System.out.println("\n"+"==================================================================================="+"\n"+ "                            SNAKE AND LADDER                            " +"\n"+"==================================================================================="+"\n"+"\n");

				board.displayBoard(players);
			}
			else{
			System.out.println("you will have to wait for the next turn , you have exeeded 1 ");
		}
		}
		
		else if(players.get(i).getPosition()>0)
		{
				
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
		board.displayBoard(players);
		if(players.get(i).getPosition()==100)
		{
			System.out.println("Congratulations "+players.get(i).getName()+" you have won the game.....");
			break;
		}
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
}

public int setPlayers()
{
	int num=0;
	do{
	System.out.println("Maximum no.of player allowed is 3"+"\n");
	System.out.print("  No.of Players...? :  ");
	num=scan.nextInt();
	System.out.println("\n");
	if(num==2 || num==3)
	{
	for(int i=0;i<num;i++)
		{
			players.add(new Player());
			System.out.print("  Name of player"+(i+1)+" : ");
			players.get(i).setName(scan.next());
			players.get(i).setPosition(0);
		}	
	}
	else{
		if(num==1){
			System.out.println("Sorry...you can't play this game...Minimum 2 or 3 player is needed..."+"\n"+"Please try again...!!!"+"\n");
		}
		else if(num==0 || num<0){
			System.out.println("Error....!!!"+"\n"+"Please try again...!!!"+"\n");
		}
		else{
			System.out.println("More than 3 players are not allowed to play the game..."+"\n"+"Please try again...!!!"+"\n");
		}
}
	}while(num==1 || num>3 || num==0 || num<0);
return num;
}
}