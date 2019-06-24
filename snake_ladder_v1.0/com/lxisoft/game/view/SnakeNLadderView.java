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
*Date Modified:24/06/2019
*/
public class SnakeNLadderView
{
	/**
	*Reference Logger class to get log messages
	*/
	private static final Logger log=Logger.getLogger(SnakeNLadderView.class.getName());
	
	public void createBoard()
	{
		// Board[][] cells=new Board[10][10]; 
		// for(int i=1;i<=10;i++)
		// {
			// for(int j=1;j<=10;j++)
			// {
				// w x=100;
				// cells[i][j]=x;
				// System.out.println(" ");
				// System.out.print("\t"+cells[i][j]);
				// x--;
			// }
			// System.out.println(" ");
			// System.out.println(" ");
		// }
		
		int[][] array=new int[10][10];
		int x=100;
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				
				for(int j=0;j<10;j++)
				{
				
					array[i][j]=x;
					System.out.print(" ");
					System.out.print("\t"+array[i][j]);
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
					array[i][j]=temp;
					System.out.print(" ");
					System.out.print("\t"+array[i][j]);
					temp++;
				}
				System.out.println(" ");
				System.out.println(" ");
			}
			
		}
		ArrayList<Cell> cells=new ArrayList<Cell>();
		Cell cell;
		for(int k=0;k<100;k++)
		{
			cells.add(cell=new Cell());
			cells.get(k).setCellNumber(k+1);
			
			// System.out.print(cells.get(k));
			
		}
		int count=0;
		for(int t=(cells.size())-1;t>=0;t--)
		{
			System.out.print("\t"+cells.get(t).getCellNumber());
			count++;
			if(count==10)
			{
				System.out.println(" ");
			}
		}
		
		
		
	}
}