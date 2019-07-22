package com.snakeandladder;
import java.util.ArrayList;
import java.util.Scanner;
public class GamePlay 
{
	Board board= new Board();
	ArrayList<Player> players=new ArrayList();
	 Scanner scan = new Scanner(System.in);
	public ArrayList<Player> getPlayers() {
		System.out.println(players.size());
		return players;
	}
	
	public void selectPlyer()
	{
		int a;
		
		@SuppressWarnings("unused")
		int position = 0;
	
		do{
			System.out.print("Enter the No.of Players: ");
			 a= scan.nextInt();
			if(a>4)
			{
				System.out.println("Only 4 Player Can Play \n'Try Again..'");
			}
		}
		while(a>4);
		
		for(int i=0;i<a;i++)
		{
		Player player=new Player();
		System.out.println("Enter the Player "+i+"  Name :");
		String name = scan.next();
		player.setName(name);
		player.setPosition(position);
		players.add(player);
		//System.out.print("%%%%%"+pc.players.get(i).getName());
		}
		//players.add(a);
		
		startGame(players);
	}
	
	public boolean play(ArrayList<Player>players)
	{
		int dice = board.roller();
		int temp = 0;
		for(int p=0;p<players.size();p++)
		{
			
		if(players.get(p).getPosition()==0)
		{
			System.out.println("Get 1 To Enter The Game ");
			System.out.println("Dice *: "+dice);
		}
		
		if(temp==0)
		{
			
			if(dice==1&&players.get(p).getPosition()==0)
			{
				players.get(p).setPosition(1);
			}
			else if( dice==6 )
			{
				System.out.println("You Got an another Chance to roll Dice "+players.get(p).getName());
				players.get(p).setPosition(players.get(p).getPosition()+dice);
			}
			else if(players.get(p).getPosition()+dice<100 && players.get(p).getPosition()>0)
			{
				players.get(p).setPosition(players.get(p).getPosition()+dice);
			}
			else if(players.get(p).getPosition()+dice==100){
				players.get(p).setPosition(players.get(p).getPosition()+dice);
				return true;
			}
			}
	
		}
		
			for(int i=0;i<board.snakes.size();i++)
			{
				for(int p=0;p<players.size();p++)
				{
				if(players.get(p).getPosition()+dice==board.snakes.get(i).getStart())
				{
					players.get(p).setPosition(board.snakes.get(i).getEnd());
					temp++;
				}
				
			}
			}
			for(int i=0;i<board.ladders.size();i++)
			{
				for(int p=0;p<players.size();p++)
				{
				if(players.get(p).getPosition()+dice==board.ladders.get(i).getStart())
				{
					players.get(p).setPosition(board.ladders.get(i).getEnd());
					temp++;
				}
				}
			}
			board.players = this.players;
			board.setBoard();
		
		return false;
	}
	
	public void setGame()
	{
		int a;
		System.out.println("\t\tPress 1 to Start Game");
		 a = scan.nextInt();
		if(a==1)
		{
			selectPlyer();
		}
		startGame(players);
		
	}
	public ArrayList<Player> getPlayerlist(ArrayList<Player> players){
		
		return this.players;
	}

	public void startGame(ArrayList<Player> players)
	{
		
		
		for(int i =0;i<players.size();i++)
		{
			
		boolean win = false;
		while(win == false)
		{
		
		System.out.println(players.get(i).getName()+"'s Turn");
		System.out.println("Press '0' To Roll Dice");
		int a = scan.nextInt();
		if(a==0)
		{
			win = play(players);
			if(win==true)
			{
				win(players.get(i).getName());
			}
		}
			 if(i==players.size()-1) { i=0; }
				
		else
		{
			i++;
		}
		}
		}
	}
	public void win(String winner)
	{
		board.boardView();
		System.out.println("	***"+winner+" Won The Game***");
	}	}