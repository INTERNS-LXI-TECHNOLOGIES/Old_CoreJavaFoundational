package com.lxisoft.game.model;
import java.util.logging.*;
/**
*This class is used as a model class for Ladder
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:25/06/2019
*/
public class Ladder
{
	public Ladder()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Ladder.class.getName());
	
	/**
	*This is the Ladder's starting point
	*/
	private int startingPoint;
	
	/**
	*This is the Ladder's end position
	*/
	private int endPoint;
	
	/**
	*This method is used to set the Ladder's starting point
	*
	*@param startingPoint - the point to be set
	*/
	public void setStartingPoint(int startingPoint)
	{
		log.info("Ladder class..............setStartingPoint........start");
		this.startingPoint=startingPoint;
		log.info("Ladder class..............setStartingPoint........end");
	}
	
	/**
	*This method will return the Ladder's head starting point
	*
	*@return startingPoint 
	*/
	public int getStartingPoint()
	{
		log.info("Ladder class..............getStartingPoint........start/end");
		return startingPoint;
		
	}
	
	/**
	*This method is used to set the Ladder's end point
	*
	*@param endPoint - the point to be set
	*/
	public void setEndPoint(int endPoint)
	{
		log.info("Ladder class..............setEndPoint........start");
		this.endPoint=endPoint;
		log.info("Ladder class..............setEndPoint........end");
	}
	
	/**
	*This method will return the Ladder's end position
	*
	*@return endPoint 
	*/
	public int getEndPoint()
	{
		log.info("Ladder class..............getEndPoint........start/end");
		return endPoint;
		
	}
}