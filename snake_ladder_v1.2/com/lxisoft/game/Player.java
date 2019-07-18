package com.lxisoft.game;
import java.util.*;
import com.lxisoft.game.*;
import java.util.logging.*;
/**
*This class is used as a class for Player
*
*@author AryaVineesh
*
*@version 1.2
*
*Date Modified:18/07/2019
*/
public class Player
{
	public Player()
	{
		log.setLevel(Level.WARNING);
	}
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Player.class.getName());
	
	/**
	*This is the name of the player
	*/
	private String playerName;
	
	/**
	*This is to check whether the player is alive
	*/
	private boolean isAlive;
	
	/**
	*This is the current position of the player
	*/
	private int playerPosition;
	
	/**
	*This method is used to set the name of the player
	*
	*@param playerName - the name to be set
	*/
	public void setPlayerName(String playerName)
	{
		log.info("Player class...........setPlayerName.........start");
		this.playerName=playerName;
		log.info("Player class...........setPlayerName.........end");
	}
	
	/**
	*This method will return the name of the player
	*
	*@return playerName
	*/
	public String getPlayerName()
	{
		log.info("Player class...........getPlayerName.........start/end");
		return playerName;
	}
	
	/**
	*This method is used to set the position of the player
	*
	*@param playerPosition - the position to be set
	*/
	public void setPlayerPosition(int playerPosition)
	{
		log.info("Player class...........setPlayerPosition.........start");
		this.playerPosition=playerPosition;
		log.info("Player class...........setPlayerPosition.........end");
	}
	
	/**
	*This method will return the position of the player
	*
	*@return playerPosition
	*/
	public int getPlayerPosition()
	{
		log.info("Player class...........getPlayerPosition.........start/end");
		return playerPosition;
	}
	
	/**
	*This method is used to set the status of the player
	*
	*@param isAlive - the status to be set
	*/
	public void setIsAlive(boolean isAlive)
	{
		log.info("Player class...........setIsAlive.........start");
		this.isAlive=isAlive;
		log.info("Player class...........setIsAlive.........end");
	}
	
	/**
	*This method will return the status of the player
	*
	*@return isAlive
	*/
	public boolean getIsAlive()
	{
		log.info("Player class...........getIsAlive.........start/end");
		return isAlive;
	}
	
	public void playGame(SnakeNLadder game)
	{
		
		ArrayList<Player> playerList=game.getPlayers();
		Scanner sc=new Scanner(System.in);
		Dice dice=game.getDice();
		Board board=game.getBoard();
		for(int j=0;j<playerList.size();j++)
		{
			playerList.get(j).setIsAlive(false);
			playerList.get(j).setPlayerPosition(0);
		}
		board.showBoard(board,playerList);
		do
		{
			
			for(int i=0;i<playerList.size();i++)
			{
				
					System.out.println(" ");
				
				System.out.println(" ");
				System.out.println("player "+(i+1)+" ,"+playerList.get(i).getPlayerName()+" is rolling the dice...");
				System.out.println("press any key to roll the dice:");
				String c=sc.next();
				
				int random=dice.getRandomDiceNumber();
				System.out.println("Dice number is "+random);
				boolean status=playerList.get(i).getIsAlive();
				if(playerList.get(i).getPlayerPosition()==0)
				{
					
					if(random==1 || random==6 && status==false)
					{
						playerList.get(i).setIsAlive(true);
					}
					else
					{
						playerList.get(i).setIsAlive(false);
					}
				}
				
				if(playerList.get(i).getIsAlive()==true)
				{
					int currentPositon=playerList.get(i).getPlayerPosition();
					int newPosition=currentPositon+random;
					if(newPosition>100)
					{
						newPosition=currentPositon;
					}
					int updatedPosition=game.checkResult(newPosition,game.getBoard());
					playerList.get(i).setPlayerPosition(updatedPosition);
					System.out.println(" position of "+playerList.get(i).getPlayerName()+" is "+playerList.get(i).getPlayerPosition());
					
					game.setPlayers(playerList);
					
					board.showBoard(board,playerList);
					if(updatedPosition==100)
					{
						System.out.println("\t\t\tPlayer "+(i+1)+" "+playerList.get(i).getPlayerName()+" is won the game");
						System.out.println("\t\t.........................Game Over......................");
						System.exit(0);
					}
					
					System.out.println(" ");
				}
			}
		}while(true);
	}
	
	
	
}