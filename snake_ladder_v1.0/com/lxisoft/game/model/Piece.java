package com.lxisoft.game.model;
import java.util.logging.*;
/**
*This class is used as a model class for Piece
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:04/07/2019
*/
public class Piece
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Piece.class.getName());
	
	/**
	*This is the color of the piece
	*/
	private String color;
	
	/**
	*this is the shape of the piece
	*/
	private String shape;
	
	/**
	*This method is used to set the color of the piece
	*
	*@param color - the color to be set
	*/
	public void setColor(String color)
	{
		log.info("Piece class.........setColor.........start");
		this.color=color;
		log.info("Piece class.........setColor.........end");
	}
	
	/**
	*This method will return the color of the piece
	*
	*@return color
	*/
	public String getColor()
	{
		log.info("Piece class.........getColor.........start/end");
		return color;
	}
	
	/**
	*This method is used to set the shape of the piece
	*
	*@param shape - the shape to be set
	*/
	public void setShape(String shape)
	{
		log.info("Piece class.........setShape.........start");
		this.shape=shape;
		log.info("Piece class.........setShape.........end");
	}
	
	/**
	*This method will return the shape of the piece
	*
	*@return shape
	*/
	public String getShape()
	{
		log.info("Piece class.........setShape.........start/end");
		return shape;
	}
	
}