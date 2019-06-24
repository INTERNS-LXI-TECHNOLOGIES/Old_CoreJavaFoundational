package com.lxisoft.snake_and_ladder.controller;
import com.lxisoft.snake_and_ladder.model.*;
public class GameController
{
	private Game game;
	public void setGame(Game game)
	{
		this.game=game;
	}
	public Game getGame()
	{
		return game;
	}
	public GameController()
	{
		game=new Game();
	}
}