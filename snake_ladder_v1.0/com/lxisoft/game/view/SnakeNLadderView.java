package com.lxisoft.game.view;
import java.util.logging.*;
import java.util.*;
import com.lxisoft.game.model.*;
/**
*This class is used as a view class for SnakeNLadder
*
*@author AryaVineesh
*
*@version 1.0
*
*Date Modified:25/06/2019
*/
public class SnakeNLadderView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(SnakeNLadderView.class.getName());
	
	Board board;
	public void createBoard()
	{
		board=new Board();
		Cell[][] cellArray=new Cell[10][10];
		int x=100;
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				for(int j=0;j<10;j++)
				{
					
					cellArray[i][j]=new Cell();
					cellArray[i][j].setCellNumber(x);
					System.out.print(" ");
					System.out.print("\t"+cellArray[i][j].getCellNumber());
					x--;
				}
				x=x-10;
				System.out.println(" ");
				System.out.println(" ");
			}
			else
			{
				int temp=x+1;
				for(int j=0;j<10;j++)
				{
					cellArray[i][j]=new Cell();
					cellArray[i][j].setCellNumber(temp);
					System.out.print(" ");
					System.out.print("\t"+cellArray[i][j].getCellNumber());
					temp++;
				}
				System.out.println(" ");
				System.out.println(" ");
			}
		}
		board.setCells(cellArray);
		createSnakes(board);
		createLadder(board);
		createDice(board);
	}
	
	public void createSnakes(Board board)
	{
		ArrayList<Snake> snakes=new ArrayList<Snake>();
		for(int i=0;i<8;i++)
		{
			snakes.add(new Snake());
			int rand1=getRandomCellNumber(board);
			int rand2=getRandomCellNumber(board);
			if(rand1>rand2)
			{
				snakes.get(i).setHeadPosition(rand1);
				snakes.get(i).setTailPosition(rand2);
			}
			else
			{
				snakes.get(i).setHeadPosition(rand2);
				snakes.get(i).setTailPosition(rand1);
			}
			
			
			System.out.println(" "+snakes.get(i).getHeadPosition());
			System.out.println(" "+snakes.get(i).getTailPosition());
		}
		board.setSnakes(snakes);
	}
	
	public void createLadder(Board board)
	{
		ArrayList<Ladder> ladders=new ArrayList<Ladder>();
		for(int i=0;i<8;i++)
		{
			ladders.add(new Ladder());
			int rand1=getRandomCellNumber(board);
			int rand2=getRandomCellNumber(board);
			if(rand1<rand2)
			{
				ladders.get(i).setStartingPoint(rand1);
				ladders.get(i).setEndPoint(rand2);
			}
			else
			{
				ladders.get(i).setStartingPoint(rand2);
				ladders.get(i).setEndPoint(rand1);
			}
			
			
			System.out.println(" "+ladders.get(i).getStartingPoint());
			System.out.println(" "+ladders.get(i).getEndPoint());
		}
		board.setLadders(ladders);
	}
	
	public void createDice(Board board)
	{
		Dice dice=new Dice();
		
	}
	
	public int getRandomCellNumber(Board board)
	{
		int i=(int)(Math.random()*9);
		int j=(int)(Math.random()*9);
		Cell[][] cellArray=new Cell[10][10];
		cellArray=board.getCells();
		return cellArray[i][j].getCellNumber();
	}
	
	
}