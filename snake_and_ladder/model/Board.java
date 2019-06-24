package com.lxisoft.snake_and_ladder.model;
import com.lxisoft.snake_and_ladder.view.*;
public class Board
{
	CellView cellV;
	public void setBoard()
	{
		cellV=new CellView();
		cellV.setCell();
	}
	
}