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
				cells.add(cell);
				m=j-1;
				}
				n=n-1;
			}
			System.out.println("\n");
		}
		//System.out.println(cells.size());
		/*int l=0;
		for(int p=0;p<cells.size();p++)
		{	
		System.out.print(cells.get(p).getNum()+"\t");
		l++;
		if(l==10){
		System.out.println("\n");
		l=0;
		}
		}*/
		setSnake(cells);
	}
	public void setSnake(ArrayList <Cell> cells)
	{
		for(int noOfSnake=1;noOfSnake<=3;noOfSnake++)
		{
		int n=noOfSnake;
		int cellNo1=(int)(Math.random()*100);
		int cellNo2=(int)(Math.random()*100);
		if(cellNo1!=cellNo2)
		{
		System.out.println(cellNo1);
		System.out.println(cellNo2);
		if(cellNo1>cellNo2)
		{
			int l=0;
			for(int p=0;p<cells.size();p++)
			{
			if(cellNo1==cells.get(p).getNum())
			{
				System.out.print(cells.get(p).getNum()+"H"+n+"\t");
				l++;
			}
			else if(cellNo2==cells.get(p).getNum())
			{
				System.out.print(cells.get(p).getNum()+"T"+n+"\t");
				l++;
			}
			else
			{
				System.out.print(cells.get(p).getNum()+"\t");
				l++;
			}
			if(l==10)
			{
				System.out.println("\n");
				l=0;
			}
			}	
		}
		else
		{
			int l=0;
			for(int p=0;p<cells.size();p++)
			{
			if(cellNo2==cells.get(p).getNum())
			{
				System.out.print(cells.get(p).getNum()+"H"+n+"\t");
				l++;
			}
			else if(cellNo1==cells.get(p).getNum())
			{
				System.out.print(cells.get(p).getNum()+"T"+n+"\t");
				l++;
			}
			else
			{
				System.out.print(cells.get(p).getNum()+"\t");
				l++;
			}
			if(l==10)
			{
				System.out.println("\n");
				l=0;
			}
			}	
		}
		}
		}	
		/*int l=0;
		int n=1;
		for(int p=0;p<cells.size();p++)
		{
		int cellNo1=(int)(Math.random()*100);
		int cellNo2=(int)(Math.random()*100);
		if(cellNo1!=cellNo2)
		{	
			if(cellNo1>cellNo2)
			{
				if(cellNo1==cells.get(p).getNum())
				{
					System.out.print(cells.get(p).getNum()+"H"+n+"\t");
					l++;
				}
				else if(cellNo2==cells.get(p).getNum())
				{
					System.out.print(cells.get(p).getNum()+"T"+n+"\t");
					l++;
				}
				else
				{
					System.out.print(cells.get(p).getNum()+"\t");
					l++;
				}
			}
			else
			{
				if(cellNo2==cells.get(p).getNum())
				{
					System.out.print(cells.get(p).getNum()+"H"+n+"\t");
					l++;
				}
				else if(cellNo1==cells.get(p).getNum())
				{
					System.out.print(cells.get(p).getNum()+"T"+n+"\t");
					l++;
				}
				else
				{
					System.out.print(cells.get(p).getNum()+"\t");
					l++;
				}
			}
			if(l==10)
			{
				System.out.println("\n");
				l=0;
			}
		}
		}*/
				
	}
	
}
	