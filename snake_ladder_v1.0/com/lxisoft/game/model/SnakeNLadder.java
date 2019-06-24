package com.lxisoft.game.model;
import java.util.*;
import java.util.logging.*;
/**
*This class is used as a model class for SnakeNLadder
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:24/06/2019
*/
public class SnakeNLadder
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(SnakeNLadder.class.getName());
	
	/**
	*Reference Board class
	*/
	private Board board;
	
	/**
	*Reference Dice class
	*/
	private Dice dice;
	
	/**
	*Reference Player class
	*/
	private ArrayList<Player> players;
	
	/**
	*Reference Piece class
	*/
	private ArrayList<Piece> pieces;
	
	/**
	*This method is used to set the board
	*
	*@param board - the board to be set
	*/
	public void setBoard(Board board)
	{
		log.info("SnakeNLadder class...........setBoard..........start");
		this.board=board;
		log.info("SnakeNLadder class...........setBoard..........end");
	}
	
	/**
	*This method will return the board
	*
	*@return board
	*/
	public Board getBoard()
	{
		log.info("SnakeNLadder class...........getBoard..........start/end");
		return board;
	}
	
	/**
	*This method is used to set the dice
	*
	*@param dice - the dice to be set
	*/
	public void setDice(Dice dice)
	{
		log.info("SnakeNLadder class...........setDice..........start");
		this.dice=dice;
		log.info("SnakeNLadder class...........setDice..........end");
	}
	
	/**
	*This method will return the dice
	*
	*@return dice
	*/
	public Dice getDice()
	{
		log.info("SnakeNLadder class...........getDice..........start/end");
		return dice;
	}
	
	/**
	*This method is used to set an arraylist of players
	*
	*@param players - the players to be set
	*/
	public void setPlayers(ArrayList<Player> players)
	{
		log.info("SnakeNLadder class...........setPlayers..........start");
		this.players=players;
		log.info("SnakeNLadder class...........setPlayers..........end");
	}
	
	/**
	*This method will return the an arraylist of players
	*
	*@return players
	*/
	public ArrayList<Player> getPlayers()
	{
		log.info("SnakeNLadder class...........getPlayers..........start/end");
		return players;
	}
	
	/**
	*This method is used to set an arraylist of pieces
	*
	*@param pieces - the pieces to be set
	*/
	public void setPieces(ArrayList<Piece> pieces)
	{
		log.info("SnakeNLadder class...........setPieces..........start");
		this.pieces=pieces;
		log.info("SnakeNLadder class...........setPieces..........end");
	}
	
	/**
	*This method will return the an arraylist of pieces
	*
	*@return pieces
	*/
	public ArrayList<Piece> getPieces()
	{
		log.info("SnakeNLadder class...........getPieces..........start/end");
		return pieces;
	}
}