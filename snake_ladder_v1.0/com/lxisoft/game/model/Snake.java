package com.lxisoft.game.model;
import java.util.logging.*;
/**
*This class is used as a model class for Snake
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:05/07/2019
*/
public class Snake
{
	public Snake()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Snake.class.getName());
	
	/**
	*This is the snake's head position
	*/
	private int headPosition;
	
	/**
	*This is the snake's tail position
	*/
	private int tailPosition;
	
	/**
	*This method is used to set the snake's head position
	*
	*@param headPosition - the position to be set
	*/
	public void setHeadPosition(int headPosition)
	{
		log.info("Snake class..............setHeadPosition........start");
		this.headPosition=headPosition;
		log.info("Snake class..............setHeadPosition........end");
	}
	
	/**
	*This method will return the snake's head position
	*
	*@return headPosition 
	*/
	public int getHeadPosition()
	{
		log.info("Snake class..............getHeadPosition........start/end");
		return headPosition;
		
	}
	
	/**
	*This method is used to set the snake's tail position
	*
	*@param tailPosition - the position to be set
	*/
	public void setTailPosition(int tailPosition)
	{
		log.info("Snake class..............setTailPosition........start");
		this.tailPosition=tailPosition;
		log.info("Snake class..............setTailPosition........end");
	}
	
	/**
	*This method will return the snake's tail position
	*
	*@return tailPosition 
	*/
	public int getTailPosition()
	{
		log.info("Snake class..............getTailPosition........start/end");
		return tailPosition;
		
	}
}