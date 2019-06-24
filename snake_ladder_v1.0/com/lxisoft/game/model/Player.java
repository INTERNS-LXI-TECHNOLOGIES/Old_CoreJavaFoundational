package com.lxisoft.game.model;
import java.util.logging.*;
/**
*This class is used as a model class for Player
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:24/06/2019
*/
public class Player
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Player.class.getName());
	
	/**
	*This is the name of the player
	*/
	private String playerName;
	
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
	
}