package com.lxisoft.snake_and_ladder.view;
import com.lxisoft.snake_and_ladder.controller.*;
import com.lxisoft.snake_and_ladder.model.*;
import java.util.*;
public class CellView
{
	CellController cellC;
	public CellView()
	{
		cellC=new CellController();
	}
	public void setCell(ArrayList <Cell> cells)
	{
		int n=100;
		for(int i=1;i<=10;i++)
		{ 
			int m=n;
			if(n%2==0)
			{
				for(int k=m;k>=n-9;k=k-1)
				{
				System.out.print(k+"\t");
				Cell cell=new Cell(k);
			//	cellC.cell.setNum(k);
			//	System.out.print(cellC.cell.ge+tNum());
				//cells.add(cellC.cell);
				cells.add(cell);
				m=k-1;
				}
				n=n-19;
			}
			else
			{
				for(int j=n;j<=n+9;j=j+1)
				{
				System.out.print(j+"\t");
				Cell cell=new Cell(j);
				//cellC.cell.setNum(j);
				//System.out.print(cellC.cell.getNum());
				//cells.add(cellC.cell);
				cells.add(cell);
				m=j-1;
				}
				n=n-1;
			}
			System.out.println("\n");
		}
		System.out.println(cells.size());
		/*for(int p=0;p<cells.size();p++)
		{
		System.out.println(cells.get(p).getNum());
		}*/
	}
}
	