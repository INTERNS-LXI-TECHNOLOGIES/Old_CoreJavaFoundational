package com.lxisoft.game.model;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for Board
*
*@author AryaVineesh
*
*@version 1.1
*
*Date Modified:15/07/2019
*/
public class Board
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Board.class.getName());
	
	public Board()
	{
		log.setLevel(Level.WARNING);
	}
	
	/**
	*This is an arraylist of snakes in the board
	*/
	private ArrayList<Snake> snakes;
	
	/**
	*This is an arraylist of ladders in the board
	*/
	private ArrayList<Ladder> ladders;
	
	/**
	*This is an array of cells in the board
	*/
	private Cell[][] cells;
	
	/**
	*This is the size of the board
	*/
	private int sizeOfBoard;
	
	/**
	*This method is used to set an arraylistof snakes in the board
	*
	*@param snakes
	*/
	public void setSnakes(ArrayList<Snake> snakes)
	{
		log.info("Board class...............setSnakes............start");
		this.snakes=snakes;
		log.info("Board class...............setSnakes............end");
	}
	
	/**
	*This method is will return an arraylist of snakes
	*
	*@return snakes
	*/
	public ArrayList<Snake> getSnakes()
	{
		log.info("Board class...............getSnakes............start/end");
		return snakes;
	}
	
	/**
	*This method is used to set an arraylist of ladders on the board
	*
	*@param ladders - the ladders to be set
	*/
	public void setLadders(ArrayList<Ladder> ladders)
	{
		log.info("Board class...............setLadders............start");
		this.ladders=ladders;
		log.info("Board class...............setLadders............end");
	}
	
	/**
	*This method will return an arraylist of ladders
	*
	*@return ladders
	*/
	public ArrayList<Ladder> getLadders()
	{
		log.info("Board class...............getLadders............start/end");
		return ladders;
	}
	
	/**
	*This method is used to set an array of cells on the board
	*
	*@param cells - the cells to be set
	*/
	public void setCells(Cell[][] cells)
	{
		log.info("Board class...............setCells............start");
		this.cells=cells;
		log.info("Board class...............setCells............end");
	}
	
	/**
	*This method will return an array of cells
	*
	*@return cells
	*/
	public Cell[][] getCells()
	{
		log.info("Board class...............getCells............start/end");
		return cells;
	}
	
	/**
	*Tie method is used to set the size of the board
	*
	*@param sizeOfBoard - the size of the board to set
	*/
	public void setSizeOfBoard(int sizeOfBoard)
	{
		log.info("Board class...............setSizeOfBoard............start");
		this.sizeOfBoard=sizeOfBoard;
		log.info("Board class...............setSizeOfBoard............end");
	}
	
	/**
	*This method will return the size of the board
	*
	*@return sizeOfBoard
	*/
	public int getSizeOfBoard()
	{
		log.info("Board class...............getSizeOfBoard............start/end");
		return sizeOfBoard;
	}
}