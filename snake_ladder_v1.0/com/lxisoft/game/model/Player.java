package com.lxisoft.game.model;
import java.util.logging.*;
/**
*This class is used as a model class for Player
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:03/07/2019
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
	
}