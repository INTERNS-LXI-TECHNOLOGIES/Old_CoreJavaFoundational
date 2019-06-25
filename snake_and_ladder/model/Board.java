package com.lxisoft.snake_and_ladder.model;
import com.lxisoft.snake_and_ladder.view.*;
import java.util.*;
public class Board
{
	CellView cellV;
	ArrayList <Cell> cells;
	public Board()
	{
		cells=new ArrayList<Cell>();
	}
	public void setBoard()
	{
		cellV=new CellView();
		cellV.setCell(cells);
		System.out.println(cells.size());
		for(int p=0;p<cells.size();p++)
		{
		System.out.println(cells.get(p).getNum());
		}
	}
	
}