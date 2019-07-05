package com.lxisoft.game.view;
import java.util.logging.*;
/**
*This class is used as a view class for Tdd
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:05/07/2019
*/
public class Tdd
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(Tdd.class.getName());
	
	public Tdd()
	{
		
	}
	
	/**
	*This is the main method 
	*
	*@param arg - the arguments to be passed
	*/
	public static void main(String[] arg)
	{
		SnakeNLadderView gameView=new SnakeNLadderView();
		gameView.startNewGame();
	}
}