package com;
import com.view.*;
import com.controller.PlayerController;
import com.view.BoardView;
public class Tdd
{
	public static void main(String []args) 
	{
		BoardView bview=new BoardView();
		bview.setGrid();
		PlayerController pc=new PlayerController();
		GameView gv=new GameView();
		gv.startGame();
	
		gv.setDice();
		
	
		
	}
}
