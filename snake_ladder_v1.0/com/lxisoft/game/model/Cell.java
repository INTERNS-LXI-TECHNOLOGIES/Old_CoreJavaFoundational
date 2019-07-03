package com.lxisoft.game.model;
import java.util.logging.*;
/**
*This class is used as a model class for Cell
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:03/07/2019
*/
public class Cell
{
	
	public Cell()
	{
		log.setLevel(Level.WARNING);
	}
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Cell.class.getName());
	
	/**
	*This is the  number of the cell
	*/
	private int cellNumber;
	
	/**
	*This method is used to set the number of the cell
	*
	*@param cellNumber - the number to be set
	*/
	public void setCellNumber(int cellNumber)
	{
		log.info("Cell class.............setCellNumber............start");
		this.cellNumber=cellNumber;
		log.info("Cell class.............setCellNumber............end");
	}
	
	/**
	*This method is will return the number of the cell
	*
	*@return cellNumber 
	*/
	public int getCellNumber()
	{
		log.info("Cell class.............getCellNumber............start/end");
		return cellNumber;
	}
}