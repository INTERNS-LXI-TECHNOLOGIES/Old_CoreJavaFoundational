package com.lxisoft.files;
import java.util.*;
public class Game
{
   Scanner scan=new Scanner(System.in);
   private Board board=new Board();
   private Dice dice=new Dice();
   //public Coin coin;
   public void setDice(Dice dice)
   {
	   this.dice=dice;
   }
   public Dice getDice()
   {
	   return dice;
   } 
   public void setBoard(Board board) 
   {
	   this.board=board;
   }
   public Board getBoard()
   {
	   return board;
   }
   public void playGame()
   {
	   ArrayList<Player> players=new ArrayList<Player>();
	   int p=0;
		System.out.println("how many players");
		int s=scan.nextInt();
		System.out.println("name of the players");
			for (int i=0;i<s;i++)
				{
					String n=scan.next();
					Player player=new Player();
					player.setName(n);
					player.setPosition(p);
					players.add(player);
				}
				board.getPlayers(players);
        board.setSnakesAndLaddersOnTheBoard();
        
	    int num=0;
		do
		{
			for(int i=0;i<players.size();i++)
			{
				num=dice.diceThrow();
				System.out.println("dice value="+num);
				if(players.get(i).getPosition()>0)
				{
					players.get(i).setPosition(players.get(i).getPosition()+num);
				}
				else if(players.get(i).getPosition()==0)
				{
					if(num==1)
					{
						players.get(i).setPosition(players.get(i).getPosition()+num);
					}	
				}
				else
				{
					
				}
			}
			for(int i=0;i<players.size();i++)
			{
				System.out.println("name of the players   :"+players.get(i).getName()+"position     :"+players.get(i).getPosition());
			}
			board.createBoard();
			System.out.println("do you want to continue press 1");
		}while(scan.nextInt()==1);
	}
	
}