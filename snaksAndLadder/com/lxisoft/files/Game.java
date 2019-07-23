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
        //board.setSnakesAndLaddersOnTheBoard();
        
	    int num=0;
		boolean b= true;
		do
		{
			for(int i=0;i<players.size();i++)
			{
				System.out.println("                                      ");
				System.out.println( "\n"+" player "+(i+1)+"turn enter 1 to throw dice");
				int x=scan.nextInt();
				num=dice.diceThrow();
				
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
				System.out.println("              \n                 ");
				System.out.println("player="+players.get(i).getName());
				System.out.println("dice value="+num);
				System.out.println("playerPosition="+players.get(i).getPosition());
				board.createBoard();
				/*for( i=0;i<players.size();i++)
						{
							System.out.println("name of the players :"+players.get(i).getName()+"       position :"+players.get(i).getPosition());
			    
						}*/
				
			}
			
			for(int i=0;i<players.size();i++)
			{
				if(players.get(i).getPosition()>=100)
				{
					 b=false;
					 break;
				}
			}
		}while(b==true);//while(scan.nextInt()==1&&b==true);
		
	}
}