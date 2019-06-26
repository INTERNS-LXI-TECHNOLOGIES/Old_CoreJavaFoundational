package com.lxisoft.files;
import java.util.Scanner;
public class Game
{
	/*private Player players;
  
   public Dice dice;
  public Coin coin;
   public void setPlayers(Player players)
   {
	   this.players=players;
   } 
   public Player getPlayers()
   {
	   return players;
   } */
   private Board board=new Board();
   public void setBoard(Board board) 
   {
	   this.board=board;
   }
   public Board getBoard()
   {
	   return board;
   }
	Scanner scan=new Scanner(System.in);
	public void playGame()
	{
		System.out.println("how many players");
		int p=scan.nextInt();
		System.out.println("name of the players");
		for (int i=0;i<p;i++)
		{
        String n=scan.next();
		}
         board.b();	
	}
	
}