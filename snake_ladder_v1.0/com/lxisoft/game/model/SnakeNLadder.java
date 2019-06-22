package com.lxisoft.game.model;
public class SnakeNLadder
{
	private Board board;
	private Dice dice;
	private ArrayList<Player> players;
	private ArrayList<Piece> pieces;
	
	public void setBoard(Board board)
	{
		this.board=board;
	}
	
	public Board getBoard()
	{
		return board;
	}
	
	public void setDice(Dice dice)
	{
		this.dice=dice;
	}
	
	public Dice getDice()
	{
		return dice;
	}
	
	public void setPlayers(ArrayList<Player> players)
	{
		this.players=players;
	}
	
	public ArrayList<Player> getPlayers()
	{
		return players;
	}
	
	public void setPieces(ArrayList<Piece> pieces)
	{
		this.pieces=pieces;
	}
	
	public ArrayList<Piece> getPieces()
	{
		return pieces;
	}
}